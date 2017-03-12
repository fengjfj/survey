package com.example.jangsir.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import utils.iofile;


public class activity12 extends AppCompatActivity {


    CheckBox beijing=null;
    CheckBox shanghai=null;
    CheckBox shenzhen=null;
    CheckBox dalian=null;
    CheckBox tianjin=null;
    EditText editText1=null;
    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity12);
        setTitle("Entertainment Types Survey");

        button = (Button)findViewById(R.id.button);
        beijing=(CheckBox)findViewById(R.id.beijing);
        shanghai=(CheckBox)findViewById(R.id.shanghai);
        shenzhen=(CheckBox)findViewById(R.id.shenzhen);
        dalian=(CheckBox)findViewById(R.id.dalian);
        tianjin=(CheckBox)findViewById(R.id.tianjin);
        editText1=(EditText)findViewById(R.id.editText1);

        beijing.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    editText1.setText(buttonView.getText()+" choose");
                }else{
                    editText1.setText(buttonView.getText()+" cancel choose");
                }
            }
        });
        shanghai.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    editText1.setText(buttonView.getText()+" choose");
                }else{
                    editText1.setText(buttonView.getText()+" cancel choose");
                }
            }
        });
        shenzhen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    editText1.setText(buttonView.getText()+" choose");
                }else{
                    editText1.setText(buttonView.getText()+" cancel choose");
                }
            }
        });
        dalian.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    editText1.setText(buttonView.getText()+" choose");
                }else{
                    editText1.setText(buttonView.getText()+" cancel choose");
                }
            }
        });
        tianjin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    editText1.setText(buttonView.getText()+" choose");
                }else{
                    editText1.setText(buttonView.getText()+" cancel choose");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String msgString = "You Choose"; // 给选中的选项值赋值用的，初始化为空

               if(beijing.isChecked()){
                   msgString = msgString+" Play Video Games、";
               }
                if(shanghai.isChecked()){
                    msgString = msgString+" Listen To Music、";
                }
                if(shenzhen.isChecked()){
                    msgString = msgString+" Watch Movies、";
                }
                if(dalian.isChecked()){
                    msgString = msgString+" Have Fun With Friends、";
                }
                if(tianjin.isChecked()){
                    msgString = msgString+" Go For A Walk、";
                }
                if(msgString == "You Choose"){msgString = "Please Choose At Least One";}

                Toast.makeText(activity12.this, msgString,Toast.LENGTH_SHORT).show();
                if ( msgString != "Please Choose At Least One") {
                    iofile.save(activity12.this,"12."+msgString+"|");
                Intent i;
                i = new Intent (activity12.this,activity13.class);
                startActivity(i);}
            }
        });
    }
}
