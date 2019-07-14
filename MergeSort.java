package buscaeordenacao;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int metade = n / 2;
        int[] left = Arrays.copyOfRange(array, 0, metade);
        int[] right = Arrays.copyOfRange(array, metade, n);

        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);

    }

    public void merge(int[] left, int[] right, int[] finalArray) {
        int nLeft = left.length;
        int nRight = right.length;

        int indexLeft = 0;
        int indexRight = 0;
        int indexArray = 0;

        while (indexLeft < nLeft && indexRight < nRight) {
            if (left[indexLeft] <= right[indexRight]) {
                finalArray[indexArray] = left[indexLeft];
                indexLeft++;
            } else {
                finalArray[indexArray] = right[indexRight];
                indexRight++;
            }
            indexArray++;
        }
        while (indexLeft < nLeft) {
            finalArray[indexArray] = left[indexArray];
            indexLeft++;
            indexArray++;
        }
        while (indexRight < nRight) {
            finalArray[indexArray] = right[indexArray];
            indexRight++;
            indexArray++;
        }
    }
}
