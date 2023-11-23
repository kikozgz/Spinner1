package com.example.spinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se crea el adaptador con los datos para luego asignarlos al spinner
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strFrutas);
        //Hace referencia al spinner con el id `sp_frutas`
        spFrutas = (Spinner) findViewById(R.id.sp_frutas);
        //Implementa el setOnItemSelectedListener para realizar acciones cuando se haga clic en un elemento del spinner
        spFrutas.setOnItemSelectedListener(this);
        //Cargo el spinner con los datos
        spFrutas.setAdapter(adaptador);




    }
}