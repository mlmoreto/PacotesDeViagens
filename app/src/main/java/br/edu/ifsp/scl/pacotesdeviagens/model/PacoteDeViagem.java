package br.edu.ifsp.scl.pacotesdeviagens.model;

public class PacoteDeViagem {
    private String nomeDestino;
    private String detalhes;
    private String valor;
    private String imagemDestino;

    public PacoteDeViagem(String nomeDestino, String detalhes, String valor, String imagemDestino) {
        this.nomeDestino = nomeDestino;
        this.detalhes = detalhes;
        this.valor = valor;
        this.imagemDestino = imagemDestino;
    }

    public String getNomeDestino() {
        return nomeDestino;
    }

    public void setNomeDestino(String nomeDestino) {
        this.nomeDestino = nomeDestino;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getImagemDestino() {
        return imagemDestino;
    }

    public void setImagemDestino(String imagemDestino) {
        this.imagemDestino = imagemDestino;
    }
}
