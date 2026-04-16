import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente(1, 1000);
        ContaPoupanca conta2 = new ContaPoupanca(2, 1000);

        int opcaoConta;
        int opcaoOperacao;
        double valor;

        System.out.println("=== SISTEMA BANCÁRIO ===");

        System.out.println("Escolha a conta:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        opcaoConta = sc.nextInt();

        Conta contaEscolhida;

        if (opcaoConta == 1) {
            contaEscolhida = conta1;
        } else {
            contaEscolhida = conta2;
        }

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Ver rendimento");

        opcaoOperacao = sc.nextInt();

        switch (opcaoOperacao) {
            case 1:
                System.out.println("Digite o valor para depósito:");
                valor = sc.nextDouble();
                contaEscolhida.depositar(valor);
                break;

            case 2:
                System.out.println("Digite o valor para saque:");
                valor = sc.nextDouble();
                contaEscolhida.sacar(valor);
                break;

            case 3:
                System.out.println("Saldo: R$ " + contaEscolhida.getSaldo());
                break;

            case 4:
                System.out.println("Rendimento: R$ " + contaEscolhida.calcularRendimento());
                break;

            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Saldo Conta Corrente: R$ " + conta1.getSaldo());
        System.out.println("Saldo Conta Poupança: R$ " + conta2.getSaldo());

        sc.close();
    }
}


// adicionar opção de voltar para o menu