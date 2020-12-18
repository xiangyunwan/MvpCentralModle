package  com.betterfuture.app.account.ui.login

import android.app.Activity
import com.example.tsetcentral.bean.LoginBean
import com.mobile.centaur.base.IBaseView
import com.mobile.centaur.network.ApiException

/**
 * Created by zhangzhenzhong
 * Date: 2020/10/28
 * Time: 19:44
 * Descriptions：
 */
open class LoginContract {
    interface IView : IBaseView {
        fun getThirdDataSuccess(loginBean: LoginBean)
        fun getThirdDataFail(exception: ApiException)
    }

    interface IPresenter {
        fun getThirdLoginData(
            activity: Activity,
            unionid: String,
            info_type: String
        );
    }
}