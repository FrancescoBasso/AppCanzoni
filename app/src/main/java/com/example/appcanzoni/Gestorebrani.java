package com.example.appcanzoni;
import java.util.ArrayList;

    public class Gestorebrani {
        ArrayList<Brano> ListaBrani;

        public Gestorebrani() {
            ListaBrani = new ArrayList<Brano>();


        }

        public void addBrano(String titolo, String autore,) {
            Brano br = new Brano(titolo, autore);
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

