package com.xproject.eightstudio.x_project.general;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface Projects {
    @FormUrlEncoded
    @POST("/projects.php")
    Call<ResponseBody> performPostCall(@FieldMap HashMap<String, String> postDataParams);

    @GET("/projects.php")
    Call<ResponseBody> performGetCall(@QueryMap HashMap<String, String> getDataParams);
}