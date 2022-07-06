package pessoa;

import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa(String nome, double peso, double altura, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void engordar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos quilos você engordou?");
        double engodar = entrada.nextDouble();
        this.peso += engodar;


    }

    public void emagrecer(double emagrecer) {
        peso -= emagrecer;
    }

    public void status() {
        System.out.println("O seu peso agora é " + this.peso);
        System.out.println("A sua idade no próximo ano será " + (this.idade +1) + "\nA sua altura no próximo ano será " + (this.altura + 0.05));

    }
}





