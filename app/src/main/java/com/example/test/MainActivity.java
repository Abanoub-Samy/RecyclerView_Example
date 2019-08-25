package com.example.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    ArrayList<Integer> arr_id ;
    ArrayList<String> arr_title ;
    ArrayList<String> arr_body  ;
    RecycleModel recycleModel ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        arr_id = new ArrayList<>();
        arr_title = new ArrayList<>();
        arr_body  = new ArrayList<>();
        for (int i=0;i<20;i++){
            arr_id.add(i);
            arr_title.add("ahmed "+i);
            arr_body.add("gohn "+i);
        }

        recycleModel = new RecycleModel(arr_id,arr_title,arr_body);

        initRecyclerView();


    }



    private void initRecyclerView(){
        Log.e(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter( this ,recycleModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}






















