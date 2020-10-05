package com.rikiafrianto.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //mendeklarasikan variabel
    private ListView lvItem;
    //menginisialisasi array tipe data string
    private String[] namanegara=new String[]{
       "Indonesia",
       "Malaysia",
       "Singapura",
       "Myanmar",
       "Laos",
       "Kamboja",
       "Brunai Darussalam",
       "Cina",
       "Italia",
       "German",
       "Arab Saudi",
       "Irak",
       "Iran",
       "Mesir",
       "Palestina",
       "Jepang",
       "Filipina",
       "Thailand"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membinding atau memformat data
        lvItem=(ListView)findViewById(R.id.list_view);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        //mengatur data didalam listview
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(MainActivity.this,"Memilih : "+namanegara[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
