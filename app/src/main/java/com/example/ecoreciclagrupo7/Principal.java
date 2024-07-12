package com.example.ecoreciclagrupo7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);

    }
    //metodo para el boton Ingresar (retornando)
    public void retornar(View view) {
        Intent retornar = new Intent(this, MainActivity.class);
        startActivity(retornar);
    }
    //metodo para el boton categorias
    public void categorias(View view) {
        Intent categorias = new Intent(this, categorias.class);
        startActivity(categorias);
    }
    //metodo para el boton estadisticas
    public void estadisticas(View view) {
        Intent estadisticas = new Intent(this, Estadisticas.class);
        startActivity(estadisticas);
    }
    //metodo para el boton consejos
    public void consejos(View view) {
        Intent consejos = new Intent(this, Comentips.class);
        startActivity(consejos);
    }
}