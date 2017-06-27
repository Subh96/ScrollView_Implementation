package com.example.abhi.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Length.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Weight.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });

        Button btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Temperature.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn4= (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Speed.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn5= (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Speed.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn6= (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Pressure.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn7= (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Time.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Volume.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });

        Button btn9= (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Volume.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });
        Button btn10= (Button) findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Mass.class);
                i.putExtra("MakeitZero",backpreesed);
                startActivity(i);
            }
        });

    }
    long backpreesed=0;
    @Override
    public void onBackPressed(){
        backpreesed+=1;
        if(backpreesed==1){
            Toast.makeText(getApplicationContext(),"Press Back Again To exit",Toast.LENGTH_SHORT).show();
        }
        else{
            MainActivity.super.onBackPressed();
        }
    }
}
