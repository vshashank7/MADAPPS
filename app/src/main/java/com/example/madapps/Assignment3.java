package com.example.madapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Assignment3 extends AppCompatActivity {
    Button btn;
    Boolean flag;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);
        btn=(Button)findViewById(R.id.btn);
        img=(ImageView)findViewById(R.id.img);
        flag=false;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==false){
                    img.setImageResource(R.drawable.pic2);
                    flag=true;
                }else{
                    img.setImageResource(R.drawable.pic1);
                    flag=false;
                }
            }
        });
    }
}
