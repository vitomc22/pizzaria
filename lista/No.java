package lista;
public class No<T> { //estamos definindo um tipo genérico, assim como template em c++, ele assumirá um tipo em tempo de compilação 
    
    private T elemento;
    private No<T> proximo;      
    
    
    
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }


    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }


    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", proximo=" + proximo + "]";  //só pra facilitar gerar no terminal

    }
    
    
}
