package  com.example.tsetcentral.ui

import android.app.Activity
import com.example.tsetcentral.base.MyConstants.THIRDLOGIN_URL
import com.example.tsetcentral.base.WnkBaseModle
import com.example.tsetcentral.bean.LoginBean
import com.mobile.centaur.network.ApiException
import com.mobile.centaur.network.RxSubscriber
import com.mobile.centaur.network.RxUtils
import java.util.HashMap

/**
 * Created by zhangzhenzhong
 * Date: 2020/10/28
 * Time: 19:47
 * Descriptions：
 */
class LoginModle : WnkBaseModle() {

    fun getLoginData(
        activity: Activity,
        unionid: String,
        info_type: String,
        callBack: InfoCallBack<LoginBean>
    ) {
        val queryMap = HashMap<String, String>()
        queryMap.put("unionid", unionid)
        queryMap.put("info_type", info_type)
        apiService!!.getThirdLoginData(queryMap!!)
            .compose(RxUtils.rxSchedulerHelper())
            .compose(RxUtils.handleResult())
            .subscribeWith(object : RxSubscriber<LoginBean>(activity) {
                override fun onNext(loginBean: LoginBean) {
                    super.onNext(loginBean)
                    callBack.successInfo(loginBean)
                }

                override fun onError(t: Throwable?) {
                    super.onError(t)
                    if (t!! is ApiException) {
                        callBack.failThrowable(t)
                    }
                }
            })
    }


}