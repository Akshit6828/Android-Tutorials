package com.shyna.intentfirstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
EditText name;
EditText password;
Button submit;
String str1,str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.editText1);
        password=findViewById(R.id.editText2);
        submit=findViewById(R.id.bottom);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1= name.getText().toString();
                str2=password.getText().toString();

                Intent intent= new Intent(MainActivity.this,MainActivity2.class);



                startActivity(intent);
                //Can be written as follows too
                //startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
    }
}