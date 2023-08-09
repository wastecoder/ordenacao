package algoritmo;

public class InsertionSort {
    public <T extends Comparable<T>> void sort(T[] lista) {
        T chave;
        int j;
        //1 porque a posição 0 se inicia como sub-vetor ordenado
        for (int i = 1; i < lista.length; i++) {
            chave = lista[i]; //Chave = quem vamos ordenar (desordenado)
            j = i - 1; //j = todos à esquerda da chave (sub-vetor já ordenado)

            //Troca a chave com o valor a esquerda quando ela é maior
            while (j >= 0 && lista[j].compareTo(chave) > 0) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = chave;
        }
    }
}
