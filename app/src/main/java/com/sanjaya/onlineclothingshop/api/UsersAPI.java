package com.sanjaya.onlineclothingshop.api;

import com.sanjaya.onlineclothingshop.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UsersAPI {

    @GET("api/users")
    Call<List<User>> getUsers();

    @FormUrlEncoded
    @POST("api/users")
    Call<Void> registerUser(
            @Field("userFname") String userFname,
            @Field("userLname") String userLname,
            @Field("username") String username,
            @Field("password") String password
    );
}
