package pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respostaPeso = null;
        Pessoa pessoa = new Pessoa("Kevin Richard", 90, 1.69, 19);

        double peso = pessoa.peso;
        double altura = pessoa.altura;
        int idade = pessoa.idade;

        System.out.println("Seu nome � " + pessoa.nome + "\nSeu peso � " + peso + " kg" + "\nSua altura � " + altura + " cm" + "\nSua idade � " + idade + " anos");

        System.out.println("Voc� engordou nesse meio tempo? [S/N]");
        String resposta = input.next();
        if (resposta.equalsIgnoreCase("s")) {
            pessoa.engordar();

        }
        pessoa.status();



    }
}

