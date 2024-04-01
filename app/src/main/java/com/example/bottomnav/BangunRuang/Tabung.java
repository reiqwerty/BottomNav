package com.example.bottomnav.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bottomnav.R;

public class Tabung extends AppCompatActivity {
    Button btnHitung;
    EditText etJariJari, etTinggi;
    EditText etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        btnHitung = findViewById(R.id.btnHitung);
        etJariJari = findViewById(R.id.etJariJari);
        etTinggi = findViewById(R.id.etTinggi);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariString = etJariJari.getText().toString();
                String tinggiString = etTinggi.getText().toString();

                if (!jariJariString.isEmpty() && !tinggiString.isEmpty()) {
                    double jariJari = Double.parseDouble(jariJariString);
                    double tinggi = Double.parseDouble(tinggiString);
                    double hasil = Math.PI * Math.pow(jariJari, 2) * tinggi;
                    etHasil.setText("" + hasil);
                    etJariJari.setError(null);
                    etTinggi.setError(null);
                } else {
                    if (jariJariString.isEmpty())
                        etJariJari.setError("Masukkan nilai jari-jari!");
                    if (tinggiString.isEmpty())
                        etTinggi.setError("Masukkan nilai tinggi!");
                }
            }
        });

    }
}