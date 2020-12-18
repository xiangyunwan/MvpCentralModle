package com.example.tsetcentral.ui

import android.os.Bundle
import com.betterfuture.app.account.ui.login.LoginContract
import com.betterfuture.app.account.ui.login.LoginPresenter
import com.example.tsetcentral.R
import com.example.tsetcentral.bean.LoginBean
import com.mobile.centaur.base.BaseActivity
import com.mobile.centaur.network.ApiException

class MainActivity : BaseActivity<LoginPresenter>(), LoginContract.IView{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun initPresenter(): LoginPresenter {
        return LoginPresenter()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
    }

    override fun initListener() {
    }

    override fun initData() {
        mPresenter.getThirdLoginData(this,"aa","bb")
    }

    override fun getThirdDataSuccess(loginBean: LoginBean) {
        TODO("Not yet implemented")
    }

    override fun getThirdDataFail(exception: ApiException) {
        TODO("Not yet implemented")
    }
}