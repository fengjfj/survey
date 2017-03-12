package com.example.jangsir.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class activity13 extends AppCompatActivity {


    Button button ;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity13);
        button = (Button)findViewById(R.id.button);
        group = (RadioGroup)findViewById(R.id.sleep);



        setTitle("Thank You!");

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(activity13.this,"Good Bye",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
