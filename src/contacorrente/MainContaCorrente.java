package contacorrente;

public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaBancaria = new ContaCorrente();
        contaBancaria.numeroDaConta = 1765;
        contaBancaria.nomeDoCorrentista = "Kevin Richard";
        contaBancaria.saldo = 50;
        contaBancaria.status();
    }
}
