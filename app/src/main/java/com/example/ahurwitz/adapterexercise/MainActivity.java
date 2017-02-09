package com.example.ahurwitz.adapterexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

//todo: Instructions
// Build a working Adapter with the data returned in the method 'getData()' of the MainActivity class.
// Create two unique views with the text or image content provided in the Adapter
// (ie: alternate view types, header, footer...)

public class MainActivity
        extends AppCompatActivity
        implements MainViewModel.MainView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MainViewModel(this).makeNetworkCall();
    }

    @Override
    public void getData(ArrayList<Model.Course> data) {
        Log.d(MainActivity.class.getSimpleName(), "Number of courses returned: " + data.size());
    }
}
