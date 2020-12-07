package com.example.a2apruebadaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button AgregarAlCarro;
    Button Comprar;
    EditText Cantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AgregarAlCarro = (Button) findViewById(R.id.btnagregaralcarro);
        Comprar = (Button) findViewById(R.id.btnagregar);
        Cantidad = (EditText)findViewById(R.id.CantidadUsuario);

        AgregarAlCarro.setOnClickListener(this);
        Comprar.setOnClickListener(this);
        Cantidad.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        Intent Seguiente = new Intent(this, Carrito.class);
        Seguiente.putExtra("Mensaje", Cantidad.getText().toString());
        startActivity(Seguiente);


        switch (v.getId()) {
            case R.id.btnagregar:
                Toast.makeText(this, "Agregado al Carro", Toast.LENGTH_SHORT).show();
                break;



        }
    }
}