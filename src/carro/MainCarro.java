package carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Ferrari";
        carro.modelo = "F8";
        carro.quantidadeDePortas = 2;
        carro.status();
        carro.ligarCarro();

    }
}
