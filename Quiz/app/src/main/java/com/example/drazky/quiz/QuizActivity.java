package com.example.drazky.quiz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    //Creamos un objeto de tipo LibreriaDePreguntas.
    private LibreriaDePreguntas mQuestionLibrary = new LibreriaDePreguntas();

    //Declramos las variables
    private ImageView mImageView;
    private TextView mScoreView;
    private TextView mQuestionView;

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button salir;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Asociamos nuestras variables con los componentes del XML
        mImageView = (ImageView)findViewById(R.id.imagenView);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        salir = (Button)findViewById(R.id.quit);

        actulizarPregunta();

        //Funcion del boton1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logica del boton

                //Si es acertada!
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 3;
                    actulizarScore(mScore);
                    Toast.makeText(QuizActivity.this, "Correcta!", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }


                }//Si es incorrecta!
                else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    mScore = mScore - 2;
                    actulizarScore(mScore);

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }
                }
            }
        });

        //Funcion del boton2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logica del boton

                //Si es acertada!
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 3;
                    actulizarScore(mScore);
                    Toast.makeText(QuizActivity.this, "Correcta!", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }


                }//Si es incorrecta!
                else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    mScore = mScore - 2;
                    actulizarScore(mScore);

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }
                }
            }
        });


        //Funcion del boton3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logica del boton

                //Si es acertada!
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 3;
                    actulizarScore(mScore);
                    Toast.makeText(QuizActivity.this, "Correcta!", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }


                }//Si es incorrecta!
                else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    mScore = mScore - 2;
                    actulizarScore(mScore);

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }
                }
            }
        });


        //Funcion del boton4
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logica del boton

                //Si es acertada!
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 3;
                    actulizarScore(mScore);
                    Toast.makeText(QuizActivity.this, "Correcta!", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }


                }//Si es incorrecta!
                else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    mScore = mScore - 2;
                    actulizarScore(mScore);

                    if (mQuestionNumber == LibreriaDePreguntas.mQuestions.length) {
                        //Creamos un variable de tipo Intent que sirbe para pasar cosas de un activity a otro.
                        Intent i = new Intent(QuizActivity.this, ResultadoActivity.class);
                        //Creamo otra de tipo Bundle que es el que almancera el dato que pasamos.
                        Bundle bundle = new Bundle();
                        //Con el meotdo putTnt(), primero le damos nombre al dato que vamos a pasar y depues la variable que vamos a pasar.
                        bundle.putInt("PutuacionFinal", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        actulizarPregunta();
                    }
                }
            }
        });

        //Funcion boton Salir:
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logica del boton Salir

                Intent volver = new Intent(QuizActivity.this, MainActivity.class);
                startActivity(volver);
            }
        });
    }

    public void actulizarPregunta(){

        mImageView.setImageResource(LibreriaDePreguntas.imagenes[mQuestionNumber]);
        mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2( mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    public void actulizarScore(int punto){

        mScoreView.setText(""+mScore);
    }

}
