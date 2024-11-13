package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Open Accuil Activity with click
        TextView accueil = (TextView) findViewById(R.id.accueil);

        // Set a click listener on that View
        accueil.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent accueilIntent = new Intent(MainActivity.this, Accueil.class);

                // Start the new activity
                startActivity(accueilIntent);
            }
        });
        //Open Département Informatique Activity with a click

        TextView DprtInform = (TextView) findViewById(R.id.DptInfo);

        // Set a click listener on that View
        DprtInform.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent DptInfIntent = new Intent(MainActivity.this, Dpt_Informatique.class);

                // Start the new activity
                startActivity(DptInfIntent);
            }
        });

        //Open Département mathématique Activity with a click

        TextView DprtMathé = (TextView) findViewById(R.id.DptMath);

        // Set a click listener on that View
        DprtMathé.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent DptMathIntent = new Intent(MainActivity.this, Dpt_math.class);

                // Start the new activity
                startActivity(DptMathIntent);
            }
        });

        //Open avis de consultation Activity with a click

        TextView AviCosult = (TextView) findViewById(R.id.AvisCons);

        // Set a click listener on that View
        AviCosult.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent AvisConsultIntent = new Intent(MainActivity.this, Avis_consul.class);

                // Start the new activity
                startActivity(AvisConsultIntent);
            }
        });
        //intent between mail button and proffessor mail activity
    }

        //Call onSendMessage() when the button is clicked
        public void onSendMailPro (View view){
            Intent intent = new Intent(this, ProfEmailActivity.class);
            startActivity(intent);
        }


    }























