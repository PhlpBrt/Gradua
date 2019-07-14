package arvorebinaria;

public class ArvoreBinaria {

    private Elemento raiz;
    private ArvoreBinaria left;
    private ArvoreBinaria rigth;

    public ArvoreBinaria() {
        this.raiz = raiz;
        this.left = null;
        this.rigth = null;
    }

    public ArvoreBinaria(Elemento raiz) {
        this.raiz = raiz;
        this.left = null;
        this.rigth = null;
    }

    public Elemento getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento raiz) {
        this.raiz = raiz;
    }

    public ArvoreBinaria getLeft() {
        return left;
    }

    public void setLeft(ArvoreBinaria left) {
        this.left = left;
    }

    public ArvoreBinaria getRigth() {
        return rigth;
    }

    public void setRigth(ArvoreBinaria rigth) {
        this.rigth = rigth;
    }

    public boolean isEmpty() {
        return (raiz == null);
    }

    public void inserir(Elemento novo) {
        if (isEmpty()) {
            raiz = novo;
            System.out.println("Inseri o elemento *" + novo.getValor() + "* na raiz da árvore");
        } else {
            ArvoreBinaria arvore = new ArvoreBinaria(novo);
            if (novo.getValor() < raiz.getValor()) {
                if (left == null) {
                    left = arvore;
                    System.out.println("Inseri o elemento *" + novo.getValor() + "* a esquerda de " + raiz.getValor());
                } else {
                    left.inserir(novo);

                }
            } else if (novo.getValor() > raiz.getValor()) {
                if (rigth == null) {
                    rigth = arvore;
                    System.out.println("Inseri o elemento *" + novo.getValor() + "* a direita de " + raiz.getValor());
                } else {
                    rigth.inserir(novo);

                }

            }
        }

    }

    public ArvoreBinaria remover(Elemento elem) {
        if (raiz.getValor() == elem.getValor()) {
            if (left == null && rigth == null) {
                return null;
            } else {
                if (left != null && rigth == null) {
                    return left;
                } else if (rigth != null && left == null) {
                    return rigth;
                } else {
                    ArvoreBinaria aux = left;
                    while (aux.rigth != null) {
                        aux = aux.rigth;

                    }
                    raiz = aux.getRaiz();
                    aux.setRaiz(elem);
                    left = left.remover(elem);
                }

            }
        } else if (elem.getValor() < raiz.getValor()) {
            left = left.remover(elem);
        } else if (elem.getValor() > raiz.getValor()) {
            rigth = rigth.remover(elem);
        }
        return this;
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print(raiz.getValor() + " ");
            if (left != null) {
                left.print();
            }
            if (rigth != null) {
                rigth.print();
            }
        }
    }

}
