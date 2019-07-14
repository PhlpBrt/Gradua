package implementahash;

import java.util.Scanner;

public class ImplementaHash {

    int vetorHash[];
    int x;

    public ImplementaHash() {
        this.x = 40;
        this.vetorHash = new int[x];

    }

    public void add(int num) {
        int posicao = num % x;
        if (vetorHash[posicao] == 0) {
            vetorHash[posicao] = num;
        } else {
            for (int i = posicao; i < vetorHash.length; i++) {
                if (vetorHash[i] == 0) {
                    vetorHash[i] = num;
                    break;
                } else {
                    if (vetorHash[0] != 0) {
                        for (int x = 0; x < vetorHash.length; x++) {
                            if (vetorHash[x] == 0) {
                                vetorHash[x] = num;
                                break;
                            }
                        }
                        break;
                    }
                    vetorHash[0] = num;
                }
            }
        }
    }

    public void exibir() {
        for (int i = 0; i < vetorHash.length; i++) {
            System.out.println("Posição " + i + " = " + vetorHash[i]);
        }
    }

    public void remover(int n) {
        int posicao = n % x;
        if (vetorHash[posicao] == n) {
            vetorHash[posicao] = 0;
        } else {
            for (int i = posicao; i < vetorHash.length; i++) {
                if (vetorHash[i] == n) {
                    vetorHash[i] = 0;

                } else {
                    for (int z = 0; z < vetorHash.length; z++) {
                        if (vetorHash[z] == n) {
                            vetorHash[z] = 0;

                        }

                    }

                }
                break;
            }

        }

    }

    public void teste() {
        Scanner ent = new Scanner(System.in);
        int tentativa = 0;

        do {
            System.out.println("Digite: \n 1 - Para Adição \n 2 - Para Remoção \n 3 - Para Exibir \n 4 - Para Sair.\n _____________________________");
            tentativa = ent.nextInt();
            switch (tentativa) {
                case 1:
                    System.out.println("Digite o número a ser adicionado: ");
                    int x;
                    x = ent.nextInt();
                    add(x);
                    break;
                case 2:
                    System.out.println("Digite o número a ser removido: ");
                    int r;
                    r = ent.nextInt();
                    remover(r);
                    break;
                case 3:
                    System.out.println("Seu Hash: ");
                    exibir();
                    break;
            }

        } while (tentativa != 4);
    }
}
