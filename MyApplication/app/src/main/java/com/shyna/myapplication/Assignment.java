package com.shyna.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.shyna.myapplication.databinding.ActivityAssignmentBinding;

public class Assignment extends AppCompatActivity {
    ActivityAssignmentBinding binding;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_assignment);
    binding= ActivityAssignmentBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    binding.button.setEnabled(false);
        /*EditText edit1;
        EditText edit2;
        RadioButton radioButton;
        RadioButton radioButton2;
        CheckBox cb;
        Button button;
        edit1= findViewById(R.id.edit1);
        edit2= findViewById(R.id.edit2);
        radioButton= findViewById(R.id.radioButton);
        radioButton2= findViewById(R.id.radioButton2);
        cb= findViewById(R.id.cb);
        button= findViewById(R.id.button);*/
        binding.radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.radioButton.isChecked())
                    Toast.makeText(Assignment.this, "male", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Assignment.this, "female", Toast.LENGTH_SHORT).show();
            }
        });
             binding.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(binding.cb.isChecked())
                        s1=binding.cb.getText().toString();
                }
        });
        binding.cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked)
                    binding.button.setEnabled(false);
                else
                    binding.button.setEnabled(true);
            }
        });
    }
}