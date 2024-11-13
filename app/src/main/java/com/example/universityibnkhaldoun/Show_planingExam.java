package com.example.universityibnkhaldoun;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Show_planingExam extends AppCompatActivity {

    PDFView pdfvie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_planing_exam);

        pdfvie = (PDFView) findViewById(R.id.ShowPlaningExam);
        pdfvie.fromAsset("exam_remplacement.pdf").load();
    }
}