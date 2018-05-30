package com.example.usuario.app1_p2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nombre = (TextView) findViewById(R.id.Nombre);
        TextView edad = (TextView) findViewById(R.id.Edad);
        TextView descripcon = (TextView) findViewById(R.id.Descripcion);
        ImageView imagen = (ImageView) findViewById(R.id.Imagens);

        Intent recieve = getIntent();

        String Noms = recieve.getStringExtra("Puffle");
        String Eds = recieve.getStringExtra("Color");
        String Descs = recieve.getStringExtra("Descripcion");
        String Ims = recieve.getStringExtra("Imagen");

        nombre.setText(Noms);
        edad.setText(Eds);
        descripcon.setText(Descs);


    }
}
