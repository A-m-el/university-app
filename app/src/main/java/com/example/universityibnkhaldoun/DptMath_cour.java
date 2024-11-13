package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DptMath_cour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt_math_cour);

        TextView Licence_Mat = (TextView) findViewById(R.id.LiceneMath);
        Licence_Mat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Licence_Math = new Intent(DptMath_cour.this, Licence_Math.class);

                // Start the new activity
                startActivity(Licence_Math);
            }
        });
        TextView masterAFED = (TextView) findViewById(R.id.MasterAFED);
        masterAFED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master_AFED = new Intent(DptMath_cour.this, Master_AFED.class);

                // Start the new activity
                startActivity(Master_AFED);
            }
        });

        TextView masterAFA = (TextView) findViewById(R.id.MasterAFA);
        masterAFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master_AFA = new Intent(DptMath_cour.this, Master_AFA.class);

                // Start the new activity
                startActivity(Master_AFA);
            }
        });

    }
}