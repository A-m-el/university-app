package com.example.universityibnkhaldoun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class module_algo1 extends AppCompatActivity {
Button ShowCour_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_module_algo1);

        ShowCour_1 = findViewById(R.id.txt_cour1);
        ShowCour_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), pdfview_cour1.class);
                startActivity(i);

            }
        });
    }
}