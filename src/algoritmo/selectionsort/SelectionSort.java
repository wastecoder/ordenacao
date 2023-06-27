package algoritmo.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] qualquer = {7, 5, 1, 8, 3};
        int[] ordenado = {0, 2, 4, 5, 7, 8, 9};
        int[] inverso = {95, 87, 54, 45, 32, 23, 12};
        int[] repetido = {9, 9, 9, 4, 4, 0, 3, 3, 1, 4, 3, 4};

        selectionSort(qualquer);
        selectionSort(ordenado);
        selectionSort(inverso);
        selectionSort(repetido);
    }

    public static void selectionSort(int[] lista) {
        System.out.println(">> Antes:  " + Arrays.toString(lista));

        int auxTroca, menorIndice;
        for (int i = 0; i < lista.length - 1; i++) {
            //Encontra a posição do menor número não ordenado
            menorIndice = i;
            for (int j = i; j < lista.length; j++) {
                if (lista[j] < lista[menorIndice]) menorIndice = j;
            }

            //Troca a posição dos menores número com os primeiros valores
            auxTroca = lista[i];
            lista[i] = lista[menorIndice];
            lista[menorIndice] = auxTroca;
        }

        System.out.println(">> Depois: " + Arrays.toString(lista));
    }
}
