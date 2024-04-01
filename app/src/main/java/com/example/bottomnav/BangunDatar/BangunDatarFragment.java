package com.example.bottomnav.BangunDatar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bottomnav.BangunModel;
import com.example.bottomnav.R;

import java.util.ArrayList;

public class BangunDatarFragment extends Fragment implements BangunDatarAdapter.ItemClickListener {
    ArrayList<BangunModel> modelbangundatar = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangun_datar, container, false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvBangunDatar);

        modelbangundatar.add(new BangunModel("Persegi", "https://cdn.icon-icons.com/icons2/2714/PNG/512/rectangle_thin_icon_171559.png"));
        modelbangundatar.add(new BangunModel("Persegi Panjang", "https://cdn.icon-icons.com/icons2/2783/PNG/512/rectangle_icon_177256.png"));
        modelbangundatar.add(new BangunModel("Segitiga", "https://cdn.icon-icons.com/icons2/2518/PNG/512/triangle_icon_151032.png"));
        modelbangundatar.add(new BangunModel("Lingkaran", "https://cdn.icon-icons.com/icons2/2385/PNG/512/circle_icon_144418.png"));

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunDatarAdapter adapter = new BangunDatarAdapter(getContext(),modelbangundatar);
        adapter.setClickListener(this);
        rvBangunDatar.setAdapter(adapter);

        return rootview;
    }

    @Override
    public void onItemClick(View view, int position) {
        BangunModel clickedItem = modelbangundatar.get(position);
        if (clickedItem.getName().equals("Persegi")) {
            Intent intent = new Intent(getActivity(), Persegi.class);
            startActivity(intent);
        } else if (clickedItem.getName().equals("Segitiga")) {
            Intent intent = new Intent(getActivity(), Segitiga.class);
            startActivity(intent);
        } else if (clickedItem.getName().equals("Lingkaran")) {
            Intent intent = new Intent(getActivity(), Lingkaran.class);
            startActivity(intent);
        } else if (clickedItem.getName().equals("Persegi Panjang")) {
                Intent intent = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(intent);
        } else {
            Toast.makeText(getActivity(), "Item tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }
}