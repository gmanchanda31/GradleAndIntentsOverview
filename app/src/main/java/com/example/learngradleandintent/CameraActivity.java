package com.example.learngradleandintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CameraActivity extends AppCompatActivity {

    private static final String TAG = "CameraActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        Intent intent = getIntent();

//        if (getIntent().getExtras().getString("calledFrom").equals("Main")) {
//
//        } else if (getIntent().getExtras().getString("calledFrom").equals("Login")) {
//
//        } else {
//
//        }
//
//        Bundle superbundle = intent.getExtras();
//
//        Bundle bundle = superbundle.getBundle("bundle");
//        Bundle bundle1 = superbundle.getBundle("bundle1");
//
//        String name = bundle.getString("name");
//        int rollnumber = bundle.getInt("rollnumber");
//
//        Log.d(TAG, name + "  " + rollnumber);
//
//        String sumOfStrings = name + " " + rollnumber;
//
//        Intent sendingDataBack = new Intent();
//        sendingDataBack.putExtra("result", sumOfStrings);
//        setResult(RESULT_OK, sendingDataBack);
    }
}