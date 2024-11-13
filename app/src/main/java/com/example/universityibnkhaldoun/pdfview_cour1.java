package com.example.universityibnkhaldoun;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfview_cour1 extends AppCompatActivity {

    PDFView pdfview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview_cour1);

        pdfview = (PDFView) findViewById(R.id.Viewcour1algo);
        pdfview.fromAsset("chapitre1.pdf").load();

    }
}