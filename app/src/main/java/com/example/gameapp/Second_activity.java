package com.example.gameapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Second_activity extends AppCompatActivity {

    Button secbtn1;
    Button secbtn2;
    Button secbtn3;
    Button secbtn4;
    int counter2 =0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int intValue=getIntent().getIntExtra("counter",0);
        allSecbtn(intValue);




    }



    public void allSecbtn(final int intValue){


        secbtn1=findViewById(R.id.secbtn1);
        secbtn2=findViewById(R.id.secbtn2);
        secbtn3=findViewById(R.id.secbtn3);
        secbtn4=findViewById(R.id.secbtn4);

    final Intent intent=new Intent(Second_activity.this,Third_Activity.class);


        secbtn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            if(intValue==0||intValue==1){
                counter2=counter2+intValue;
            }
            intent.putExtra("counter2",counter2);
            startActivity(intent);


        }
    });
        secbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(intValue==0||intValue==1){
                    counter2=counter2+intValue;
                }
                intent.putExtra("counter2",counter2);
                startActivity(intent);



            }
        });secbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(intValue==0||intValue==1){
                    counter2=counter2+intValue;
                }
                counter2++;
                intent.putExtra("counter2",counter2);

                startActivity(intent);
                finish();


            }
        });
        secbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(intValue==0||intValue==1){
                    counter2=counter2+intValue;
                }
                intent.putExtra("counter2",counter2);
                startActivity(intent);



            }
        });
}}
