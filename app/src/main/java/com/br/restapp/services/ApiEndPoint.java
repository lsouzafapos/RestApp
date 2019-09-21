package com.br.restapp.services;


import com.br.restapp.entities.Post;
import com.br.restapp.entities.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoint {

    @GET("users")
    Call<List<User>> obterUsuarios();

    @POST("posts")
    Call<Post> createPost(@Body Post post);

}

