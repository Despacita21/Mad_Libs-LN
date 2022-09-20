package com.example.mad_libs_ln;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public static final String EXTRA_MESSAGE = "null";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view)
    {

        Intent intent = new Intent(this, Story.class);
        EditText[] editTexts = new EditText[9];
        editTexts[0] = findViewById(R.id.userInput1);
        editTexts[1] = findViewById(R.id.userInput2);
        editTexts[2] = findViewById(R.id.userInput3);
        editTexts[3] = findViewById(R.id.userInput4);
        editTexts[4] = findViewById(R.id.userInput5);
        editTexts[5] = findViewById(R.id.userInput6);
        editTexts[6] = findViewById(R.id.userInput7);
        editTexts[7] = findViewById(R.id.userInput8);
        editTexts[8] = findViewById(R.id.userInput9);

        for (int i = 0; i < editTexts.length; i++)
        {
            if(editTexts[i].getText().toString().equals(""))
            {
                editTexts[i].setError("Required Field");
                return;
            }
        }

        String[] messages = new String[9];
        for (int i = 0; i < messages.length; i++)
        {
            messages[i] = editTexts[i].getText().toString();
        }
        intent.putExtra(EXTRA_MESSAGE, messages);
        startActivity(intent);
    }



}


