package com.example.ecoreciclagrupo7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
//metodo para el boton ir a registrar
    public void Registrarar(View view){
        Intent  Registrar = new Intent(this, registro.class);
        startActivity(Registrar);
    }
    //metodo para el boton Ingresar hacia principal
    public void Ingresar(View view) {
        Intent Ingresar = new Intent(this, Principal.class);
        startActivity(Ingresar);
    }
}