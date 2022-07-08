package contacorrente;

public class ContaCorrente {
    int numeroDaConta;
    String nomeDoCorrentista;
    double saldo;

    public ContaCorrente() {
        this.numeroDaConta = 6432;
        this.nomeDoCorrentista = "Kevin Richard Da Silva Candido";
        this.saldo = 0;

    }

    public void status() {
        System.out.println("Número da conta: " + this.numeroDaConta + "\npertence ao correntista: " + this.nomeDoCorrentista + "\ncom um total de saldo de " + this.saldo);
    }
}
