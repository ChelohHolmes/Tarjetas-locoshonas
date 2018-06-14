package com.example.usuario.app1_p2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        Jorge.setOnItemClickListener (new AdapterView.OnItemClickListener()
              {
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                      Intent ElIntent = new Intent(MainActivity.this, Main2Activity.class);
                      tarjeta x = (tarjeta) parent.getItemAtPosition(i);
                      ElIntent.putExtra("Nombre", x.Nombre);
                      ElIntent.putExtra("Edad", x.Edad);
                      ElIntent.putExtra("Descripcion", x.Descripcion);
                      ElIntent.putExtra("Imagen", x.Imagen);

                      startActivity(ElIntent);

                  }
              }
        );
    }

}
