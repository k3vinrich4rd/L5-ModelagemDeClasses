package contacorrente;

public class ContaCorrente {
    int numeroDaConta;
    String nomeDoCorrentista;
    double saldo;

    double saque;
    double deposito;

    public ContaCorrente() {
        this.numeroDaConta = 6432;
        this.nomeDoCorrentista = "Kevin Richard Da Silva Candido";
        this.saldo = 0;
        this.saque = 0;
        this.deposito = 0;

    }

    public double depositoConta() {
        return saldo += deposito;
    }

    public double saqueConta() {
        return saldo -= saque;

    }

    public void status() {
        System.out.println("Número da conta: " + this.numeroDaConta + "\npertence ao correntista: " + this.nomeDoCorrentista);
    }
}
