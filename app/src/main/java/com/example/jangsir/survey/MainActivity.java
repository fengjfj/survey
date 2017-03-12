package com.example.jangsir.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

import utils.iofile;


public class MainActivity extends AppCompatActivity {

    private  String[] commonFunList = new String[]{

            "primary school",
            "junior middle school",
            "senior high school",
            "college",
            "Master degree candidate"
    };
    private ListView listView ;
    private void toNewActivity(int position){
        Intent i;
        switch (position){
            case 0:
                i = new Intent(MainActivity.this,activity2.class);
                break;
            case 1:
                i = new Intent(MainActivity.this,activity2.class);
                break;
            case 2:
                i = new Intent(MainActivity.this,activity2.class);
                break;
            case 3:
                i = new Intent(MainActivity.this,activity2.class);
                break;
            case 4:
                i = new Intent(MainActivity.this,activity2.class);
                break;
            default:
                i = new Intent(MainActivity.this,MainActivity.class);
                break;
        }
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("education");
        listView = (ListView) findViewById(R.id.listView_fun);
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                commonFunList));

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    //@Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        /*setTitle("您选择第"+position+"个选项");*/
                        String msgString = "";
                        if (position == 0) {
                            msgString = "primary school";
                        }
                        if (position == 1) {
                            msgString = "junior middle school";
                        }
                        if (position == 2) {
                            msgString = "senior high school";
                        }
                        if (position == 3) {
                            msgString = "college";
                        }
                        if (position == 4) {
                            msgString = "Master degree candidate";
                        }
                        iofile.save(MainActivity.this,"1."+msgString+"|");
                        Toast.makeText(MainActivity.this, msgString, Toast.LENGTH_SHORT).show();
                        toNewActivity(position);
                    }
                }
        );

    }


}
