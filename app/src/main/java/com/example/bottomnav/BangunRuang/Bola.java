package com.example.bottomnav.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bottomnav.R;

public class Bola extends AppCompatActivity {
    Button btnHitung;
    EditText etJariJari;
    EditText etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        btnHitung = findViewById(R.id.btnHitung);
        etJariJari = findViewById(R.id.etJariJari);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariString = etJariJari.getText().toString();

                if (!jariJariString.isEmpty()) {
                    double jariJari = Double.parseDouble(jariJariString);
                    double hasil = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
                    etHasil.setText("" + hasil);
                    etJariJari.setError(null);
                } else {
                    etJariJari.setError("Masukkan nilai jari-jari!");
                }
            }
        });

    }
}