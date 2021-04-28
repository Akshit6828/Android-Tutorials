package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textView=findViewById(R.id.tv1);
    textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PopupMenu p = new PopupMenu(MainActivity.this,textView);
            //Getting menu reference from Resource.
            p.getMenuInflater().inflate(R.menu.my_popup_menu,p.getMenu());

            p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    // if  10 (Small conditions) VRS switch (large conditions)
                    switch (item.getItemId()){
                        case R.id.color1:
                            textView.setTextColor(Color.GREEN);
                            break;
                        case R.id.color2:
                            textView.setTextColor(Color.YELLOW);
                            break;
                        case R.id.color3:
                            textView.setTextColor(Color.BLUE);
                            break;
                        default:
                            Toast.makeText(MainActivity.this, "Default Color!..", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                }
            });

            p.show(); // for showing the options menu.
        }
    });

    }
}