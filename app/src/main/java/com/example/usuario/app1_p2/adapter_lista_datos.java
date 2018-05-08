package com.example.usuario.app1_p2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter_lista_datos  extends BaseAdapter{
    public ArrayList<tarjeta> ListaArreglo;
    Context context;

    @Override
    public int getCount() {
        return ListaArreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return ListaArreglo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaArreglo.get(i).ID;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflate;
        inflate = LayoutInflater.from(context);
        View v = inflate.inflate(R.layout.tarjetero, null);
        TextView nombre = (TextView) v.findViewById(R.id.Nombre);
        nombre.setText(ListaArreglo.get(i).Nombre.getText());
        return v;
    }
}
