package com.example.user.rsp;

import java.util.Random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (TextView)findViewById(R.id.textUser);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener((OnClickListener) this);
        Button button2 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener((OnClickListener) this);
        Button button3 = (Button)findViewById(R.id.button3);
        button1.setOnClickListener((OnClickListener) this);

    }

    /*public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                user.setText("Paper");
                break;
            case R.id.button2:
                user.setText("Scissor");
                break;
            case R.id.button3:
                user.setText("Rock");
                break;
        }
    }
}