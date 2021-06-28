package com.example.madapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class rupeeactivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupeeactivity);
        txt=(TextView)findViewById(R.id.txt1);
        Bundle extra=getIntent().getExtras();
        String str=extra.getString("Value1");
        txt.setText(str);
    }
}
