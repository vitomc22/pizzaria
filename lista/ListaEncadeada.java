package lista;


public class ListaEncadeada<T> {
    
    private No<T> inicio;
    private int tamanho = 0; 


    public void adiciona(T elemento){ //como nao sabemos o tipo da lista, usamos smepre genericos para ele se adpatar ao tipo da lista em momento de compilação
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;

    }

    public int getTamanho(){
        return tamanho;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ListarEncadeada [inicio=").append(inicio).append("]");
        return builder.toString();
    }

    
}
