package br.edu.ifsp.scl.pacotesdeviagens.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.edu.ifsp.scl.pacotesdeviagens.R;
import br.edu.ifsp.scl.pacotesdeviagens.model.PacoteDeViagem;

public class PacoteDeViagemAdapter extends RecyclerView.Adapter<PacoteDeViagemAdapter.PacoteViewHolder> {

    List<PacoteDeViagem> pacotes;

    Context context;

    public PacoteDeViagemAdapter(List<PacoteDeViagem> pacotes){
        this.pacotes = pacotes;
    }

    @Override
    public int getItemCount() {
        return this.pacotes.size();
    }

    @NonNull
    @Override
    public PacoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_pacotes, parent, false);
        this.context = parent.getContext();
        return new PacoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PacoteViewHolder holder, int position) {
        PacoteDeViagem pacote = pacotes.get(position);
        holder.nomeDestino.setText(pacote.getNomeDestino());
        holder.detalhes.setText(pacote.getDetalhes());
        holder.valor.setText(pacote.getValor());
        holder.imgBook.setImageResource(context.getResources().getIdentifier(pacote.getImagemDestino(), "drawable", context.getPackageName()));
    }

    public class PacoteViewHolder extends RecyclerView.ViewHolder {
        final TextView nomeDestino;
        final TextView detalhes;
        final TextView valor;
        final ImageView imgBook;

        public PacoteViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeDestino = itemView.findViewById(R.id.txtNomeDestino);
            detalhes = itemView.findViewById(R.id.txtDetalhes);
            valor = itemView.findViewById(R.id.txtValor);
            imgBook = itemView.findViewById(R.id.imgDestino);
        }

    }

}
