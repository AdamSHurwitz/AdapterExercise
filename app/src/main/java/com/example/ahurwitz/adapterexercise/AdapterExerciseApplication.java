package com.example.ahurwitz.adapterexercise;

import android.app.Application;

import com.example.ahurwitz.adapterexercise.DependencyInjection.DaggerDataComponent;
import com.example.ahurwitz.adapterexercise.DependencyInjection.DataComponent;
import com.example.ahurwitz.adapterexercise.DependencyInjection.DataModule;


/**
 * Created by ahurwitz on 1/23/17.
 */

public class AdapterExerciseApplication extends Application {

    private static AdapterExerciseApplication app;
    DataComponent dataComponent;

    public static AdapterExerciseApplication getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;

        initDataComponent();

        dataComponent.inject(this);
    }

    private void initDataComponent(){
        dataComponent = DaggerDataComponent.builder()
                .dataModule(new DataModule(this))
                .build();
    }

    public DataComponent getDataComponent() {
        return dataComponent;
    }
}
