package com.example.usuario.app1_p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView Jorge = (ListView) findViewById(R.id.ListView);
        adapter_lista_datos buenas = new adapter_lista_datos();
        origen_de_datos noches = new origen_de_datos();
        buenas.context=this;
        buenas.ListaArreglo=noches.showAll();
        Jorge.setAdapter(buenas);
    }
    
}
