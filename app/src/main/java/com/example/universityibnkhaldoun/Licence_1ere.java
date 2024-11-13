package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Licence_1ere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licence_1ere);

        TextView first_year = (TextView) findViewById(R.id.Algorithmique1);
        first_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent First_Year = new Intent(Licence_1ere.this, module_algo1.class);

                // Start the new activity
                startActivity(First_Year);
            }
        });





            }
}