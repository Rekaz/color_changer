package com.example.rekazmuddassir.humanoid;

import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    public static int i = 2700;
    Button play;

    //ImageView imageView = (ImageView)findViewById(R.id.imageV);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageV);
        play = (Button)findViewById(R.id.buttonplay);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //ImageView imageView = (ImageView)findViewById(R.id.imageV);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageResource(R.drawable.image222);
                    }
                });

            }

        };
        Timer timer = new Timer();

            // Timer timer =new Timer();
            timer.schedule(timerTask, i);


        //for (int i= 1;i<=10;i++)



    }
    public void play (View view)
    {   Timer timer = new Timer();
        i = i + 1900;
        if (i > 15000) {
            i = 3300;

        }
        // Timer timer =new Timer();
        //timer.schedule(timerTask, i);
        imageView.setImageResource(R.drawable.img111);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //ImageView imageView = (ImageView)findViewById(R.id.imageV);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageResource(R.drawable.image222);
                    }
                });

            }

        };
        timer.schedule(timerTask, i);
    }

    public void escape (View view)
    {
        System.exit(0);
    }

}
