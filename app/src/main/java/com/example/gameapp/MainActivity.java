package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    int counter =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allBtn();

    }

    public void allBtn(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        final Intent intent=new Intent(MainActivity.this,Second_activity.class);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                intent.putExtra("counter",counter);
                startActivity(intent);



            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter++;
                intent.putExtra("counter",counter);
                startActivity(intent);
                finish();//by doing this the value of counter will not increament

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("counter",counter);
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                intent.putExtra("counter",counter);
                startActivity(intent);

            }
        });





    }




}
