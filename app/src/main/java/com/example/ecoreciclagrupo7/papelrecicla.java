package com.example.ecoreciclagrupo7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class papelrecicla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_papelrecicla);

    }
    //metodo para el boton Ir a pantalplastico
    public void categoriapapel(View view) {
        Intent categoriapapel = new Intent(this, categorias.class);
        startActivity(categoriapapel);
    }
}