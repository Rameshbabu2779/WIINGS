package com.example.ramesh.wiings.Classes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.ramesh.wiings.R;

/**
 * Created by Ram on 12-07-2017.
 */

public class WII_SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wii_splash_screen);


        Thread aThread=new Thread(){

            @Override
            public void run() {
                super.run();

                try {

                    sleep(5*1000);

                    Intent aIntent=new Intent(WII_SplashScreenActivity.this,MainActivity.class);

                    startActivity(aIntent);

                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };

       aThread.start();


    }



}
