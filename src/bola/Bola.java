package
        bola;

import java.util.Scanner;

public class Bola {
    double circunferencia; // Atributos
    String cor; // Atributos
    String marca; // Atributos
    double velocidade; // Atributos
    String material; // Atributos

    // Construtor
    public Bola() {
        this.circunferencia = circunferencia;
        this.cor = "Branca";
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }
    // Uma forma de busca (assinatura de contrato)
    public String mostrarCor(String cor) {  // Argumento
        // se não for void vai querer um retorno
        System.out.println(cor);
        return cor; // Retorno do que está dentro de cor
    }
    public void trocaCor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma cor: ");
        cor = input.next();
        System.out.println("A cor da sua bola de futebol agora é: " + cor);

    }
}
