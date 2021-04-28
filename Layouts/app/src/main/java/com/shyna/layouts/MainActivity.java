package com.shyna.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.shyna.layouts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
RadioButton radiobutton1, radiobutton2;
Button button;
EditText editText;
TextView textView;
String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        radiobutton1=findViewById(R.id.radiobutton1);
        radiobutton2=findViewById(R.id.radiobutton2);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text= editText.getText().toString();
                textView.setText(text);
            }
        });
    }

        public void onRadioButtonClicked(View view) {
            boolean checked = ((RadioButton) view).isChecked();
            switch (view.getId())
            {
                case R.id.radiobutton1:
                if (checked)
                    Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
                break;
                case R.id.radiobutton2:
                    if (checked)
                        Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
                    break;
            }
        }



}