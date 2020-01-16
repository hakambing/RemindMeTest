package com.example.remindme;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class EditReminder extends AppCompatActivity implements View.OnClickListener{
    Switch switch1;
    RadioGroup radioGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_reminder);
        switch1 = findViewById(R.id.switchRepeat);
        radioGroup = findViewById(R.id.repeatGroup);
        switch1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (switch1.isChecked()){
                    radioGroup.setVisibility(View.VISIBLE);
                }else{
                    radioGroup.setVisibility(View.GONE);
                }
            }
        });

    }
    @Override
    public void onClick(View v) {

    }
}
