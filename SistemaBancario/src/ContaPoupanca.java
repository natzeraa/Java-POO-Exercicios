public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else{
            System.out.println("Saldo insuficiente para saque");
        }
    }

    @Override
    public double calcularRendimento(){
        return getSaldo() * 0.005;
    }
}