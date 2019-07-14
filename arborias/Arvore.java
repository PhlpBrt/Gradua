/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arborias;

/**
 *
 * @author phili
 */
public class Arvore implements Comparable<Arvore> {

    int altura;

    public Arvore(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return altura + "";
    }

    @Override
    public int compareTo(Arvore t) {
        return t.altura;
    }

}
