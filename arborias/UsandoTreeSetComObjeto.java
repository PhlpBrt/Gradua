
package arborias;

import java.util.Iterator;
import java.util.TreeSet;

public class UsandoTreeSetComObjeto {

    public static void main(String[] args) {
        TreeSet<Arvore> arvore = new TreeSet<Arvore>();
        arvore.add(new Arvore(2));
        arvore.add(new Arvore(1));
        arvore.add(new Arvore(3));
        Iterator<Arvore> iterator = arvore.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

}
