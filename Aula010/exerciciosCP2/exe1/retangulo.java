package Aula010.exerciciosCP2.exe1;

public class retangulo extends formaGeometrica{
    double base;
    double altura;

    public retangulo (String formaGeometrica, double base, double altura){
        super(formaGeometrica);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculaArea(){
        super.calculaArea();
        double area = base * altura;

        System.out.println("Area do retangulo: " + area);
    }

    @Override
    public void calculaPerimetro(){
        super.calculaPerimetro();
        double perimetro = (base * 2) + (altura * 2);

        System.out.println("Perimetro da  circunferência: " + perimetro);
    }
}
