package pronto;

public class Humano {
    private String nome;
    private int idade;

    public Humano() {
    }

    public Humano(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static int compararPorNomeDepoisIdade(Humano esquerda, Humano direita) {
        if (esquerda.nome.equals(direita.nome)) {
            return esquerda.idade - direita.idade;
        } else {
            return esquerda.nome.compareTo(direita.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
