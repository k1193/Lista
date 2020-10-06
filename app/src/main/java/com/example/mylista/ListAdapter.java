package com.example.mylista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Modelo> {
    private  List<Modelo> mLista;
    private  Context  mContext;
    private  int resourceLayout;


    public ListAdapter(@NonNull Context context, int resource, List<Modelo> objects) {
        super(context, resource, objects);
        this.mLista = objects;
        this.mContext= context;
        this.resourceLayout= resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null)
            view = LayoutInflater.from(mContext).inflate(R.layout.item_row, null);

        Modelo modelo = mLista.get(position);

        ImageView image = view.findViewById(R.id.imageView);
        image.setImageResource(modelo.getImage());


        TextView  Textonombre = view.findViewById(R.id.txtnombre);
        Textonombre.setText(modelo.getNombre());



        TextView Textoapellido = view.findViewById(R.id.txtapellido);
        Textoapellido.setText(modelo.getApellido());

        TextView Textoedad = view.findViewById(R.id.txtViewedad);
        Textoedad.setText(modelo.getEdad());



        return view;
    }
}
