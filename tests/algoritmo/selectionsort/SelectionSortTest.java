package algoritmo.selectionsort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest extends SelectionSort<Integer> {
    /*
    Por herdar a classe SelectionSort como Integer,
    a classe atual não precisa instanciar a classe
    SelectionSort ao testar valores inteiros em cada método.

    Mas ao testar outros tipos precisa. Para instanciar
    há duas formas simples, mostrei elas nos últimos
    exemplos ao ordenar usando String.
     */

    /*
    Todos testes comparam a ordenação do meu SelectionSort
    com a ordenação do Java, do Arrays.sort()

    Isso aumenta a confiabilidade e manutenibilidade.
    Confiabilidade: a ordenação do Java já foi testada rigorosamente.
    Manutenibilidade: ao alterar o valor de entrada, não precisa
    alterar o valor esperado da saída manualmente.
     */
    @Test
    void numerosAleatorios() {
        Integer[] numerosAleatorios = {7, 5, 1, 8, 3};
        Integer[] retornoEsperado = numerosAleatorios.clone();

        sort(numerosAleatorios);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, numerosAleatorios);
    }

    @Test
    void numerosOrdenados() {
        Integer[] numerosOrdenados = {0, 2, 4, 5, 7, 8, 9};
        Integer[] retornoEsperado = numerosOrdenados.clone();

        sort(numerosOrdenados);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, numerosOrdenados);
    }

    @Test
    void numerosInvertidos() {
        Integer[] numerosInvertidos = {95, 87, 54, 45, 32, 23, 12};
        Integer[] retornoEsperado = numerosInvertidos.clone();

        sort(numerosInvertidos);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, numerosInvertidos);
    }

    @Test
    void numerosRepetidos() {
        Integer[] numerosInvertidos = {9, 9, 9, 4, 4, 0, 3, 3, 1, 4, 3, 4};
        Integer[] retornoEsperado = numerosInvertidos.clone();

        sort(numerosInvertidos);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, numerosInvertidos);
    }

    @Test
    void stringAleatoria() {
        String[] stringAleatoria = {"A", "M", "I", "M", "I", "R"};
        String[] retornoEsperado = stringAleatoria.clone();

        Arrays.sort(retornoEsperado);

        SelectionSort<String> ordenador = new SelectionSort<>(); //Guardando variável
        ordenador.sort(stringAleatoria);

        assertArrayEquals(retornoEsperado, stringAleatoria);
    }

    @Test
    void stringOrdenada() {
        String[] stringOrdenada = {"A", "B", "C", "D", "H", "J"};
        String[] retornoEsperado = stringOrdenada.clone();

        new SelectionSort<String>().sort(stringOrdenada); //Não guardando variável
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, stringOrdenada);
    }

    @Test
    void stringInvertida() {
        String[] stringInvertida = {"R", "I", "C", "A",};
        String[] retornoEsperado = stringInvertida.clone();

        new SelectionSort<String>().sort(stringInvertida);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, stringInvertida);
    }
}