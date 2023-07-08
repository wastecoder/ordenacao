package algoritmo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AllTest {
    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();
    MergeSort mergeSort = new MergeSort();
    QuickSort quickSort = new QuickSort();

    /*
    Os testes são feitos comparando o resultado do
    meu algoritmo de ordenação com a ordenação feita
    pelo Java, no comando Arrays.sort()
    Isso traz diversas vantagens, como confiabilidade
    e manutenibilidade, pois ao alterar o vetor de entrada
    não precisa realizar a ordenação novamente.

    O ideal abaixo seria ter um Arrays.sort() por
    @Nest. Porém, esse método só pode ser usado dentro
    de outro método e o @Nest só pode ser usado em
    classes. Por conta disso, vai ficar essa repetição.
    Esse problema se resolveria ao fazer ordenação
    manualmente, mas perderia as duas vantagens citadas.
     */

    @Nested
    class IntegerAleatorios {
        Integer[] integerAleatorios = {7, 5, 1, 8, 3};
        Integer[] retornoEsperado = integerAleatorios.clone();

        @Test
        void bubbleSort() {
            Arrays.sort(retornoEsperado);
            bubbleSort.sort(integerAleatorios);

            assertArrayEquals(retornoEsperado, integerAleatorios);
        }

        @Test
        void selectionSort() {
            Arrays.sort(retornoEsperado);
            selectionSort.sort(integerAleatorios);

            assertArrayEquals(retornoEsperado, integerAleatorios);
        }

        @Test
        void insertionSort() {
            Arrays.sort(retornoEsperado);
            insertionSort.sort(integerAleatorios);

            assertArrayEquals(retornoEsperado, integerAleatorios);
        }

        @Test
        void mergeSort() {
            Arrays.sort(retornoEsperado);
            mergeSort.sort(integerAleatorios);

            assertArrayEquals(retornoEsperado, integerAleatorios);
        }

        @Test
        void quickSort() {
            Arrays.sort(retornoEsperado);
            quickSort.sort(integerAleatorios);

            assertArrayEquals(retornoEsperado, integerAleatorios);
        }
    }

    @Nested
    class integerInvertidos {
        Integer[] integerInvertidos = {95, 87, 54, 45, 32, 23, 12};
        Integer[] retornoEsperado = integerInvertidos.clone();

        @Test
        void bubbleSort() {
            Arrays.sort(retornoEsperado);
            bubbleSort.sort(integerInvertidos);

            assertArrayEquals(retornoEsperado, integerInvertidos);
        }

        @Test
        void selectionSort() {
            Arrays.sort(retornoEsperado);
            selectionSort.sort(integerInvertidos);

            assertArrayEquals(retornoEsperado, integerInvertidos);
        }

        @Test
        void insertionSort() {
            Arrays.sort(retornoEsperado);
            insertionSort.sort(integerInvertidos);

            assertArrayEquals(retornoEsperado, integerInvertidos);
        }

        @Test
        void mergeSort() {
            Arrays.sort(retornoEsperado);
            mergeSort.sort(integerInvertidos);

            assertArrayEquals(retornoEsperado, integerInvertidos);
        }

        @Test
        void quickSort() {
            Arrays.sort(retornoEsperado);
            quickSort.sort(integerInvertidos);

            assertArrayEquals(retornoEsperado, integerInvertidos);
        }
    }

    @Nested
    class floatOrdenados {
        Float[] floatOrdenados = {0.1f, 2.2f, 4.3f, 5.4f, 7.5f, 8.6f, 9.7f};
        Float[] retornoEsperado = floatOrdenados.clone();

        @Test
        void bubbleSort() {
            bubbleSort.sort(floatOrdenados);

            assertArrayEquals(retornoEsperado, floatOrdenados);
        }

        @Test
        void selectionSort() {
            selectionSort.sort(floatOrdenados);

            assertArrayEquals(retornoEsperado, floatOrdenados);
        }

        @Test
        void insertionSort() {
            insertionSort.sort(floatOrdenados);

            assertArrayEquals(retornoEsperado, floatOrdenados);
        }

        @Test
        void mergeSort() {
            mergeSort.sort(floatOrdenados);

            assertArrayEquals(retornoEsperado, floatOrdenados);
        }

        @Test
        void quickSort() {
            quickSort.sort(floatOrdenados);

            assertArrayEquals(retornoEsperado, floatOrdenados);
        }
    }

    @Nested
    class floatRepetidos {
        Float[] floatRepetidos = {1.1f, 1.1f, 0.3f, 1.1f, 0.3f};
        Float[] retornoEsperado = floatRepetidos.clone();

        @Test
        void bubbleSort() {
            Arrays.sort(retornoEsperado);
            bubbleSort.sort(floatRepetidos);

            assertArrayEquals(retornoEsperado, floatRepetidos);
        }

        @Test
        void selectionSort() {
            Arrays.sort(retornoEsperado);
            selectionSort.sort(floatRepetidos);

            assertArrayEquals(retornoEsperado, floatRepetidos);
        }

        @Test
        void insertionSort() {
            Arrays.sort(retornoEsperado);
            insertionSort.sort(floatRepetidos);

            assertArrayEquals(retornoEsperado, floatRepetidos);
        }

        @Test
        void mergeSort() {
            Arrays.sort(retornoEsperado);
            mergeSort.sort(floatRepetidos);

            assertArrayEquals(retornoEsperado, floatRepetidos);
        }

        @Test
        void quickSort() {
            Arrays.sort(retornoEsperado);
            quickSort.sort(floatRepetidos);

            assertArrayEquals(retornoEsperado, floatRepetidos);
        }
    }

    @Nested
    class stringAleatoria {
        String[] stringAleatoria = {"A", "M", "I", "M", "I", "R"};
        String[] retornoEsperado = stringAleatoria.clone();

        @Test
        void bubbleSort() {
            Arrays.sort(retornoEsperado);
            bubbleSort.sort(stringAleatoria);

            assertArrayEquals(retornoEsperado, stringAleatoria);
        }

        @Test
        void selectionSort() {
            Arrays.sort(retornoEsperado);
            selectionSort.sort(stringAleatoria);

            assertArrayEquals(retornoEsperado, stringAleatoria);
        }

        @Test
        void insertionSort() {
            Arrays.sort(retornoEsperado);
            insertionSort.sort(stringAleatoria);

            assertArrayEquals(retornoEsperado, stringAleatoria);
        }

        @Test
        void mergeSort() {
            Arrays.sort(retornoEsperado);
            mergeSort.sort(stringAleatoria);

            assertArrayEquals(retornoEsperado, stringAleatoria);
        }

        @Test
        void quickSort() {
            Arrays.sort(retornoEsperado);
            quickSort.sort(stringAleatoria);

            assertArrayEquals(retornoEsperado, stringAleatoria);
        }
    }

    @Nested
    class stringInvertida {
        String[] stringInvertida = {"R", "I", "C", "A",};
        String[] retornoEsperado = stringInvertida.clone();

        @Test
        void bubbleSort() {
            Arrays.sort(retornoEsperado);
            bubbleSort.sort(stringInvertida);

            assertArrayEquals(retornoEsperado, stringInvertida);
        }

        @Test
        void selectionSort() {
            Arrays.sort(retornoEsperado);
            selectionSort.sort(stringInvertida);

            assertArrayEquals(retornoEsperado, stringInvertida);
        }

        @Test
        void insertionSort() {
            Arrays.sort(retornoEsperado);
            insertionSort.sort(stringInvertida);

            assertArrayEquals(retornoEsperado, stringInvertida);
        }

        @Test
        void mergeSort() {
            Arrays.sort(retornoEsperado);
            mergeSort.sort(stringInvertida);

            assertArrayEquals(retornoEsperado, stringInvertida);
        }

        @Test
        void quickSort() {
            Arrays.sort(retornoEsperado);
            quickSort.sort(stringInvertida);

            assertArrayEquals(retornoEsperado, stringInvertida);
        }
    }
}
