package com.example.user.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ListView listView =findViewById(R.id.shops);
//        String[] shops = getResources().getStringArray(R.array.shops)
        ListView listView = findViewById(R.id.ListView);

        final String[] Shops =getResources().getStringArray(R.array.shops);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1,Shops);

        listView.setAdapter(adapter);
//   readClick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(  MainActivity.this,"shops"+ Shops[position],Toast.LENGTH_SHORT ).show();

            }
        });
    }
}
