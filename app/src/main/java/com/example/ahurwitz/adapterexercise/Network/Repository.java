package com.example.ahurwitz.adapterexercise.Network;

import com.example.ahurwitz.adapterexercise.AdapterExerciseApplication;
import com.example.ahurwitz.adapterexercise.Model;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by ahurwitz on 1/24/17.
 */

public class Repository {

    @Inject
    Service service;

    public Repository() {

        AdapterExerciseApplication.getApp().getDataComponent().inject(this);

    }

    public Observable<Model> getNetworkItems(){

        return service.getData();

    }

}
