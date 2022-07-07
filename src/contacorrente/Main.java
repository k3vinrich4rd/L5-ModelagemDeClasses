package contacorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaBancaria = new ContaCorrente();
        contaBancaria.numeroDaConta = 1765;
        contaBancaria.nomeDoCorrentista = "Kevin Richard";
        contaBancaria.saldo = 0;
        contaBancaria.status();
    }
}
