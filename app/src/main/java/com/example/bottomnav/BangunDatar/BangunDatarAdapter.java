package com.example.bottomnav.BangunDatar;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.bottomnav.BangunModel;
import com.example.bottomnav.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BangunDatarAdapter extends RecyclerView.Adapter<BangunDatarAdapter.MyViewHolder> {
    Context context;
    ArrayList<BangunModel> modelbangundatar;
    ItemClickListener mClickListener;

    public BangunDatarAdapter(Context context, ArrayList<BangunModel> modelbangundatar) {
        this.context = context;
        this.modelbangundatar = modelbangundatar;
    }

    @NonNull
    @Override
    public BangunDatarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_bangun_datar, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangunDatarAdapter.MyViewHolder holder,  int position) {
        holder.tvnamebangdatar.setText(modelbangundatar.get(position).getName());
        Glide.with(context).load(modelbangundatar.get(position).getImg()).into(holder.imagesbangundatar);
    }

    @Override
    public int getItemCount() {
        return modelbangundatar.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imagesbangundatar;
        TextView tvnamebangdatar;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            imagesbangundatar = itemView.findViewById(R.id.imagesbangundatar);
            tvnamebangdatar = itemView.findViewById(R.id.tvnamebangdatar);

            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener{
        void onItemClick(View view,int position);
    }
}
