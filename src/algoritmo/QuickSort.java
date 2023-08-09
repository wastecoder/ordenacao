package algoritmo;

//Explicação completa: https://joaoarthurbm.github.io/eda/posts/quick-sort/
public class QuickSort {
    public <T extends Comparable<T>> void sort(T[] lista) {
        sort(lista, 0, lista.length - 1);
    }

    public <T extends Comparable<T>> void sort(T[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = partition(lista, inicio, fim);
            sort(lista, inicio, posicaoPivo - 1); //Esquerda do pivô
            sort(lista, posicaoPivo + 1, fim);   //Direita do pivô
            //O pivô não é mandado de novo, pois já está na posição correta
            //Repete até fazer o mesmo no vetor inteiro (left >= right)
        }
    }

    //Troca os valores de um vetor entre duas posições
    public <T extends Comparable<T>> void trocar(T[] lista, int posicao1, int posicao2) {
        T aux = lista[posicao1];
        lista[posicao1] = lista[posicao2];
        lista[posicao2] = aux;
    }

    /*
    Particionamento de Lomuto - é mais simples, mas menos eficiente que o de Hoare.
    Nele é escolhido um elemento como pivô, depois é colocado os menores a esquerda e os maiores a direita dele.
    Abaixo o pivô é sempre o primeiro. Poderia ser escolhido outra posição, como será discutido abaixo.
    Após fazer isso, troca o pivô com o último à direita dos ordenados, assim ele fica na sua posição correta.
    Isso é repetido com o subarray a esquerda e à direita do pivô.
    */
    public <T extends Comparable<T>> int partition(T[] lista, int esquerda, int direita) {
        T pivo = lista[esquerda]; //Escolhe o primeiro elemento como pivô

        //i = posição onde ficará quem é menor que o pivô
        //Esquerda é onde está o pivô, porém ele só irá mudar de lugar no final
        int i = esquerda;

        //Vai procurar elementos menores que o pivô (por isso esquerda+1)
        for (int j = esquerda + 1; j <= direita; j++) {
            if (lista[j].compareTo(pivo) <= 0) {
                i += 1; //Aumenta i para não pegar o pivô ou quem já tá na lista dos menores
                trocar(lista, i, j); //Coloca os menores valores encontrados no início do subarray (a frente do pivô)
            }
        }

        //Troca o pivô (lista[esquerda]) com i -- vai ser o último da direita.
        //Ou seja, o pivô fica na posição correta e não precisa mais ser comparado.
        trocar(lista, esquerda, i);

        return i; //Retorna a posição do pivô
    }

    /*
    Pior caso: n^2
    Ocorre quando a lista está ordenada, ou quase, de forma crescente ou decrescente.
    Nisso é escolhido sempre o primeiro ou último elemento como pivô, resultando
    em um dos subarrays ficar vazio e outro não.
     */

    /*
    O pior caso é raro de acontecer, mas há técnicas para evitá-lo:
    1. Escolher o pivô aleatoriamente
    2. Escolher o pivô por mediana entre o início e fim
    */
}
