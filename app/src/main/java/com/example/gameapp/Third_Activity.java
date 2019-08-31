package com.example.gameapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Third_Activity extends AppCompatActivity {


    Button thibtn1;
    Button thibtn2;
    Button thibtn3;
    Button thibtn4;
    int counter3 =0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        int intValue=getIntent().getIntExtra("counter2",0);
        allbtn(intValue);

    }

    public void allbtn(final int intValue){
        thibtn1=findViewById(R.id.thibtn1);
        thibtn2=findViewById(R.id.thibtn2);
        thibtn3=findViewById(R.id.thibtn3);
        thibtn4=findViewById(R.id.thibtn4);

       final Intent intent=new Intent(Third_Activity.this,Four_Activity.class);


        thibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(intValue==0||intValue==1||intValue==2){
                    counter3=counter3+intValue;
                }
                intent.putExtra("counter3",counter3);
                startActivity(intent);



            }
        });
        thibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(intValue==0||intValue==1||intValue==2){
                    counter3=counter3+intValue;
                }
                intent.putExtra("counter3",counter3);
                startActivity(intent);


            }
        });thibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(intValue==0||intValue==1||intValue==2){
                    counter3=counter3+intValue;
                }

                intent.putExtra("counter3",counter3);

                startActivity(intent);



            }
        });
        thibtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(intValue==0||intValue==1||intValue==2){
                    counter3=counter3+intValue;
                }
                counter3++;
                intent.putExtra("counter3",counter3);
                startActivity(intent);
                finish();



            }
        });
    }
}
