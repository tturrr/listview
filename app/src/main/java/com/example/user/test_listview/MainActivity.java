package com.example.user.test_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] strings =  {"LIST1","LIST2","LIST3","LIST4"};


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strings);
                ListView listView = (ListView)findViewById(R.id.listview1);

                listView.setAdapter(arrayAdapter);



                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                        String strtext = (String) adapterView.getItemAtPosition(position);

                    }
                });

            }
        }






