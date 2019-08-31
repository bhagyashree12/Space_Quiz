package com.example.gameapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Four_Activity extends AppCompatActivity {

    Button fourbtn1;
    Button fourbtn2;
    Button fourbtn3;
    Button fourbtn4;
    int counter4 =0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        int intValue=getIntent().getIntExtra("counter3",0);
        allbtn(intValue);

    }

    public void allbtn(final int intValue){
        fourbtn1=findViewById(R.id.fourbtn1);
        fourbtn2=findViewById(R.id.fourbtn2);
        fourbtn3=findViewById(R.id.fourbtn3);
        fourbtn4=findViewById(R.id.fourbtn4);

        final Intent intent=new Intent(Four_Activity.this,Final_Activity.class);


        fourbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(intValue==0||intValue==1||intValue==2||intValue==3){
                    counter4=counter4+intValue;
                }
                counter4++;
                intent.putExtra("counter4",counter4);
                startActivity(intent);
                finish();


            }
        });
        fourbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(intValue==0||intValue==1||intValue==2||intValue==3){
                    counter4=counter4+intValue;
                }
                intent.putExtra("counter4",counter4);
                startActivity(intent);


            }
        });fourbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(intValue==0||intValue==1||intValue==2||intValue==3){
                    counter4=counter4+intValue;
                }

                intent.putExtra("counter4",counter4);

                startActivity(intent);



            }
        });
        fourbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(intValue==0||intValue==1||intValue==2||intValue==3){
                    counter4=counter4+intValue;
                }

                intent.putExtra("counter4",counter4);
                startActivity(intent);


            }
        });
    }

    }


