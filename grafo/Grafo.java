package grafo;

import java.util.ArrayList;
import java.util.Iterator;

public class Grafo {

    int nArestas;
    ArrayList<Node> listaVertice;
    ArrayList<Aresta> listaAresta;

    public Grafo(int nArestas) {
        listaAresta = new ArrayList<Aresta>();
        listaVertice = new ArrayList<Node>();
        this.nArestas = nArestas;
        inicioGrafo(nArestas);
    }

    private void inicioGrafo(int nArestas) {
        for (int i = 0; i < nArestas; i++) {
            Node aux = new Node(i);
            listaVertice.add(aux);
        }
    }

    public void arestaAdd(int inicio, int fim, int peso) {

        if (inicio < 0 || fim < 0 || peso < 0) {
            System.out.println("Erro");
        } else {
            Node iniciaN = new Node();
            Node fimN = new Node();

            for (Node e : listaVertice) {
                if (inicio == e.n) {
                    iniciaN = e;
                }
                if (fim == e.n) {
                    fimN = e;
                }
            }
            Aresta teste = new Aresta(iniciaN, fimN, peso);
            listaAresta.add(teste);

            System.out.println("Adicionado");

        }
    }

    public void imprimir() {
        Iterator it = listaAresta.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void imprimir2() {
        for (int i = 0; i < listaAresta.size(); i++) {
            System.out.println(listaAresta.get(i));
        }
    }
}
