package com.example.madapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class assignment4 extends AppCompatActivity {

    Button btn;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4);
        btn=(Button)findViewById(R.id.btn);
        edt=(EditText)findViewById(R.id.edt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=edt.getText().toString();
                Double d=Double.parseDouble(str);
                d*=71.68;
                Intent intent=new Intent(getApplicationContext(),rupeeactivity.class);
                intent.putExtra("Value1",Double.toString(d));
                startActivity(intent);
            }
        });
    }
}
