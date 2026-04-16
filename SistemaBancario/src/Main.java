import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente(1,1000);
        ContaPoupanca conta2 = new ContaPoupanca(2,1000);

        conta1.sacar(100);
        conta2.sacar(100);

        System.out.println("Saldo conta corrente R$ " + conta1.getSaldo());
        System.out.println("Rendimento da conta corrente R$ " + conta1.calcularRendimento());

        System.out.println("Saldo conta poupança R$ " + conta2.getSaldo());
        System.out.println("Rendimento da conta poupança R$ " + conta2.calcularRendimento());

    }
}
