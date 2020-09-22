package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonChangeText(View view)
    {
        TextView tv = findViewById(R.id.textView1);
        tv.setText("Yeaah :)");
    }
    /*
    public void buttonChangeColor(View view)
    {
        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setTextColor(Color.RED);
    }
    */

}