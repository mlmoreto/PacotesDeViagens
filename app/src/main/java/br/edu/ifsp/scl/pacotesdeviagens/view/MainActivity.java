package br.edu.ifsp.scl.pacotesdeviagens.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsp.scl.pacotesdeviagens.R;
import br.edu.ifsp.scl.pacotesdeviagens.adapter.PacoteDeViagemAdapter;
import br.edu.ifsp.scl.pacotesdeviagens.model.PacoteDeViagem;

public class MainActivity extends AppCompatActivity {

    List<PacoteDeViagem> pacotes = new ArrayList<>();
    static PacoteDeViagemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("MLM - Agência de Viagens");

        // Cria objetos
        PacoteDeViagem salvador = new PacoteDeViagem("Salvador - BA",
                "4 diárias",
                "Apenas R$1200,00",
                "img_salvador");

        pacotes.add(salvador);

        PacoteDeViagem ilhabela = new PacoteDeViagem("Ilhabela - SP",
                "3 diárias",
                "Apenas R$1500,00",
                "img_ilhabela");

        pacotes.add(ilhabela);

        PacoteDeViagem morroSaoPaulo = new PacoteDeViagem("Morro de São Paulo - BA",
                "5 diárias",
                "Apenas R$3000,00",
                "img_morro_sp");

        pacotes.add(morroSaoPaulo);

        PacoteDeViagem portoDeGalinhas = new PacoteDeViagem("Porto de Galinhas - PE",
                "7 diárias",
                "Apenas R$2000,00",
                "img_porto_galinhas");

        pacotes.add(portoDeGalinhas);

        PacoteDeViagem monteVerde = new PacoteDeViagem("Monte Verde - MG",
                "2 diárias",
                "Apenas R$789,99",
                "img_monte_verde");

        pacotes.add(monteVerde);

        PacoteDeViagem camposDoJordao = new PacoteDeViagem("Campos do Jordão - SP",
                                                              "3 diárias",
                                                                "Apenas R$899,99",
                                                         "img_campos_do_jordao");

        pacotes.add(camposDoJordao);

        PacoteDeViagem rioDeJaneiro = new PacoteDeViagem("Rio de Janeiro - RJ",
                "3 diárias + Voo",
                "Apenas R$1400,00",
                "img_rj");

        pacotes.add(rioDeJaneiro);

        PacoteDeViagem beloHorizonte = new PacoteDeViagem("Belo Horizonte - MG",
                "3 diárias + Voo",
                "Apenas R$1700,00",
                "img_bh");

        pacotes.add(beloHorizonte);


        RecyclerView recyclerView = findViewById(R.id.rvPacotes);

        LinearLayoutManager layout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layout);

        adapter = new PacoteDeViagemAdapter(pacotes);

        recyclerView.setAdapter(adapter);
    }
}
