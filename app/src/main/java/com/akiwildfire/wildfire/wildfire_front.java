package com.akiwildfire.wildfire;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class wildfire_front extends AppCompatActivity {
  private int splash_Time = 4000 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_wildfire_front);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent james = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity( james);
                finish();
            }
        },splash_Time);
    }
}
