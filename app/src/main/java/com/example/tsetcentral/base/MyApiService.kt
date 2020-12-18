package com.example.tsetcentral.base

import com.example.tsetcentral.bean.LoginBean
import com.mobile.centaur.network.BaseResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.*
import java.util.*

//import io.reactivex.Flowable;
interface MyApiService {

    /**
     * 请求接口
     *
     * @param queryMap
     * @return
     */
//    @FormUrlEncoded
    @POST(MyConstants.THIRDLOGIN_URL)
    fun getThirdLoginData(@QueryMap queryMap: Map<String, String>?): Flowable<BaseResponse<LoginBean?>?>
}