package com.example.practica_5_lista;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorGrupos extends RecyclerView.Adapter<AdaptadorGrupos.ViewHolder> {

    private GrupoMusical[] lista;

    public AdaptadorGrupos(GrupoMusical[] lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GrupoMusical grupoMusical = lista[position];
        holder.textView.setText(grupoMusical.getTitle());
        holder.imageView.setImageResource(
                holder.imageView.getContext().getResources().getIdentifier(
                        grupoMusical.getImage(),
                        "drawable",
                        holder.imageView.getContext().getPackageName()
                )
        );
    }

    @Override
    public int getItemCount() {
        return lista.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textoACDC);
            imageView = itemView.findViewById(R.id.imagenACDC);
        }
    }
}
