package Aula010.exerciciosCP2.exe2;

public class FuncionarioComum extends Funcionario {
    
    public FuncionarioComum(double salarioFixo){
        super(salarioFixo);

    }

    @Override
    public double calcularPagamento(){
        return salarioFixo;
    }
}
