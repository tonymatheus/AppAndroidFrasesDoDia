package com.tony.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Vencedor não é aquele que sempre vence, mas sim aquele que nunca para de lutar, Bom Dia <3",
                "Não tenha medo da mudança. Coisas boas se vão para que melhores possam vir. Bom Dia <3",
                "Às vezes você tem que levantar sozinho e seguir em frente...Bom Dia S2",
                "Nunca diga eu não consigo. Você consegue sim, basta ter força de vontade e fé. Bom dia S2",
                "Até o maior dos prédios começa no chão. Bom dia S2",
                "Não é com desculpas que irá atingir os seus objetivos! Bom Dia S2",
                "No fim tudo dá certo, e se não deu certo é porque ainda não chegou ao fim. bom Dia S2",
                "Tudo é possível. O impossível apenas demora mais... Bom Dia S2",
                "Esquece, levanta a cabeça. Segue em frente. Amanhã é um novo dia. Bom Dia S2",
                "O Flamengo Vai Levar o Mundial Sim!!!!!!!"
        };
        int numero = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.text_Resultado);
        texto.setText(frases[numero]);



    }
}
