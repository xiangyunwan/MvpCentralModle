package com.mobile.centaur.base;


public class BaseModel {
    //TODO
    //这个地方在业务层要在 继承一次， 实例化apiservice
//    protected static ApiService apiService;

    //初始化httpService
//    static {
//        apiService = NetWorkManager.getInstance().getApiService();
//    }

    public interface InfoCallBack<T> {
        void successInfo(T data);

//        void failInfo(String message, int errCord);

        void failThrowable(Throwable t);
    }

}
