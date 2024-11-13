package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DptInf_cours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt_inf_cours);

        TextView first_year = (TextView) findViewById(R.id.LicenceView);
        first_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent First_Year = new Intent(DptInf_cours.this, License.class);

                // Start the new activity
                startActivity(First_Year);
            }
        });

        //create intent between cour_DptInfo_Activity and master_GL_cours

        TextView Master_GL = (TextView) findViewById(R.id.masterGl);
        Master_GL.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent MasterGL = new Intent(DptInf_cours.this, Master_GL_cour.class);

                // Start the new activity
                startActivity(MasterGL);
            }
        });

        //create intent between cour_DptInfo_Activity and master_RT_cours

        TextView Master_RT = (TextView) findViewById(R.id.masterRT);
        Master_RT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent MasterRT = new Intent(DptInf_cours.this, Master_RT_cours.class);

                // Start the new activity
                startActivity(MasterRT);
            }
        });

        //create intent between cour_DptInfo_Activity and master_GI_cours

        TextView Master_GI= (TextView) findViewById(R.id.masterGI);
        Master_GI.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent MasterGI = new Intent(DptInf_cours.this, master_GI_cour.class);

                // Start the new activity
                startActivity(MasterGI);
            }
        });



    }
}