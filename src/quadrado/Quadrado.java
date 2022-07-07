package quadrado;

public class Quadrado { // Classe
    public double tamanhoDoLado;

    // Construtor
    public Quadrado(){
        this.tamanhoDoLado = 0;

    }
    public void area(){
        System.out.println("A área do quadrado é igual: " + (tamanhoDoLado * tamanhoDoLado) + " cm²ª");

    }
}
