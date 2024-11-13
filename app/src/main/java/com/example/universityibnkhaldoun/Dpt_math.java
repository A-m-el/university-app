package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dpt_math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt_math);

        TextView courDptMath = (TextView) findViewById(R.id.DptMathcour);

        // Set a click listener on that View
        courDptMath.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent CourDptMathIntent = new Intent(Dpt_math.this, DptMath_cour.class);

                // Start the new activity
                startActivity(CourDptMathIntent);
            }
        });

        TextView resultDptMath = (TextView) findViewById(R.id.DptMathresult);

        // Set a click listener on that View
        resultDptMath.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ResultDptMathIntent = new Intent(Dpt_math.this, DptMtah_result.class);

                // Start the new activity
                startActivity(ResultDptMathIntent);
            }
        });



    }
}