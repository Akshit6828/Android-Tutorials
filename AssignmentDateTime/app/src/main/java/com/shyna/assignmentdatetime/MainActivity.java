package com.shyna.assignmentdatetime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
TextView textView;
EditText date,time;
Button button;
int d,m,y;
int h,min;
    protected void onCreate(Bundle savedInstanceState, String hourofDay) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview);
        date=findViewById(R.id.edittext1);
        time=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar ca= Calendar.getInstance();
                d=ca.get(Calendar.DAY_OF_MONTH);
                m=ca.get(Calendar.MONTH);
                y=ca.get(Calendar.YEAR);
                new DatePickerDialog(MainActivity.this, listener,d,m,y).show();
            }
            DatePickerDialog.OnDateSetListener listener= new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    date.setText(dayOfMonth+"/"+month+"/"+year);
                }
            };
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal= Calendar.getInstance();
                h=cal.get(Calendar.HOUR_OF_DAY);
                min=cal.get(Calendar.MINUTE);
                new TimePickerDialog(MainActivity.this, listener,h,min,false).show();
            }
            TimePickerDialog.OnTimeSetListener listener= new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    time.setText(hourofDay+":"+minute);
                }
            };
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }





}