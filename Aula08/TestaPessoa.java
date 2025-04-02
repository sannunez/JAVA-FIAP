package Aula08;

public class TestaPessoa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Davy Jones", "123456");
        aluno.rm = "123";

        Funcionario funcionario = new Funcionario("O Mago Jones", "134906");
        funcionario.cargo = "Gerente de produção";
        funcionario.salario = 2671.00;

        Professor Professor = new Professor("Eu zerei todos os jogos", "1263467");
        Professor.disciplina = "Zerador de jogos";
        Professor.salario = 21321.00;
        
        // Printar diferenças
    }
}
