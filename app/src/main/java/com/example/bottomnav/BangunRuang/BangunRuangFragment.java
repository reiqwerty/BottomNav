package com.example.bottomnav.BangunRuang;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bottomnav.BangunDatar.BangunDatarAdapter;
import com.example.bottomnav.BangunDatar.Lingkaran;
import com.example.bottomnav.BangunDatar.Persegi;
import com.example.bottomnav.BangunDatar.PersegiPanjang;
import com.example.bottomnav.BangunDatar.Segitiga;
import com.example.bottomnav.BangunModel;
import com.example.bottomnav.MainActivity;
import com.example.bottomnav.R;

import java.util.ArrayList;

public class BangunRuangFragment extends Fragment implements BangunRuangAdapter.ItemClickListener, BangunDatarAdapter.ItemClickListener {
    ArrayList<BangunModel> modelBangunRuang = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangun_ruang,container,false);
        RecyclerView rvBangunRuang = rootview.findViewById(R.id.rvBangunRuang);

        modelBangunRuang.add(new BangunModel("Kubus","https://try24.files.wordpress.com/2012/01/kubus.png"));
        modelBangunRuang.add(new BangunModel("Bola","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgQNSH7aGy0ifHaHJ9WNG7gW77EVipUfR68jb40o-3lT3YfqRq5CIikkrEzRJp9bc12h8sxFU_TXTNQajt28PMi7I6pkmok82PEX3KGSZN3BYEgZ-5KRR0-qkroe5CPH2PP5i_Wr42VymA/s1600/bola.png"));
        modelBangunRuang.add(new BangunModel("Balok","https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Cuboid_simple.svg/240px-Cuboid_simple.svg.png"));
        modelBangunRuang.add(new BangunModel("Tabung","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Cylinder_geometry.svg/1200px-Cylinder_geometry.svg.png"));

        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunRuangAdapter adapter = new BangunRuangAdapter(getContext(),modelBangunRuang);
        adapter.setClickListener(this);
        rvBangunRuang.setAdapter(adapter);

        return rootview;
    }
    @Override
    public void onItemClick(View view, int position) {
        BangunModel clickedItem = modelBangunRuang.get(position);
        if (clickedItem.getName().equals("Kubus")) {
            Intent intent = new Intent(getActivity(), Kubus.class);
            startActivity(intent);
        } else if (clickedItem.getName().equals("Bola")) {
            Intent intent = new Intent(getActivity(), Bola.class);
            startActivity(intent);
        } else if (clickedItem.getName().equals("Balok")) {
            Intent intent = new Intent(getActivity(), Balok.class);
            startActivity(intent);
        } else if (clickedItem.getName().equals("Tabung")) {
            Intent intent = new Intent(getActivity(), Tabung.class);
            startActivity(intent);
        } else {
            Toast.makeText(getActivity(), "Item tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }
}