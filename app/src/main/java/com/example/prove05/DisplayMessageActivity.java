package com.example.prove05;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    public static final String TAG = "ReceiveIntent";

    private String bookRecieved;
    private String chapterRecieved;
    private String verseRecieved;
    private String scripture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        bookRecieved = intent.getStringExtra("Book");
        chapterRecieved = intent.getStringExtra("Chapter");
        verseRecieved = intent.getStringExtra("Verse");

        // create the scripture in the correct format
        scripture = bookRecieved + " " + chapterRecieved + ":" + verseRecieved;

        //log statement
        Log.d(TAG, "Received intent with scripture " + scripture );

        //Capture the layout's TextView and set the string as its text
        TextView textview = findViewById(R.id.textView);
        textview.setText(scripture);
    }
}
