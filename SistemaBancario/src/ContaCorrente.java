public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + 2;

        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
        } else{
            System.out.println("Saldo insuficiente para saque com taxa");
        }
    }

    @Override
    public double calcularRendimento(){
        return 0;
    }
}