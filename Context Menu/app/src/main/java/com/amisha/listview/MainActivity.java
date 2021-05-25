package com.amisha.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String value[];
    String item;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.listView);
        value=getResources().getStringArray(R.array.technology);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,value);
        l.setAdapter(adapter);
        registerForContextMenu(l);

        //event on ListView
        /*l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected item:"+value[position], Toast.LENGTH_SHORT).show();
            }
        });*/

        l.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                item=value[position];
                index=position;
                return false;
            }
        });



    }
    //Outside OnCreate()


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
         menu.add("Delete");
         menu.add("Rename");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getTitle().toString()){
            case "Delete":
                Toast.makeText(this, "Item Deleted", Toast.LENGTH_SHORT).show();
                break;
            case "Rename":
                Toast.makeText(this, "Item Renamed", Toast.LENGTH_SHORT).show();
                    break;
        }
        return super.onContextItemSelected(item);
    }
}