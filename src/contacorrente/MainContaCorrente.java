package contacorrente;

public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaBancaria = new ContaCorrente();
        contaBancaria.numeroDaConta = 1765;
        contaBancaria.nomeDoCorrentista = "Kevin Richard";
        contaBancaria.saldo = 1500;
        contaBancaria.deposito = 500;
        contaBancaria.saque = 200;
        contaBancaria.status();

        System.out.println("O seu saldo era de: " + contaBancaria.saldo + "R$" + "\n" +
                "Voc� fez um deposito na sua conta, agora seu saldo �: " + contaBancaria.depositoConta()
                + "R$ " + "\nVoc� fez um saque, e agora seu saldo total � de: " + contaBancaria.saqueConta() + "R$");


    }

}
