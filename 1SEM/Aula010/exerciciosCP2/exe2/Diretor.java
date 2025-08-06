package Aula010.exerciciosCP2.exe2;

public class Diretor extends Funcionario{
    private double participacaoLucros;

    public Diretor(double salarioFixo, double participacaoLucros){
        super(salarioFixo);
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public double calcularPagamento(){
        return salarioFixo + participacaoLucros;
    }

}
