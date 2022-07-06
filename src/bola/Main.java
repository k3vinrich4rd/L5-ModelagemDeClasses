package bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objeto
        String trocar = null;
        Bola jabulani = new Bola();
        String cor = jabulani.cor;

        System.out.println("A cor da sua bola é: " + jabulani.cor);

        Scanner input = new Scanner(System.in);
        System.out.print("Deseja trocar a cor da sua bola de futebol? [S/N]:  ");
        trocar = input.next();
        if (trocar.equalsIgnoreCase("s")) {
            jabulani.trocaCor();
        } else {
            System.out.println("Agradecemos a sua escolha");
        }

    }
}

