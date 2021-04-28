package com.shyna.horizontalprogreedialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shyna.horizontalprogreedialog.R;

public class MainActivity extends AppCompatActivity {
    Button button;
    ProgressDialog pd;
    private int progress=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd=new ProgressDialog(MainActivity.this);
                pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pd.setTitle("Dialog box");
                pd.setMessage("Loading");
                pd.setCanceledOnTouchOutside(false);
                pd.setMax(100);
                pd.show();
                new Thread(new Runnable() {
                    @Override
                    
                        public void run () {
                        while(progress < 100) {
                            try {
                                Thread.sleep(2000);
                                progress++;
                                pd.setProgress(progress);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        pd.dismiss();
                        progress=0;
                    }

                }).start();

            }
        });
    }
}