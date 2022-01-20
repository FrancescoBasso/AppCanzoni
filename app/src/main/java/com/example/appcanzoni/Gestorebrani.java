package com.example.appcanzoni;

import java.util.ArrayList;

public class Gestorebrani {


        ArrayList<Brano> ListaBrani;

        public Gestorebrani() {
            ListaBrani = new ArrayList<Brano>();

        }

        public void addBrano(String titolo, String autore, int durata, String datacreazione, String genere) {
            Brano br = new Brano(titolo, autore, durata, datacreazione, genere);
            ListaBrani.add(br);
        }

        public StringBuilder ListaBrani(){
            StringBuilder stBui = new StringBuilder();
            for (Brano brV : ListaBrani)
            {
                stBui.append(brV.toString());
            }

            return stBui;
        }



    }

