package com.shyna.assignment1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.CompoundButton;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.shyna.assignment1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String s1,str1,str2,name,age,country;
    EditText edit1, edit2;
    TextView t1;
    String[] countries_in_main;
    ArrayAdapter my_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ViewBinding*************************************************************************
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setEnabled(false);

        countries_in_main=getResources().getStringArray(R.array.countries);
        my_adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries_in_main);
        binding.spinner.setAdapter(my_adapter);



        //*************************** FindViewById() Method ************************************
        edit1= findViewById(R.id.edit1);
        edit2= findViewById(R.id.edit2);
        t1=findViewById(R.id.t1);

       /* RadioButton radioButton;
        RadioButton radioButton2;
        CheckBox cb;
        Button button;
        edit1= findViewById(R.id.edit1);
        edit2= findViewById(R.id.edit2);
        radioButton= findViewById(R.id.radioButton);
        radioButton2= findViewById(R.id.radioButton2);
        cb= findViewById(R.id.cb);
        button= findViewById(R.id.button);*/

        //*************************** FindViewById() Method Ends.. ************************************


        binding.radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.radioButton.isChecked())
                    //Toast.makeText(MainActivity.this, "male", Toast.LENGTH_SHORT).show();
                    str1="male";
            }
        });
        binding.radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //Toast.makeText(MainActivity.this, "female", Toast.LENGTH_SHORT).show();
                if(binding.radioButton2.isChecked())
                    str1="female";
            }
        });

        binding.switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(binding.switch2.isChecked())
                    Toast.makeText(MainActivity.this, "Details are complete", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Details are missing", Toast.LENGTH_SHORT).show();
            }
        });

        binding.spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                    Toast.makeText(MainActivity.this, "Select a valid country", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Selected Country"+countries_in_main[position], Toast.LENGTH_SHORT).show();
            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=edit1.getText().toString();
                age=edit2.getText().toString();
                if(binding.cb.isChecked())
                    s1=binding.cb.getText().toString();
                t1.setText("Name :"+name+ "\n Age :" +age+ "\n Gender :" +str1+ "\n Scholar :" +str2);//--------------------------------
            }
        });
        binding.cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked)
                    binding.button.setEnabled(false);
                else {
                    str2 = "yes";
                    binding.button.setEnabled(true);
                }
            }
        });
    }
    }
