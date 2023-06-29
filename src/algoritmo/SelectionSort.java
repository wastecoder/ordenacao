package algoritmo;

public class SelectionSort<T extends Comparable<T>> {
    public void sort(T[] lista) {
        int menorIndice;
        T auxTroca;
        for (int i = 0; i < lista.length - 1; i++) {
            //Encontra a posição do menor número não ordenado
            menorIndice = i;
            for (int j = i; j < lista.length; j++) {
                //TODO: explicar o compareTo() na parte de ordenação pronta do Java
                if (lista[j].compareTo(lista[menorIndice]) < 0) menorIndice = j;
            }

            //Troca a posição dos menores número com os primeiros valores
            auxTroca = lista[i];
            lista[i] = lista[menorIndice];
            lista[menorIndice] = auxTroca;
        }
    }
}
