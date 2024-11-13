package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Master_GL_cour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master__g_l_cour);


        // GL_cours --> GL1
        TextView master1_GL_Cour = (TextView) findViewById(R.id.master1_GL);
        master1_GL_Cour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master1_GL = new Intent(Master_GL_cour.this, Cour_Master_1_GL.class);

                // Start the new activity
                startActivity(Master1_GL);
            }
        });

        // GL_cours --> GL2
        TextView master2_GL_Cour = (TextView) findViewById(R.id.master2_GL);
        master2_GL_Cour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent Master2_GL = new Intent(Master_GL_cour.this, cour_master_2_GL.class);

                // Start the new activity
                startActivity(Master2_GL);
            }
        });


    }
}