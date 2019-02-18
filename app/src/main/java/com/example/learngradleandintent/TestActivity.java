package com.example.learngradleandintent;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = TestActivity.class.getSimpleName();

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences preferences = getSharedPreferences("Gourav", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("isFirstTimeUser", true);
        editor.commit();

        boolean isFirstTimeUser = preferences.getBoolean("isFirstTimeUser", true);
        if (isFirstTimeUser) {
            Intent intent = new Intent(TestActivity.this, LoginActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(TestActivity.this, MainActivity.class);
            startActivity(intent);
        }

        final TextView loremIpsumTextView = findViewById(R.id.text_loremIpsum);
        final TextView phoneNumberTextView = findViewById(R.id.text_phoneNumber);
        ImageView shareImage = findViewById(R.id.ic_share);
        ImageView dialImage = findViewById(R.id.ic_dial);
        ImageView cameraImage = findViewById(R.id.ic_camera);

        shareImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Share Lorem Ipsum Text");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, loremIpsumTextView.getText().toString().trim());
                startActivity(sharingIntent);
            }
        });

        dialImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClickDial Image: ");
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + phoneNumberTextView.getText().toString().trim()));
                startActivity(intent);

            }
        });

        cameraImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
