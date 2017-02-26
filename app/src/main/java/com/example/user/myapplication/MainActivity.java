package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.widget.Button.*;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                jumpToButton4();

            }
        });
    }

    public void jumpToButton4() {

        setContentView(R.layout.activity_main2);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                jumpToButton();
            }
        });
    }

    public void jumpToButton() {
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                jumpToButton();
            }
        });
    }

    public void aa(View v){

    }
}











    //  button = (Button) findViewById(R.id.button);
    //textView = (TextView) findViewById(R.id.textView);

    //button.setOnClickListener(new View.OnClickListener() {
    //  @Override
    //public void onClick(View v) {
    //   textView.setText("歡迎來到可愛動物區");
    //}
    // });

    //}
