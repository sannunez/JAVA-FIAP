package Aula010.exerciciosCP2.exe1;

public class circulo extends formaGeometrica {
    double pi = 3.14;
    double raio;

    public circulo(String formaGeometrica, double raio){
        super(formaGeometrica);
        this.raio = raio;
    }

    @Override
    public void calculaArea() {
        super.calculaArea();
        double area = pi * (raio*raio);

        System.out.println("Area da circunferência: " + area);
    }

    @Override
    public void calculaPerimetro(){
        super.calculaPerimetro();
        double perimetro = 2 * pi * raio;

        System.out.println("Perimetro da  circunferência: " + perimetro);

    }



}
