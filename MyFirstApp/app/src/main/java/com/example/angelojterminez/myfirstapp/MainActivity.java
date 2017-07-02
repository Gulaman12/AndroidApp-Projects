package com.example.angelojterminez.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        EditText editText5 = (EditText) findViewById(R.id.editText5);
        String message = editText.getText().toString() + " had a little "+ editText2.getText().toString()
                + ", its fleece was " + editText3.getText().toString()+ " as " + editText4.getText().toString()
                + ". Everywhere that " + editText.getText().toString()+ " went, the " +
                editText2.getText().toString() + " was sure to " + editText5.getText().toString()+ ".";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
