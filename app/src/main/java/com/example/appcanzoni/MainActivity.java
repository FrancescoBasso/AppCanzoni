package com.example.appcanzoni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    Button btnApri;
    EditText txtTitolo1;
    EditText txtAutore1;
    EditText txtDurata1;
    EditText txtDatacreazione1;
    Spinner spnGeneri;
    String[] generi = {"Pop", "Rock", "Dance", "Rap"};
    Gestorebrani gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        btnApri = (Button) findViewById(R.id.btnApri);
        txtTitolo1 = (EditText) findViewById(R.id.txtTitolo1);
        txtAutore1 = (EditText) findViewById(R.id.txtAutore1);
        txtDurata1 = (EditText) findViewById(R.id.txtDurata1);
        txtDatacreazione1 = (EditText) findViewById(R.id.txtDatacreazione1);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);
        ArrayAdapter<String> aaG = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,generi);
        spnGeneri.setAdapter(aaG);
        gb = new Gestorebrani();
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String genSelez = spnGeneri.getSelectedItem().toString();
                gb.addBrano(txtTitolo1.getText().toString(),txtAutore1.getText().toString(),Integer.parseInt(txtDurata1.getText().toString()),
                        txtDatacreazione1.getText().toString(),genSelez);

            }
        });

        btnApri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder string_fin = new StringBuilder();
                string_fin = gb.ListaBrani();
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("string_fin",string_fin.toString());
                startActivity(i);
            }
        });

    }



    }
