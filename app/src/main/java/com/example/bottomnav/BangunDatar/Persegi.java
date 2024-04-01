package com.example.bottomnav.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bottomnav.R;

public class Persegi extends AppCompatActivity {
    Button btnHitung;
    EditText etSisi;
    EditText etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        btnHitung = findViewById(R.id.btnHitung);
        etSisi = findViewById(R.id.etSisi);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sisiString = etSisi.getText().toString();

                if (!sisiString.isEmpty()) {
                    int sisi = Integer.parseInt(sisiString);
                    int hasil = sisi * sisi;
                    etHasil.setText("" + hasil);
                    etSisi.setError(null);
                } else {
                    etSisi.setError("Masukkan nilai sisi!");
                }
            }
        });
    }
}