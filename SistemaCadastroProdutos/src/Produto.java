public abstract class Produto {

    private String nome;
    private double preco;
    private String categoria;

    // construtor
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        setPreco(preco);
        this.categoria = categoria;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro : preço não pode ser negativo.");
        } else {
            this.preco = preco;
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // metodo abstrato
    public abstract double calcularDesconto();
}