package com.example.princess.andelachallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Mrs Azubine on 8/28/2017.
 */

public class splash extends AppCompatActivity {
    //the object for the splash
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = (ImageView) findViewById(R.id.logo);

        //Loading the animation
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        //Starting of the animation
        img.startAnimation(myanim);
        //Explicit intent
        final Intent i = new Intent (this,MainActivity.class);

        Thread timer = new Thread (){
           public void run () {
             try {
                 sleep(5000);
             } catch (InterruptedException e) {
                e.printStackTrace();
             }
             finally {
                 startActivity(i);
                 finish();
             }
           }
        };
        timer.start();
    }
}
