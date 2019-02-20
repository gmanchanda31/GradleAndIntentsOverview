package com.example.learngradleandintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity{

    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://google.com");

//        Button buttonSubmit = findViewById(R.id.btn_submit);
//        buttonSubmit.setOnClickListener(this);
//        Button buttonHello = findViewById(R.id.btn_hello);
//        buttonHello.setOnClickListener(this);

        Toast.makeText(LoginActivity.this, "Hey, I am a toast!", Toast.LENGTH_LONG).show();


//        buttonSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onClick: ");
//            }
//        });

//        buttonHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
        Intent cameraIntent = new Intent(LoginActivity.this, CameraActivity.class);
        cameraIntent.putExtra("calledFrom", "Login");
        startActivity(cameraIntent);
    }

//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.btn_hello){
//
//        } else if (v.getId() == R.id.btn_submit) {
//
//        }
//    }

    //    public void submit(View view) {
//    }

}
