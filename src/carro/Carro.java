package carro;

public class Carro {
    int quantidadeDePortas;
    String modelo;
    String marca;
    double potencia;

    public Carro() {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;


    }

    public void status() {
        System.out.println("O modelo deste carro é: " + this.modelo + " \nÉ pertencente a marca: " + this.marca + "\nTem: " + this.quantidadeDePortas + " portas (passageiro/motorista)" + "\nE a sua potência é de: " + this.potencia + " cilindrada");

    }

}
