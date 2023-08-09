package algoritmo;

import java.util.Arrays;

//Explicação completa: https://joaoarthurbm.github.io/eda/posts/merge-sort/
public class MergeSort {
    //Assinatura menor apenas para facilitar a chamada do sort()
    public <T extends Comparable<T>> void sort(T[] lista) {
        if (lista == null || lista.length <= 1) {
            throw new IllegalArgumentException("A lista deve conter pelo menos dois elementos.");
        }

        sort(lista, 0, lista.length - 1);
    }

    public <T extends Comparable<T>> void sort(T[] lista, int inicio, int fim) {
        //Divide o vetor virtualmente até os subarrays terem tamanho 1
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(lista, inicio, meio);        //Primeiro subarray
            sort(lista, meio + 1, fim); //Segundo subarray

            merge(lista, inicio, meio, fim);
        }
    }

    //Merge: junta dois arrays ordenados em outro ordenado - nesse caso, subarrays de lista[]
    //Primeiro subarray: lista[inicio...meio]
    //Segundo subarray: lista[meio+1...fim]
    private <T extends Comparable<T>> void merge(T[] lista, int inicio, int meio, int fim) {
        //Transfere os elementos entre início e fim a um vetor auxiliar - então não é in-place
        //O vetor original guarda a ordenação, o auxiliar guarda o estado inicial
        T[] aux = Arrays.copyOf(lista, lista.length);

        int i = inicio; //Inicio do primeiro subarray
        int j = meio + 1; //Inicio do segundo subarray
        int k = inicio; //Onde o menor valor, de aux[i] e aux[j], deve ser adicionado

        //Verifica se um dos subarrays acabaram (todos elementos consumidos)
        while (i <= meio && j <= fim) {
            //Caso o primeiro subarray tenha o maior elemento
            if (aux[i].compareTo(aux[j]) <= 0) { //aux[i] <= aux[j]
                lista[k] = aux[i];
                i++;
            } else {
                lista[k] = aux[j];
                j++;
            }
            k++;
        }

        //Se a primeira metade não foi toda consumida, coloca o resto no vetor
        while (i <= meio) {
            lista[k++] = aux[i++]; //A simplificação do ++ poderia ter sido usada acima
        }

        //Se a segunda metade não foi toda consumida, coloca o resto no vetor
        while (j <= fim) {
            lista[k++] = aux[j++];
        }
    }
}
