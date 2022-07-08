package retangulo;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.base = 10;
        retangulo.altura = 20;
        System.out.println("A área do retângulo é de: "+ retangulo.areDoRetangulo());
        System.out.println("A área do perimetro é de: "+ retangulo.perimetroDoretangulo());


    }
}
