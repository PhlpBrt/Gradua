package thehuxleymatriz;

import java.util.Scanner;

public class TheHuxLeyMatriz {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int l, c, s = 0, v = 0, x = 0, y = 0, repelente = 3, contV = 0, nAmarelos = 0, nVerde = 0;
        System.out.println("Digite o numero de linhas do seu terreno: ");
        l = ler.nextInt();
        System.out.println("Digite o numero de colunas do seu terreno: ");
        c = ler.nextInt();
        int qij[][] = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite a cor da posição: " + (i + 1) + "-" + (j + 1));
                qij[i][j] = ler.nextInt();
                if (qij[i][j] == 3) {
                    contV++;
                    qij[i][j] = 2;
                }

                if (qij[i][j] == 2) {
                    nAmarelos++;
                }
                if (qij[i][j] == 1) {
                    nVerde++;

                }
            }
        }
        System.out.println("Digite quantas areas foram atingidas: ");
        s = ler.nextInt();
        do {
            x++;
            System.out.println("Digite a cordenada x(linha) de onde foi atingido: ");
            x = ler.nextInt();
            y++;
            System.out.println("Digite a cordenada y(coluna) de onde foi atingido: ");
            y = ler.nextInt();

        } while (x < s && y < s);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (x == qij[i][j] && y == qij[i][j]) {
                    qij[i][j] = 1;
                    nVerde++;
                }

            }

        }

        if (contV > 0) {
            v = ((nVerde * 4) - (contV * repelente)) - nAmarelos;
        } else {
            v = nVerde * 4;
        }
        if (v < 1) {
            System.out.println("prejuizo");
        } else {

            System.out.println(v);
        }
    }
}
