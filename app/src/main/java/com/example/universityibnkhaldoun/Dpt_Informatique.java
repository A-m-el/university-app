package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dpt_Informatique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt__informatique);

        //Open cours activity in DptInformatique

        TextView CourDptInf = (TextView) findViewById(R.id.coursDptInf);

        // Set a click listener on that View
        CourDptInf.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent courDptInfIntent = new Intent(Dpt_Informatique.this, DptInf_cours.class);

                // Start the new activity
                startActivity(courDptInfIntent);
            }
        });

        //Open Resultatq activity in DptInformatique

        TextView RésultatDptInf = (TextView) findViewById(R.id.resultatDptInf);

        // Set a click listener on that View
        RésultatDptInf.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ResultDptInfIntent = new Intent(Dpt_Informatique.this, DptInf_Rsult.class);

                // Start the new activity
                startActivity(ResultDptInfIntent);
            }
        });


    }
}