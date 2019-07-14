package grafo;

import java.util.Scanner;

public class ClasseTeste {

    public static void main(String[] args) {

        Grafo grafo;
        Scanner ent = new Scanner(System.in);
        int tentativa = 10, a, b, c, vGraf;
        System.out.println("Digite o número de vertices do grafo:");
        vGraf = ent.nextInt();
        grafo = new Grafo(vGraf);
        do {
            System.out.println("Digite 1 para adicionar aresta, 2 para exibir ou 0 para sair");
            tentativa = ent.nextInt();
            switch (tentativa) {
                case 1:
                    System.out.println("Para adicionar uma aresta, digite vertice de inicio, vertice final e peso");
                    System.out.println("Digite a vertice de inicio:");
                    a = ent.nextInt();
                    System.out.println("Digite a vertice final:");
                    b = ent.nextInt();
                    System.out.println("Digite o peso:");
                    c = ent.nextInt();
                    grafo.arestaAdd(a, b, c);
                    break;
                case 2:
                    System.out.println("Imprimindo...");
                    grafo.imprimir();
                    System.out.println("Teste 2");
                    grafo.imprimir2();
                    break;
                case 3:
                    System.out.println("Opção Inválida");
                    break;

            }

        } while (tentativa != 0);
    }
}
