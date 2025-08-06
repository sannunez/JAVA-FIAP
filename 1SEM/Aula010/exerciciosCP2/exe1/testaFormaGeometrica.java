package Aula010.exerciciosCP2.exe1;

public class testaFormaGeometrica {
    public static void main(String[] args) {
        formaGeometrica Circulo = new circulo("Circulo", 4);
        Circulo.calculaArea();
        Circulo.calculaPerimetro();

        System.out.println();

        formaGeometrica Retangulo = new retangulo("Retangulo", 5, 10);
        Retangulo.calculaArea();
        Retangulo.calculaPerimetro();
    }
}
