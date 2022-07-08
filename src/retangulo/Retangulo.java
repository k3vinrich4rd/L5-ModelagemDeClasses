package retangulo;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(){
        this.base = 0;
        this.altura = 0;

    }
    public double areDoRetangulo(){
       return (base * altura);
    }
    public double perimetroDoretangulo(){
        return (base + base + altura + altura);
    }
}
