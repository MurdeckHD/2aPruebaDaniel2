package com.example.a2apruebadaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carrito extends AppCompatActivity implements View.OnClickListener{


    Button pagar;
    Button Retroceder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        pagar = (Button)findViewById(R.id.btnpagar);
        Retroceder = (Button)findViewById(R.id.btnretroceder);

        Retroceder.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent Anterior = new Intent(this, MainActivity.class);
        startActivity(Anterior);
        //String mensaje = Anterior.getStringExtra(MainActivity);
    }
}