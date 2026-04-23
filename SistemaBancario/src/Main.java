import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta1 = new ContaCorrente(1, 1000);
        Conta conta2 = new ContaPoupanca(2, 1000);

        int continuar = 1;

        System.out.println("=== SISTEMA BANCÁRIO ===");

        while (continuar == 1) {

            System.out.println("\nEscolha a conta:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");

            int opcaoConta = sc.nextInt();

            Conta conta = (opcaoConta == 1) ? conta1 : conta2;

            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver rendimento");

            int opcao = sc.nextInt();

            double valor;

            switch (opcao) {
                case 1:
                    System.out.println("Valor para depósito:");
                    valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Valor para saque:");
                    valor = sc.nextDouble();

                    double saldoAntes = conta.getSaldo();
                    conta.sacar(valor);

                    if (conta.getSaldo() < saldoAntes) {
                        System.out.println("Saque realizado!");
                        System.out.println("Saldo: R$ " + conta.getSaldo());
                    }
                    break;

                case 3:
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Rendimento: R$ " + conta.calcularRendimento());
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("\n1 - Voltar ao menu | 2 - Finalizar");
            continuar = sc.nextInt();
        }

        System.out.println("\n=== SISTEMA ENCERRADO ===");
        System.out.println("Conta Corrente: R$ " + conta1.getSaldo());
        System.out.println("Conta Poupança: R$ " + conta2.getSaldo());

        sc.close();
    }
}