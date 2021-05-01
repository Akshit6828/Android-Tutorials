package com.example.dynamiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
Button button,button2;
EditText editText;
ArrayList<String> arrayList;
ArrayAdapter<String > arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        button=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        editText=findViewById(R.id.editTextTextPersonName);

        arrayList= new ArrayList<>();// Important Step.

        arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);//************************

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item_name=editText.getText().toString();
                arrayList.add(item_name);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item_to_be_removed=editText.getText().toString();
                arrayList.remove(item_to_be_removed);
            }
        });

        //Used for the bug of Keyboard back pressed.
        arrayAdapter.notifyDataSetChanged();
        listView.setAdapter(arrayAdapter);


    }
}