package com.example.gameapp;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final_Activity extends AppCompatActivity {


    TextView txt1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

      //  Intent intent=getIntent();
        //int intValue=intent.getIntExtra("counter",0);

       int intValue=getIntent().getIntExtra("counter4",0);


       // Bundle exBundle= getIntent().getExtras();
        //int intValue= exBundle.getInt("counter");

      //  int value=getIntent().getIntExtra("counter",0);

        txt1=findViewById(R.id.textView4);
        if (intValue == 0){
            txt1.setText("0");
        }

        else
        {

            txt1.setText(""+intValue);
           // txt1.setText(Integer.toString(intValue));
        }
        }
    }

