package com.example.mylista;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    private ListView mlistView;
    private List<Modelo> mLista = new ArrayList<> ();
    ListAdapter mAdapter;
    Modelo  modelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView= findViewById(R.id.listView);
        mlistView.setOnItemClickListener(this);


        mLista.add(new Modelo("susan","bernal","22",R.mipmap.ic_launcher));
        mLista.add(new Modelo("camilo","diaz","12",R.mipmap.ic_launcher));
        mLista.add(new Modelo("camila","medrano","34",R.mipmap.ic_launcher));
        mAdapter=new ListAdapter(MainActivity.this,R.layout.item_row,mLista);
        mlistView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this, " elemento con click: " +position, Toast.LENGTH_SHORT).show();
        Intent  intent = new Intent(this,Activity2.class);
        intent.putExtra( "nombre",mAdapter.getItem(position).getNombre());
        startActivityForResult(intent,   1 );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1  &&  resultCode ==  RESULT_OK){

        }
    }
}