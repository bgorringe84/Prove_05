package com.example.prove05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "com.example.prove05.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        //debug log statement
        Log.d(TAG, String.format("Creating intent with %s %s:%s", findViewById(R.id.editText), findViewById(R.id.editText2), findViewById(R.id.editText3)));

        //create the intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        //convert the book to a string
        EditText editText1 = (EditText) findViewById(R.id.editText);
        String bookSent = editText1.getText().toString();
        intent.putExtra("Book", bookSent);

        //convert the chapter to a string
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String chapterSent = editText2.getText().toString();
        intent.putExtra("Chapter", chapterSent);

        //convert the verse to a string
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String verseSent = editText3.getText().toString();
        intent.putExtra("Verse", verseSent);

        startActivity(intent);
    }
}
