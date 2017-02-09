package com.example.ahurwitz.adapterexercise.Network;


import com.example.ahurwitz.adapterexercise.Model;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by ahurwitz on 1/24/17.
 */

public interface Service {

    @GET("public-api/v0/courses")
    Observable<Model> getData();

}
