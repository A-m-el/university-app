package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Accueil extends AppCompatActivity {

    Button btn;
    Button btn1;

    SliderView sliderView;
    int[] images = {R.drawable.first,
            R.drawable.second,
            R.drawable.third,
            R.drawable.forth,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        btn = findViewById(R.id.ShowExam);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Show_planingExam.class);
                startActivity(i);
                btn.setClickable(true);

            }
        });

        btn1 = findViewById(R.id.showExamratrapage);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(), ShowExamRattrapage.class);
                startActivity(j);
                btn1.setClickable(true);

            }
        });
    }
}