package com.example.drazky.quiz;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //Declaramos el boton
    Button comenzar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asignamos la varible boton a nuestro boton del xml.
        comenzar = (Button)findViewById(R.id.botonComenzar);

        //Le damos la fucnion al boton.
        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //con un intent podemos llamar a la actividad que quereamos.
                Intent comenzar = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(comenzar);
            }
        });
    }
}
