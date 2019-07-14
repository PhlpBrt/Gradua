package grafo;

public class Aresta {

    Node inicio;
    Node fim;
    int peso;

    public Aresta(Node inicio, Node fim, int peso) {
        this.inicio = inicio;
        this.fim = fim;
        this.peso = peso;
    }
}

