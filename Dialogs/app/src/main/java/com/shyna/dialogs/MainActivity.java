package com.shyna.dialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textview;
AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        textview.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });




    }

    private void showAlertDialog() {
        builder= new AlertDialog.Builder(this);
       builder.setTitle("Alert!!!");
       builder.setMessage("Submit");
       builder.setCancelable(false);
       builder.setIcon(R.mipmap.ic_launcher_round);
       builder.setPositiveButton("Yes",new DialogInterface.OnClickListener(){
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(MainActivity.this,"Submitted", Toast.LENGTH_SHORT).show();
           }
       });
        builder.setNegativeButton("No",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Not Submitted", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("Neutral",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"....", Toast.LENGTH_SHORT).show();
            }
        });


               builder.show();
}
    }