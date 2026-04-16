public abstract class Conta {
    private int numero;
    private double saldo;

    //Construtor
    public Conta(int numero, double saldo) {
        this.numero = numero;
        setSaldo(saldo);
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Erro : Saldo não pode ser negativo");
            return;
        }
        this.saldo = saldo;
    }

    //Métodos
    public abstract void sacar(double valor);

    public abstract double calcularRendimento();

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro : O valor do depósito deve ser maior que zero.");
        }
    }
}