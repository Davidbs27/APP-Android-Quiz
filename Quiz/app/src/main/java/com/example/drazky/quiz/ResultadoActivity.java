package com.example.drazky.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    Button atras;
    TextView resultadoFinal;
    TextView grade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        atras = (Button)findViewById(R.id.BotonSalir);
        grade = (TextView)findViewById(R.id.grade);
        resultadoFinal = (TextView)findViewById(R.id.outOf);

        Bundle bundle = getIntent().getExtras();
        int resultado = bundle.getInt("PutuacionFinal");

        resultadoFinal.setText("Tu resultado es: "+resultado+" de 15");

        if(resultado == 15){
            grade.setText("PERFECTO!");
        }else if(resultado >=12 && resultado<15){
            grade.setText("FENOMENAL!");
        }else if(resultado >=7 && resultado<12){
            grade.setText("BIEN HECHO!");
        }else if(resultado >=4 && resultado<7) {
            grade.setText("CASI LO TIENES");
        }else if(resultado >=-15 && resultado<4) {
            grade.setText("NO TE RINDAS");
        }

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //con un intent podemos llamar a la actividad que quereamos.
                startActivity(new Intent(ResultadoActivity.this, MainActivity.class));



            }
        });

    }
}
