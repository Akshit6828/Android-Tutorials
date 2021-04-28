package com.shyna.externalapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton imageButton, imageButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String packagename_fb= "com.facebook.katana";
                if(checkPackageExist(packagename_fb)) {
                    openAppforPackage(packagename_fb);
                    Toast.makeText(MainActivity.this, "App exists", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"App does not exist", Toast.LENGTH_SHORT).show();

            }
        });


        imageButton1=findViewById(R.id.imageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String packagename_wp= "com.whatsapp";
                String url_whtsapp="https://play.google.com/store/apps/details?id=com.whatsapp";
                if(checkPackageExist(packagename_wp)) {
                    openAppforPackage(packagename_wp);
                    Toast.makeText(MainActivity.this, "App exists", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "App does not exist", Toast.LENGTH_SHORT).show();
                    String a="com.whatsapp";
                    Intent in =new Intent(Intent.ACTION_VIEW,Uri.parse(url_whtsapp));// implicit intent..
                    startActivity(in);
                }



            }
        });
            }


            //******************Package ko check krega....
     boolean checkPackageExist(String package_name) {
         PackageManager pm= getPackageManager();
         String package_Name= package_name;
         try{
             pm.getPackageInfo(package_Name, 0);
                 return true;
         }
         catch (PackageManager.NameNotFoundException e){
             return false;
         }
     }
//*************Open package for package_name .
     void openAppforPackage(String package_name) {
         PackageManager pm= getPackageManager();
         Intent i=pm.getLaunchIntentForPackage(package_name);
         startActivity(i);
    }


    /*boolean checkPackage(String package_name) {
        PackageManager p= getPackageManager();
        String package_Name= package_name;
        try{
            p.getPackageInfo(package_Name, 0);
            return true;
        }
        catch (PackageManager.NameNotFoundException e){
            return false;
        }
    }*/

  /*  void openApp(String package_name) {
        PackageManager p= getPackageManager();
        Intent i=p.getLaunchIntentForPackage("com.whatsapp");
        startActivity(i);
    }*/
}