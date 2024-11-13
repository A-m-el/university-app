package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Master_RT_cours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master__r_t_cours);

        // RT_cours --> RT1
        TextView master1_RL_Cour = (TextView) findViewById(R.id.master1_RT);
        master1_RL_Cour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master1_RT = new Intent(Master_RT_cours.this, Cour_Master_1_RT.class);

                // Start the new activity
                startActivity(Master1_RT);
            }
        });

        // RT_cours --> RT2
        TextView master2_RL_Cour = (TextView) findViewById(R.id.master2_RT);
        master2_RL_Cour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master2_RT = new Intent(Master_RT_cours.this, Cour_Master_2_RT.class);

                // Start the new activity
                startActivity(Master2_RT);
            }
        });

    }
}