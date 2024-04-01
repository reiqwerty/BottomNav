package com.example.bottomnav.BangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bottomnav.R;

public class Balok extends AppCompatActivity {
    Button btnHitung;
    EditText etPanjang, etLebar, etTinggi;
    EditText etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        btnHitung = findViewById(R.id.btnHitung);
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangString = etPanjang.getText().toString();
                String lebarString = etLebar.getText().toString();
                String tinggiString = etTinggi.getText().toString();

                if (!panjangString.isEmpty() && !lebarString.isEmpty() && !tinggiString.isEmpty()) {
                    double panjang = Double.parseDouble(panjangString);
                    double lebar = Double.parseDouble(lebarString);
                    double tinggi = Double.parseDouble(tinggiString);
                    double hasil = panjang * lebar * tinggi;
                    etHasil.setText("" + hasil);
                    etPanjang.setError(null);
                    etLebar.setError(null);
                    etTinggi.setError(null);
                } else {
                    if (panjangString.isEmpty())
                        etPanjang.setError("Masukkan nilai panjang!");
                    if (lebarString.isEmpty())
                        etLebar.setError("Masukkan nilai lebar!");
                    if (tinggiString.isEmpty())
                        etTinggi.setError("Masukkan nilai tinggi!");
                }
            }
        });
    }
}