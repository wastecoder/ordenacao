package algoritmo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest extends BubbleSort<Integer> {

    @Test
    void integerAleatorios() {
        Integer[] integerAleatorios = {7, 5, 1, 8, 3};
        Integer[] retornoEsperado = integerAleatorios.clone();

        bubbleSort(integerAleatorios);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, integerAleatorios);
    }

    @Test
    void integerInvertidos() {
        Integer[] integerInvertidos = {95, 87, 54, 45, 32, 23, 12};
        Integer[] retornoEsperado = integerInvertidos.clone();

        bubbleSort(integerInvertidos);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, integerInvertidos);
    }

    @Test
    void floatRepetidos() {
        Float[] floatRepetidos = {1.1f, 1.1f, 0.3f, 1.1f, 0.3f};
        Float[] retornoEsperado = floatRepetidos.clone();

        new BubbleSort<Float>().bubbleSort(floatRepetidos);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, floatRepetidos);
    }

    @Test
    void stringInvertida() {
        String[] stringInvertida = {"R", "I", "C", "A",};
        String[] retornoEsperado = stringInvertida.clone();

        new BubbleSort<String>().bubbleSort(stringInvertida);
        Arrays.sort(retornoEsperado);

        assertArrayEquals(retornoEsperado, stringInvertida);
    }
}