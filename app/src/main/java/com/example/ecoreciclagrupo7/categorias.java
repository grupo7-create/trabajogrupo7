package com.example.ecoreciclagrupo7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_categorias);

    }
    //metodo para el boton regresar a Principal
    public void Anterior(View view) {
        Intent Anterior = new Intent(this, MainActivity.class);
        startActivity(Anterior);
    }
    //metodo para el boton Ir a pantallagua
    public void categoriaagua(View view) {
        Intent categoriaagua = new Intent(this, pantallaagua.class);
        startActivity(categoriaagua);
    }
    //metodo para el boton Ir a pantalplastico
    public void categoriaplastico(View view) {
        Intent categoriaplastico = new Intent(this, pantallaplastico.class);
        startActivity(categoriaplastico);
    }
    //metodo para el boton Ir a pantalpapel
    public void categoriapapel(View view) {
        Intent categoriapapel = new Intent(this, papelrecicla.class);
        startActivity(categoriapapel);
    }
    //metodo para el boton Ir a pantallavidrio
    public void categoriavidrio(View view) {
        Intent categoriavidrio = new Intent(this, pantallavidrio.class);
        startActivity(categoriavidrio);
    }

}