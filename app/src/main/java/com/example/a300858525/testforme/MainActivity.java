package com.example.a300858525.testforme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkIos, chkAndroid, chkWindows;
    private Button btnDisplay;
    Intent intent;
    String stocks="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       // addListenerOnChkIos();
        addListenerOnButton();
    }

//    public void addListenerOnChkIos() {
//
//        chkIos = (CheckBox) findViewById(R.id.chkIos);
//
//        chkIos.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                //is chkIos checked?
//                if (((CheckBox) v).isChecked()) {
//                    Toast.makeText(MainActivity.this,
//                            "Bro, try Android :)", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        });
//
//    }

    public void addListenerOnButton() {

        chkIos = (CheckBox) findViewById(R.id.chkIos);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindows = (CheckBox) findViewById(R.id.chkWindows);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);


        btnDisplay.setOnClickListener(new View.OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {
                if(chkIos.isChecked())
                {
                    stocks+="ios,";
                }
                if(chkAndroid.isChecked())
                {
                    stocks+="android,";
                }
                if(chkWindows.isChecked())
                {
                    stocks+="windows";
                }

                intent = new Intent(getBaseContext(), PlotActivity.class);
                intent.putExtra("EXTRA_SESSION_ID", stocks);
                startActivity(intent);

            }
        });

    }
}
