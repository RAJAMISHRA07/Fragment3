package com.example.admin.fragment3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //define a method in activity 1 in string parameter
    public  void passData(String city){
        //pass data to second activity
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("city",city);
        startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
