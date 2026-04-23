public abstract class Pessoa {

    private String nome;
    private int idade;

    // construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    // metodo abstrato
    public abstract void apresentar();
}