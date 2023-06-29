package algoritmo;

public class BubbleSort<T extends Comparable<T>> {
    public void bubbleSort(T[] lista) {
        T auxTroca;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                //Verifica se o atual é maior do que o próximo dele
                if (lista[j].compareTo(lista[j + 1]) > 0) {
                    //Troca os valores entre as posições
                    auxTroca = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = auxTroca;
                }
            }
        }
    }
}
