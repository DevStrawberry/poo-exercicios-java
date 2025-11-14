package exercicios.caixa;

public class Sapato {
    private int tamanho;
    private String modelo;
    private String cor;

    public Sapato(int tamanho, String modelo, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return this.modelo + ", " +
                this.cor + ", " +
                this.tamanho;
    }
}
