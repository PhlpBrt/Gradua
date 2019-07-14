package buscaeordenacao;

public class BubbleSort {

    public void ordena(int[] array) {
        boolean teste;
        int aux = 0;
        do {
            teste = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    teste = true;
                }
            }

        } while (teste);

    }

}
