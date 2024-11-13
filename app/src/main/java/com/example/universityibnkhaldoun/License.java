package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class License extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);

        TextView first_year = (TextView) findViewById(R.id.firstyear);

        // Set a click listener on that View
        first_year.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent firstYear = new Intent(License.this, Licence_1ere.class);

                // Start the new activity
                startActivity(firstYear);
            }
        });

        TextView Second_year = (TextView) findViewById(R.id.secondyear);

        // Set a click listener on that View
        Second_year.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent SecondYear = new Intent(License.this, Licence_2eme.class);

                // Start the new activity
                startActivity(SecondYear);
            }
        });

        TextView Third_year = (TextView) findViewById(R.id.thirdYear);

        // Set a click listener on that View
        Third_year.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent ThirdYear = new Intent(License.this, Licence_3eme.class);

                // Start the new activity
                startActivity(ThirdYear);
            }
        });
    }
}