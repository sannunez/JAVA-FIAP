package Aula010.exerciciosCP2.exe2;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(double salarioFixo, double bonus){
        super(salarioFixo);
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento(){
        return salarioFixo + bonus;
    }
}
