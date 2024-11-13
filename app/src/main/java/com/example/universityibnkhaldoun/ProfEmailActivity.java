package com.example.universityibnkhaldoun;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ProfEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_email);

         //create an array of Emails
       ArrayList <EmailData> ProfEmail = new ArrayList<EmailData>();
        ProfEmail.add(new EmailData("Alem Aek","a_alem@esi.dz"));
        ProfEmail.add( new EmailData("Benathmane Lalia", "l_benathmane@esi.dz"));
        ProfEmail.add(new EmailData("Benaouda Habib","bena.habib@gmail.com"));
        ProfEmail.add(new EmailData("Boualem Adda","ab_boualem@esi.dz"));
        ProfEmail.add(new EmailData("Baghani Abdelmalek","baghanimalik@yahoo.fr"));
        ProfEmail.add(new EmailData("Bekki Khadir","bekki_kh@yahoo.fr"));
        ProfEmail.add(new EmailData("Chenine AbdelKader","chenine_a@yahoo.fr"));
        ProfEmail.add(new EmailData("Chikhaoui Ahmed","ah_chikhaoui@yahoo.fr"));
        ProfEmail.add(new EmailData("Chadli ","chadli68@yahoo.fr"));
        ProfEmail.add(new EmailData("Daoud  ","daoud55b@yahoo.fr"));
        ProfEmail.add(new EmailData("Dahmani Youcef","dahmani_y@yahoo.fr"));
        ProfEmail.add(new EmailData("Djaafri laouni", "djebbar1972@yahoo.fr"));
        ProfEmail.add(new EmailData("Ouared AbdelKader","ouredAbdelkader@gmail.com"));
        ProfEmail.add(new EmailData("Siabdelhadi","a_siabdelhadi@yahoo.fr"));
        ProfEmail.add(new EmailData("Kharoubi Sahraoui","kharoubisahraoui@yahoo.fr"));
        ProfEmail.add(new EmailData("Mbarek Bendaoud ","mebarekbendaoud@yahoo.fr"));
    /*    ProfEmail.add("a_aek@gmail.com");
        ProfEmail.add("abdellahbelkadi@yahoo.fr");
        ProfEmail.add("abdfatima25@yahoo.com");
        ProfEmail.add("ahmedhallouz@yahoo.com");
        ProfEmail.add("azzisaleha@yahoo.fr");
        ProfEmail.add("bboudjemaa07@yahoo.fr");
        ProfEmail.add("bk1174@yahoo.fr");
        ProfEmail.add("belarbimostefa@yahoo.fr");
        ProfEmail.add("belkhorissat_r@yahoo.fr");
        ProfEmail.add("benaliarid74@gamil.com");
        ProfEmail.add("gayacine@yahoo.fr");
        ProfEmail.add("hh_abla@yahoo.fr");
        ProfEmail.add("bkanisse@gmail.com");*/
        EmailAdapter Adaper =
                new EmailAdapter (this, ProfEmail);

        ListView listView = (ListView) findViewById(R.id.List);

        listView.setAdapter(Adaper);



    }
}