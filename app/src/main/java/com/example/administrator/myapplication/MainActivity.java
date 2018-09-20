package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText("Hello Kylie");

        EditText input = (EditText) findViewById(R.id.editText);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    public void onClick(View view){
        Log.i("kkk","onClick:AAA");

        EditText input = (EditText) findViewById(R.id.editText);
        String str = input.getText().toString();

        TextView text = (TextView) findViewById(R.id.text1);
        text.setText("Hello Kylie");
    }

    public void abc(View btn){
        Log.i("kkk","onClick:abc");
    }
}
