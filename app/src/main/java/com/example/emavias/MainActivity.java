package com.example.emavias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Runnable mRunnable;
        Handler mHandler=new Handler();

        mRunnable=new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                LinearLayout.setVisibility(View.GONE); //This will remove the View. and free s the space occupied by the View
            }
        };

        mHandler.postDelayed(mRunnable,10*1000);*/
    }
}
