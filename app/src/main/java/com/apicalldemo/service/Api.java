package com.apicalldemo.service;

import com.apicalldemo.model.UserListData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://dummyjson.com/";
    @GET("users")
    Call<UserListData> getUserList();
}
