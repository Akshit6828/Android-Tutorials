package com.shyna.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.shyna.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    /*String TAG= "MainActivity";
    Button b1;
    EditText e1;
    TextView v1;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        b1= findViewById(R.id.b1);
//        e1=findViewById(R.id.e1);
//        v1=findViewById(R.id.v1);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String name= e1.getText().toString();
//                v1.setText(name);
//            }
//        }
    }

//        Log.d(TAG,"ONcREATE CALLED..");
//        Toast.makeText(this, "on create() called..", Toast.LENGTH_SHORT).show();
    }
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(TAG, "onStart() called....");
//       // Log.e(TAG, "onStart() error");
//        // Log.v(TAG, "onStart() verbose");
//    }
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Log.d(TAG, "onPostResume() called....");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(TAG, "onStop() called....");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(TAG, "onDestroy() called....");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d(TAG, "onReStart() called....");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(TAG, "onPause() called....");
//    }
//}