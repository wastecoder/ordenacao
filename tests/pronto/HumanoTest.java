package pronto;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

//https://www.baeldung.com/java-8-sort-lambda#sort-extracted-comparators
class HumanoTest extends Humano {
    //Todos abaixo ordenam por nome, a maioria em ordem crescente
    //Caso queira mudar para idade, só trocar getNome() por getIdade()

    @Nested
    class CondicaoUnica {
        ArrayList<Humano> diferentes = new ArrayList<>() {{
            add(new Humano("Carlos", 22));
            add(new Humano("Luiz", 36));
            add(new Humano("Adriana", 19));
        }};

        @Test
        void basicLambdaSort() {
            //O compilador consegue saber o tipo, logo não precisa colocar Humano
            diferentes.sort((Humano h1, Humano h2) -> h1.getNome().compareTo(h2.getNome()));

            assertEquals("Adriana", diferentes.get(0).getNome());
        }

        @Test
        void comparatorSort() {
            //1: Dá para armazenar o Comparator em uma variável e usar aqui depois.
            //2: Collections.sort() é a API antiga, a nova é OBJETO.sort()
            Collections.sort(diferentes, new Comparator<Humano>() {
                @Override
                public int compare(Humano h1, Humano h2) {
                    return h1.getNome().compareTo(h2.getNome());
                }
            });

            assertEquals("Adriana", diferentes.get(0).getNome());
        }

        @Test
        void instanceMethodReference() {
            diferentes.sort(Comparator.comparing(Humano::getNome));

            assertEquals("Adriana", diferentes.get(0).getNome());
        }

        @Test
        void reversedSort() {
            Comparator<Humano> comparator = Comparator.comparing(Humano::getNome);
            diferentes.sort(comparator.reversed());

            assertEquals("Luiz", diferentes.get(0).getNome());
        }
    }


    @Nested
    class MultiplicasCondicoes {
        ArrayList<Humano> nomesIguais = new ArrayList<>() {{
            add(new Humano("Katarina", 27));
            add(new Humano("Katarina", 24));
            add(new Humano("Katarina", 21));
        }};

        @Test
        void referenceToStaticMethod() {
            //Método dentro da classe Humano
            nomesIguais.sort(Humano::compararPorNomeDepoisIdade);

            assertEquals(21, nomesIguais.get(0).getIdade());
        }

        @Test
        void comparisonLambda() {
            nomesIguais.sort((esquerda, direita) -> {
                if (esquerda.getNome().equals(direita.getNome())) {
                    return esquerda.getIdade() - direita.getIdade();
                } else {
                    return esquerda.getNome().compareTo(direita.getNome());
                }
            });

            assertEquals(21, nomesIguais.get(0).getIdade());
        }

        @Test
        void composition() {
            nomesIguais.sort(Comparator.comparing(Humano::getNome).thenComparing(Humano::getIdade));

            assertEquals(21, nomesIguais.get(0).getIdade());
        }
    }
}