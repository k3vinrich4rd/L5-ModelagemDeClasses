package exercicio1;

public class BolaTeste {
    public static void main(String[] args) {
        // Atributos
        Bola bola = new Bola();
        bola.circunferencia = 70;
        bola.cor = "Preta";
        bola.marca = "Nike";
        bola.velocidade = 30;

        System.out.println(bola.circunferencia);
        System.out.println(bola.cor);
        System.out.println(bola.marca);
        System.out.println(bola.velocidade);

    }
}
