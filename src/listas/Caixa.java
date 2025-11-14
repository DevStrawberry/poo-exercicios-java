package listas;

public class Caixa<T> {
    private T valor;

    public T devolver() {
        return valor;
    }

    public void guardar(T valor) {
        this.valor = valor;
    }
}
