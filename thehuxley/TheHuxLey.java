package thehuxley;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TheHuxLey {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,00");
        float h, k, s, hzin, kzin, szin, xh = 34, zh = 220, xk = 0, zk = 0, xs = 140, zs = 456, yh = 110, yk = 64, ys = 200;
        System.out.println("Digite a longitude de steve: ");
        int x = ler.nextInt();
        System.out.println("Digite a latitude de steve: ");
        int z = ler.nextInt();

        hzin = (float) Math.sqrt(Math.pow((x - xh), 2) + Math.pow((z - zh), 2));
        kzin = (float) Math.sqrt(Math.pow((x - xk), 2) + Math.pow((z - zk), 2));
        szin = (float) Math.sqrt(Math.pow((x - xs), 2) + Math.pow((z - zs), 2));
        h = hzin;
        k = kzin;
        s = szin;
        System.out.println("Distancia para Hogsmeade: " + df.format(h));
        System.out.println("Distancia para Kakariko: " + df.format(k));
        System.out.println("Distancia para Solitude: " + df.format(s));

    }

}
