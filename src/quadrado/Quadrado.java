package quadrado;

public class Quadrado { // Classe
    public double tamanhoDoLado;

    // Construtor
    public Quadrado(){
        this.tamanhoDoLado = 0;

    }
    public void area(){
        System.out.println("A �rea do quadrado � igual: " + (tamanhoDoLado * tamanhoDoLado) + " cm��");

    }
}
