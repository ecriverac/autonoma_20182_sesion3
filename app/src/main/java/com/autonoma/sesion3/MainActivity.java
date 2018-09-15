package com.autonoma.sesion3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.autonoma.sesion3.Adapters.MiAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListado;
    private MiAdapter miAdapter;
    private ArrayList alummnos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvListado = (RecyclerView) findViewById(R.id.rvListado);

        // Usar esta línea para mejorar el rendimiento
        // si sabemos que el contenido no va a afectar
        // el tamaño del RecyclerView
        rvListado.setHasFixedSize(true);

        // Nuestro RecyclerView usará un linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvListado.setLayoutManager(layoutManager);

        // Datos
        ArrayList miDataSet = new ArrayList<String>();
        alummnos.add("Elvis");
        alummnos.add("Carlos");
        alummnos.add("Manuel");
        alummnos.add("Sixto");

        // Asociamos un adapter (ver más adelante cómo definirlo)
        miAdapter = new MiAdapter(miDataSet);
        rvListado.setAdapter(miAdapter);
    }
}
