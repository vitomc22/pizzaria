package lista;


public class ListaEncadeada<T> {
    
    private No<T> inicio;


    public void adiciona(T elemento){ //como nao sabemos o tipo da lista, usamos smepre genericos para ele se adpatar ao tipo da lista em momento de compilação
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;

    }


    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

    
}
