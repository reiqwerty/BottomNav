package com.example.bottomnav.BangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bottomnav.R;

public class PersegiPanjang extends AppCompatActivity {
    Button btnHitung;
    EditText etPanjang;
    EditText etLebar;
    EditText etHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        btnHitung = findViewById(R.id.btnHitung);
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etHasil = findViewById(R.id.etHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String panjangStr = etPanjang.getText().toString();
                String lebarStr = etLebar.getText().toString();

                if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {

                    double panjang = Double.parseDouble(panjangStr);
                    double lebar = Double.parseDouble(lebarStr);

                    double luas = panjang * lebar;
                    etHasil.setText("" + luas);

                } else if (panjangStr.isEmpty() && !lebarStr.isEmpty()) {
                    etPanjang.setError("Masukkan nilai Panjang!");
                } else if (!panjangStr.isEmpty() && lebarStr.isEmpty()) {
                    etLebar.setError("Masukkan nilai Lebar!");
                } else {
                    etPanjang.setError("Masukkan nilai Panjang!");
                    etLebar.setError("Masukkan nilai Lebar!");
                }
            }
        });
    }
}