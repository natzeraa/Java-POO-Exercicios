import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Livro("Quarta Asa", 170));
        produtos.add(new Eletronico("Celular", 2000));
        produtos.add(new Alimento("Arroz", 30));

        System.out.println("=== LISTA DE PRODUTOS ===\n");

        for (Produto p : produtos) {

            double desconto = p.calcularDesconto();
            double precoFinal = p.getPreco() - desconto;

            System.out.println("Produto: " + p.getNome());
            System.out.println("Categoria: " + p.getCategoria());
            System.out.println("Preço original: R$ " + p.getPreco());
            System.out.println("Desconto aplicado: R$ " + desconto);
            System.out.println("Preço com desconto: R$ " + precoFinal);
            System.out.println("-----------------------------");
        }
    }
}