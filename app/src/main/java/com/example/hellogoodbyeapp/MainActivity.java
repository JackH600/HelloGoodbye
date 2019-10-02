package com.example.hellogoodbyeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isHello;
    private TextView greetingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingTextView = (TextView)findViewById(R.id.textView);
        isHello = true;
    }

    public void sayGreeting(View v)
    {
        if(isHello){
            isHello = false;
            greetingTextView.setText(R.string.goodbye);
        }
        else {
            isHello = true;
            greetingTextView.setText(R.string.hello);
        }

    }
}
