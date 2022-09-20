package com.example.mad_libs_ln;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String[] messages = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView1 = findViewById(R.id.textView51);
        TextView textView2 = findViewById(R.id.textView52);
        TextView textView3 = findViewById(R.id.textView53);
        TextView textView4 = findViewById(R.id.textView54);
        TextView textView5 = findViewById(R.id.textView55);
        TextView textView6 = findViewById(R.id.textView56);
        TextView textView7 = findViewById(R.id.textView57);
        TextView textView8 = findViewById(R.id.textView58);
        TextView textView9 = findViewById(R.id.textView59);
        TextView textView10 = findViewById(R.id.textView60);
        TextView textView11 = findViewById(R.id.textView61);
        TextView textView12 = findViewById(R.id.textView62);
        TextView textView13 = findViewById(R.id.textView63);
        TextView textView14 = findViewById(R.id.textView64);
        TextView textView15 = findViewById(R.id.textView65);
        TextView textView16 = findViewById(R.id.textView66);
        TextView textView17 = findViewById(R.id.textView67);
        TextView textView18 = findViewById(R.id.textView68);
        TextView textView19 = findViewById(R.id.textView69);
        TextView textView20 = findViewById(R.id.textView70);
        TextView textView21 = findViewById(R.id.textView71);
        TextView textView22 = findViewById(R.id.textView72);
        TextView textView23 = findViewById(R.id.textView73);
        TextView textView24 = findViewById(R.id.textView74);
        TextView textView25 = findViewById(R.id.textView75);
        TextView textView26 = findViewById(R.id.textView76);
        TextView textView27 = findViewById(R.id.textView77);
        TextView textView28 = findViewById(R.id.textView78);
        TextView textView29 = findViewById(R.id.textView79);
        TextView textView30 = findViewById(R.id.textView80);
        TextView textView31 = findViewById(R.id.textView81);
        TextView textView32 = findViewById(R.id.textView82);
        TextView textView33 = findViewById(R.id.textView83);
        TextView textView34 = findViewById(R.id.textView84);
        TextView textView35 = findViewById(R.id.textView85);
        TextView textView36 = findViewById(R.id.textView86);
        TextView textView37 = findViewById(R.id.textView87);
        TextView textView38 = findViewById(R.id.textView88);
        TextView textView39 = findViewById(R.id.textView89);
        TextView textView40 = findViewById(R.id.textView90);


        textView1.setText(messages[0]);  //male name
        textView2.setText(messages[1]);  //another male name
        textView3.setText(messages[1]);
        textView4.setText(messages[0]);
        textView5.setText(messages[2]);  //an activity
        textView6.setText(messages[1]);
        textView7.setText(messages[0]);
        textView8.setText(messages[0]);
        textView9.setText(messages[3]);  //adj1
        textView10.setText(messages[4]); //pl. noun
        textView11.setText(messages[1]);
        textView12.setText(messages[0]);
        textView13.setText(messages[0]);
        textView14.setText(messages[3]);
        textView15.setText(messages[4]);
        textView16.setText(messages[1]);
        textView17.setText(messages[0]);
        textView18.setText(messages[3]);
        textView19.setText(messages[4]);
        textView20.setText(messages[1]);
        textView21.setText(messages[1]);
        textView22.setText(messages[0]);
        textView23.setText(messages[1]);
        textView24.setText(messages[0]);
        textView25.setText(messages[5]); //flavor1
        textView26.setText(messages[6]); //flavor2
        textView27.setText(messages[7]); //flavor3
        textView28.setText(messages[1]);
        textView29.setText(messages[0]);
        textView30.setText(messages[0]);
        textView31.setText(messages[1]);
        textView32.setText(messages[0]);
        textView33.setText(messages[8]); //Any name
        textView34.setText(messages[1]);
        textView35.setText(messages[0]);
        textView36.setText(messages[3]);
        textView37.setText(messages[4]);
        textView38.setText(messages[8]);
        textView39.setText(messages[0]);
        textView40.setText(messages[1]);


    }
}