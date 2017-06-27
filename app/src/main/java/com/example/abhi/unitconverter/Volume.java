package com.example.abhi.unitconverter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
    }
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this).setTitle("Want to go back").setMessage("For going Back to Mainpage Press yes")
                .setNegativeButton("No",null)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Volume.super.onBackPressed();
                    }
                }).create().show();
    }
}
