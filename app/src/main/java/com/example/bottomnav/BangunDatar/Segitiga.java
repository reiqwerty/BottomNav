package com.example.bottomnav.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bottomnav.R;

public class Segitiga extends AppCompatActivity {
    EditText etAlas;
    EditText etTinggi;
    EditText etHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        btnHitung = findViewById(R.id.btnHitung);
        etAlas = findViewById(R.id.etAlas);
        etTinggi = findViewById(R.id.etTinggi);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alasStr = etAlas.getText().toString();
                String tinggiStr = etTinggi.getText().toString();

                if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {

                    double alas = Double.parseDouble(alasStr);
                    double tinggi = Double.parseDouble(tinggiStr);

                    double luas = 0.5 * alas * tinggi;

                    etHasil.setText(String.valueOf(luas));
                } else if (alasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    etAlas.setError("Masukkan nilai Alas!");
                } else if (!alasStr.isEmpty() && tinggiStr.isEmpty()) {
                    etTinggi.setError("Masukkan nilai Tinggi!");
                } else {
                    etAlas.setError("Masukkan nilai Alas!");
                    etTinggi.setError("Masukkan nilai Tinggi!");
                }
            }
        });
    }
}