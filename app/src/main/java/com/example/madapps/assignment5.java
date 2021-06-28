package com.example.madapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class assignment5 extends AppCompatActivity {
        Button btn1,btn2,btn3;
        ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment5);
        imgv=(ImageView)findViewById(R.id.img);
        btn1=(Button)findViewById(R.id.fade);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                imgv.startAnimation(animation);
            }
        });


        btn2=(Button)findViewById(R.id.move);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                imgv.startAnimation(animation);

            }
        });



        btn3=(Button)findViewById(R.id.rotate);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
                imgv.startAnimation(animation);

            }
        });






    }
}
