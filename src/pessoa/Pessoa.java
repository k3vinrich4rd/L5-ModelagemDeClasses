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

    public void envelhecer() {
        this.idade = this.idade + 1;
        if (this.idade < 21) {
            crescer(0.05);
        }


    }

    public void engordar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos quilos você engordou?: ");
        double engodar = entrada.nextDouble();
        this.peso += engodar;


    }

    public void emagrecer(double emagrecer) {
        peso -= emagrecer;
    }

    public void crescer(double altura3 ) {
        this.altura += altura3;

    }

    public void status() {
        System.out.println("O seu peso agora é " + this.peso);
        System.out.println("A sua idade no próximo ano será " + (this.idade + 1) + "\nA sua altura no próximo ano será " + (this.altura + 0.05));

    }
}





