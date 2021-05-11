package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button4=findViewById(R.id.button4);
        //Calling button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Intent.ACTION_DIAL);
                //Intent i1=new Intent(Intent.ACTION_CALL_BUTTON);
                i1.setData(Uri.parse("tel:9465675515"));
                if(i1.resolveActivity(getPackageManager())!=null){
                    startActivity(i1);
                }
            }
        });


        //Geolocation
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent("geo:30.235936,74.951504");
                if(i2.resolveActivity(getPackageManager())!=null){
                    startActivity(i2);
                }
            }
        });


        //Opening a Web page.
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri twitter=Uri.parse("https://twitter.com/AkshitMangotra");
             //   Uri twitter=Uri.parse("www.google.com");
                Intent i3 = new Intent(Intent.ACTION_VIEW,twitter);
                if(i3.resolveActivity(getPackageManager())!=null){
                    startActivity(i3);
                }

            }
        });

        //Searching something with search browser.
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_to_be_Searched="Stars War Day";// edittext.getText().toString()
                Intent i4 = new Intent(Intent.ACTION_WEB_SEARCH);
                i4.putExtra(SearchManager.QUERY,data_to_be_Searched);
                startActivity(i4);
            }
        });

    }
}