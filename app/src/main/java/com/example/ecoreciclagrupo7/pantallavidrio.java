package com.example.ecoreciclagrupo7;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class pantallavidrio extends AppCompatActivity {

    EditText et_categoria, et_mes, et_cantidad, et_precio;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantallavidrio);


        et_categoria = (EditText) findViewById(R.id.txt_vidrio4);
        et_mes = (EditText) findViewById(R.id.txt_mesvidrio1);
        et_cantidad = (EditText) findViewById(R.id.num_pesovidrio);
        et_precio = (EditText) findViewById(R.id.num_preciovidrio);


    }
    //metodo para el boton Ir a categorias
    public void categoriavidrio(View view) {
        Intent categoriavidrio = new Intent(this, categorias.class);
        startActivity(categoriavidrio);
    }

    //Método para registrar informacion

    public void RegistrarVidrio(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion1", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String Categoria = et_categoria.getText().toString();
        String Mes = et_mes.getText().toString();
        String Cantidad = et_cantidad.getText().toString();
        String Precio = et_precio.getText().toString();

        if (!Mes.isEmpty() && Categoria.equals("Vidrio") && !Cantidad.isEmpty() && !Precio.isEmpty() && !Categoria.isEmpty()) {
            ContentValues Registro = new ContentValues();
            //Registro.put("Categoria", Categoria);
            Registro.put("Mes", Mes);
            Registro.put("Cantidad", Cantidad);
            Registro.put("Precio", Precio);


            BaseDeDatos.insert("recicla", null, Registro);


            BaseDeDatos.close();
            et_precio.setText("");
            et_cantidad.setText("");
            et_mes.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Se deben llenar todos los espacios", Toast.LENGTH_SHORT).show();
        }
    }
}