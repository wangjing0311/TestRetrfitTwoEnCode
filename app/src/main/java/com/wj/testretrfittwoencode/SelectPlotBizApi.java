package com.wj.testretrfittwoencode;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by wangjing on 2016/7/5.
 */
public interface SelectPlotBizApi {

    @GET("/users/{username}")
    Call<User> getUser(@Path("username") String username);
}
