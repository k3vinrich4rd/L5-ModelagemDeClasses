package quadrado;

public class MainQuadrado { // Classe
    public double tamanhoDoLado;

    // Construtor
    public MainQuadrado(){
        this.tamanhoDoLado = 0;

    }
    public void area(){
        System.out.println("A área do quadrado é igual: " + (tamanhoDoLado * tamanhoDoLado) + " cm²ª");

    }
}
