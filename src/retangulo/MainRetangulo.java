package retangulo;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.base = 10;
        retangulo.altura = 20;
        System.out.println("A �rea do ret�ngulo � de: "+ retangulo.areDoRetangulo());
        System.out.println("A �rea do perimetro � de: "+ retangulo.perimetroDoretangulo());


    }
}
