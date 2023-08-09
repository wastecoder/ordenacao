package algoritmo;

public class SelectionSort {
    public <T extends Comparable<T>> void sort(T[] lista) {
        int menorIndice;
        T auxTroca;
        for (int i = 0; i < lista.length - 1; i++) {
            //Encontra a posi��o do menor n�mero n�o ordenado
            menorIndice = i;
            for (int j = i; j < lista.length; j++) {
                //TODO: explicar o compareTo() na parte de ordena��o pronta do Java
                //(lista[j] < lista[menorIndice])
                if (lista[j].compareTo(lista[menorIndice]) < 0) menorIndice = j;
            }

            //Troca a posi��o dos menores n�meros com os primeiros valores
            auxTroca = lista[i];
            lista[i] = lista[menorIndice];
            lista[menorIndice] = auxTroca;
        }
    }
}
