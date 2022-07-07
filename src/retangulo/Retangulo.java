package retangulo;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(){
        this.base = 0;
        this.altura = 0;

    }
    public void areDoRetangulo(){
        System.out.println("A área do retângulo é: " + (base * altura));
    }
}
