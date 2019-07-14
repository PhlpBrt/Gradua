package arvorebinaria;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione a opção que deseja: \n 1 - Inserir: \n 2 "
                + "- Remover: \n 3 - Imprimir \n 0 - Para Sair!!!");
        int a = 10;
        do {
            a = scan.nextInt();
            switch (a) {
                case 1:
                    char i;
                    System.out.println("Digite a letra que deseja inserir: ");
                    i = scan.next().charAt(0);
                    arvore.inserir(new Elemento(i));
                    System.out.println("Selecione a opção que deseja: \n 1 - Inserir: \n 2 "
                            + "- Remover: \n 3 - Imprimir \n 0 - Para Sair!!!");
                    break;
                case 2:
                    char r;
                    System.out.println("Digite a letra que deseja remover: ");
                    r = scan.next().charAt(0);
                    arvore.remover(new Elemento(r));
                    System.out.println("Selecione a opção que deseja: \n 1 - Inserir: \n 2 "
                            + "- Remover: \n 3 - Imprimir \n 0 - Para Sair!!!");
                    break;
                case 3:
                    System.out.println("----Arvore atual----");
                    arvore.print();
                    System.out.println("\n----Finalizada----");
                    System.out.println("");
                    System.out.println("Selecione a opção que deseja: \n 1 - Inserir: \n 2 "
                            + "- Remover: \n 3 - Imprimir \n 0 - Para Sair!!!");
                    break;
            }

        } while (a != 0);
    }
}
