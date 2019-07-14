package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String normal, menor;
        String invertida;
        System.out.println("Digite a palavra ou frase: ");
        normal = ler.nextLine();
        menor = normal.toLowerCase();
        menor = normal.replaceAll(" ", "");
        invertida = new StringBuffer(menor).reverse().toString().replace(" ", "");
        if (menor.equalsIgnoreCase(invertida)) {

            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }

}
