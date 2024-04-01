package com.example.bottomnav.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bottomnav.R;

public class Lingkaran extends AppCompatActivity {
    Button btnHitung;
    EditText etJariJari;
    EditText etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        btnHitung = findViewById(R.id.btnHitung);
        etJariJari = findViewById(R.id.etJariJari);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String jariJariStr = etJariJari.getText().toString();

                if (!jariJariStr.isEmpty()) {

                    double jariJari = Double.parseDouble(jariJariStr);
                    double luas = Math.PI * Math.pow(jariJari, 2);
                    etHasil.setText(String.valueOf(luas));

                } else {
                    etJariJari.setError("Masukkan nilai Jari-jari!");
                }
            }
        });

    }
}