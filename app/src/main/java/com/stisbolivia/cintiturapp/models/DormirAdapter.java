package com.stisbolivia.cintiturapp.models;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DormirAdapter extends RecyclerView.Adapter<DormirAdapter.ViewHolder> {
    private Dormir[] listaDormir;

    public DormirAdapter(Dormir[] listaDormir){
        this.listaDormir = listaDormir;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_donde_dormir,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Dormir dormir = listaDormir[position];
        holder.txtTitulo.setText(listaDormir[position].getTitulo());
        holder.txtDepartamento.setText("camargo");
        //holder.txtDireccion.setText();
    }

    @Override
    public int getItemCount() {
        return listaDormir.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitulo;
        private TextView txtDepartamento;
        private TextView txtDireccion;
        private ImageView imgDormir;

        public ViewHolder(@NonNull View view){
            super(view);
            this.txtTitulo = (TextView)itemView.findViewById(R.id.txt)
        }
    }
}
