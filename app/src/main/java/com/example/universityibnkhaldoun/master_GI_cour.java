package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class master_GI_cour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master__g_i_cour);

        // GI_cours --> GI1
        TextView master1_GI_Cour = (TextView) findViewById(R.id.master1_GI);
        master1_GI_Cour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master1_GI = new Intent(master_GI_cour.this, Cour_Master_1_GI.class);

                // Start the new activity
                startActivity(Master1_GI);
            }
        });

        // GI_cours --> GI2
        TextView master2_GI_Cour = (TextView) findViewById(R.id.master2_GI);
        master2_GI_Cour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master2_GI = new Intent(master_GI_cour.this, Cour_Master_2_GI.class);

                // Start the new activity
                startActivity(Master2_GI);
            }
        });


    }
}