package  com.betterfuture.app.account.ui.login

import android.app.Activity
import com.example.tsetcentral.bean.LoginBean
import com.example.tsetcentral.ui.LoginModle
import com.mobile.centaur.base.BaseModel
import com.mobile.centaur.base.BasePresenter
import com.mobile.centaur.network.ApiException

/**
 * Created by zhangzhenzhong
 * Date: 2020/10/28
 * Time: 20:20
 * Descriptions：
 */
class LoginPresenter : BasePresenter<LoginContract.IView>(), LoginContract.IPresenter {
    var loginModle = LoginModle()

    override fun getThirdLoginData(
        activity: Activity,
        unionid: String,
        info_type: String
    ) {
        loginModle.getLoginData(
            activity,
            unionid,
            info_type,
            object : BaseModel.InfoCallBack<LoginBean> {
                override fun successInfo(data: LoginBean) {
                    iView.getThirdDataSuccess(data)
                }

                override fun failThrowable(t: Throwable?) {
                    if (t is ApiException) {
                        iView.getThirdDataFail(t)
                    }
                }

            })
    }
}