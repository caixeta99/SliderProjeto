package com.example.sliderprojeto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/

        //desativando os botoes que aparecem por padrao no slider
        setButtonBackVisible(false);
        setButtonNextVisible(false);


        // no codigo abaixo temos a ultilização do slide, usando alguns fragementos

        addSlide(new FragmentSlide.Builder()
            .background(android.R.color.white)
                .fragment(R.layout.introducao_01)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.introducao_02)
                .build()
        );




/*

        // no codigo abaixo temos a ultilização do slide, usando uma activity


        addSlide(new SimpleSlide.Builder()
            .title("Titulo")
                .description("Descrição da apresentação")
                .background(android.R.color.holo_blue_light)
                .image(R.drawable.um)
                .build()
        );
        addSlide(new SimpleSlide.Builder()
                .title("Titulo 2")
                .description("Descrição da apresentação2 ")
                .background(android.R.color.holo_blue_light)
                .image(R.drawable.dois)
                .build()
        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 3")
                .description("Descrição da apresentação 3 ")
                .background(android.R.color.holo_blue_light)
                .image(R.drawable.tres)
                .build()
        );


 */
    }
}