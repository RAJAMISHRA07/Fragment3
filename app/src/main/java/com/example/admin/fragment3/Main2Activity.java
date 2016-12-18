package com.example.admin.fragment3;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.admin.fragment3.R.id.frag2;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //read city name coming from main activity
        Intent intent=getIntent();
        Bundle bn=intent.getExtras();
        String city=bn.getString("city");
        //code for fragment
        FragmentManager fragmentManager=getSupportFragmentManager();
        F2 f2=(F2) fragmentManager.findFragmentById(frag2);
        if (f2!=null){
            f2.catchData(city);
        }
    }
}
