package com.example.appcanzoni;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

public class Gestorebrani {


        ArrayList<Brano> ListaBrani;

        public Gestorebrani() {
            ListaBrani = new ArrayList<Brano>();

        }

        public void addBrano(String titolo, String autore, int durata, String datacreazione, String genere) {
            Brano br = new Brano(titolo, autore, durata, datacreazione, genere);
            ListaBrani.add(br);
        }

        public void ListaBrani(){
            StringBuilder stBui = new StringBuilder();
            for (Brano brV : ListaBrani)
            {
                stBui.append(brV.toString());
            }
        }



    }

