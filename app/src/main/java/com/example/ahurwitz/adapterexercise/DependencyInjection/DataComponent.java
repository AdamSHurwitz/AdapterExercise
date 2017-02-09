package com.example.ahurwitz.adapterexercise.DependencyInjection;


import com.example.ahurwitz.adapterexercise.AdapterExerciseApplication;
import com.example.ahurwitz.adapterexercise.MainViewModel;
import com.example.ahurwitz.adapterexercise.Network.Repository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ahurwitz on 1/24/17.
 */

@Singleton
@Component(modules={DataModule.class})

public interface DataComponent {

    void inject(AdapterExerciseApplication adapterExerciseApplication);

    void inject(Repository repository);

    void inject(MainViewModel mainViewModel);
}
