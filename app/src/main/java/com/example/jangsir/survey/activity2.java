package com.example.jangsir.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import utils.iofile;


public class activity2 extends AppCompatActivity {

    private  String[] ccc = new String[]{

            "man",
            "woman"

    };
    private ListView listView ;
    private void toNewActivity(int position){
        Intent i;
        switch (position){
            case 0:
                i = new Intent(activity2.this,activity3.class);
                break;
            case 1:
                i = new Intent(activity2.this,activity3.class);
                break;
            default:
                i = new Intent(activity2.this,activity2.class);
                break;
        }
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        setTitle("Sex");


        listView = (ListView) findViewById(R.id.listView_2);
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                ccc));
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    //@Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        /*setTitle("您选择第"+position+"个选项");*/
                        String msgString = "";
                        if(position == 0){msgString = "man";}
                        if(position == 1){msgString = "woman";}
                        iofile.save(activity2.this,"2."+msgString+"|");
                        Toast.makeText(activity2.this, msgString,Toast.LENGTH_SHORT).show();
                        toNewActivity(position);
                    }
                }
        );


    }


}
