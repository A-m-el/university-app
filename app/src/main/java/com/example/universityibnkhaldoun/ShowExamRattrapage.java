package com.example.universityibnkhaldoun;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ShowExamRattrapage extends AppCompatActivity {

PDFView pdfvieww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_exam_rattrapage);

        pdfvieww = (PDFView) findViewById(R.id.ShowRatrapageExam);
        pdfvieww.fromAsset("exam_remplacement.pdf").load();

    }
}