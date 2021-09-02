package com.example.drazky.quiz;

public class LibreriaDePreguntas {

    public static String mQuestions[] ={
            "¿Cuántos balones de oro tiene Ronaldinho?",
            "¿Qué equípo es apodado Submarino Amarillo?",
            "¿Qué selección de fútbol ganó el Mundial en el año 2010?",
            "¿Cuál fue el ZAMORA de la temporada 2017-18?",
            "A qué equípo corresponde este escudo"

    };

    public static int [] imagenes  = new int[]{
        R.drawable.vacia,R.drawable.vacia,R.drawable.vacia,R.drawable.vacia,R.drawable.celta
    };


    private String mChoices[][] = {
            {"1","2","3","0"},
            {"Las Palmas","Cádiz","Villareal","Alcorcón"},
            {"Alemania","Italia","España","Brasil"},
            {"Casillas","Ter Stegen","Keylor","Oblak"},
            {"Valencia","Sevilla","Betis","Celta"}
    };

    private String mCorrectAnswers []= {"1","Villareal","España","Oblak","Celta"};

    public String getQuestions(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }


    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
