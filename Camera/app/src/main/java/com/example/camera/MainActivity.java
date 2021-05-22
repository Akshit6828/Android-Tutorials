package com.example.camera;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button=findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
          startActivityForResult(i,5);

        }
    });

    }


    //---> MA->
    /* This method will only be overrided once in a particular activity*/
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==5 && resultCode==RESULT_OK && data!=null){
            //Camera Image Logic..
            Bundle bundle= data.getExtras(); // getIntent() . getExtras();
            Bitmap bitmap= (Bitmap) bundle.get("data"); // data is a keyword and not a key for any data passed.
            imageView.setImageBitmap(bitmap);
        }
        else{
            Toast.makeText(this, " Please Try Again..", Toast.LENGTH_SHORT).show();
        }



        /*
            Practical Application.
            Default Image (Icon)--> Image.setOnClickListener()--> Camera--> Pic Click --->

             if(pic_clicked)
                 setimage();
              else
                remain_default();
        It can also be put in any file through binary stream but if we can show in image view then we eed to use Bitmap.

              */



    }
}