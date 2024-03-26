package com.example.bottomnav;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BangunDatarFragment extends Fragment implements BangunDatarAdapter.ItemClickListener{

    ArrayList<BangunModel> modelbangundatar = new ArrayList<>();
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangun_datar,container,false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvBangunDatar);

        modelbangundatar.add(new BangunModel("sds","https://www.google.com/url?sa=i&url=http%3A%2F%2Fpersadapendidikan.blogspot.com%2F2010%2F11%2Fvolume-bangun-ruang-kubus.html&psig=AOvVaw1Lek1epVpGqJu54bw8HJ-D&ust=1711427149082000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCODE4ovJjoUDFQAAAAAdAAAAABAE"));
        modelbangundatar.add(new BangunModel("fsdf","https://www.google.com/url?sa=i&url=https%3A%2F%2Froboguru.ruangguru.com%2Fquestion%2Fbangun-ruang-di-atas-disebut-_QU-FHWS0P3Y&psig=AOvVaw1HokreHCrc3VpcLRScdD_G&ust=1711427711072000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCPDe1Z3LjoUDFQAAAAAdAAAAABAE"));
        modelbangundatar.add(new BangunModel("sf","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cnnindonesia.com%2Fedukasi%2F20230224175548-569-917575%2Fpengertian-sifat-dan-rumus-rumus-balok-lengkap-dengan-penjelasan&psig=AOvVaw1X1bb4m5pXebdyHKjottZu&ust=1711427779408000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNDcpLjLjoUDFQAAAAAdAAAAABAE"));
        modelbangundatar.add(new BangunModel("fsdfs","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.kompas.com%2Fskola%2Fread%2F2022%2F01%2F12%2F144952269%2Funsur-unsur-bangun-ruang-kerucut%3Fpage%3Dall&psig=AOvVaw1jrqMNI-I0Rfu4KZn2QJLQ&ust=1711519347729000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNCswsagkYUDFQAAAAAdAAAAABAE"));

        // Inflate the layout for this fragment
        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunDatarAdapter adapter = new BangunDatarAdapter(getContext(),modelbangundatar);
        rvBangunDatar.setAdapter(adapter);

        return rootview;
    }
    @Override
    public void onItemClick(View view, int position) {

    }
}
