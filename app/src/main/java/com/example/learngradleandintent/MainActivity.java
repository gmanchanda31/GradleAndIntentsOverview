package com.example.learngradleandintent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private final int RC_CAMERA = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        Button clickMeButton = findViewById(R.id.btn_clickMe);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // example of an explicit intent
                Log.d(TAG, "this statement will be printed");
                Intent cameraIntent = new Intent(MainActivity.this, CameraActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name", "Gourav");
                bundle.putInt("rollnumber", 46);

                Bundle bundle1 = new Bundle();
                bundle1.putInt("rollnumber", 46);
                bundle1.putString("name", "Gourav");

                cameraIntent.putExtra("bundle", bundle);
                cameraIntent.putExtra("bundle1", bundle1);
                cameraIntent.putExtra("calledFrom", "Main");
                startActivityForResult(cameraIntent, RC_CAMERA);
            }
        });

        Bundle b = new Bundle();
        b.putInt("rollnumber", 49);
        b.putString("username", "Gourav Manchanda");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        switch (requestCode) {
            case RC_CAMERA:
            if (resultCode == RESULT_OK) {
                try {
                    String result = data.getExtras().getString("sumOfStrings");
                    Log.d(TAG, "onActivityResult: "+ result.concat("s"));
                    Log.d(TAG, "onActivityResult: ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;


        }


        Log.d(TAG, "onActivityResult: "+ data.getExtras().getString("result"));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Log.d(TAG, "onOptionsItemSelected: "+ "Logout");
                break;
                default:
                    Log.d(TAG, "onOptionsItemSelected: ");
        }
        return false;
    }
}
