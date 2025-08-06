package Aula010.exerciciosCP2.exe2;

public class TestaFuncionario {
    
    public static void main(String[] args) {
        FuncionarioComum func1 = new FuncionarioComum(3500);
        Gerente g1 = new Gerente(7000.00, 2000.00);
        Diretor d1 = new Diretor(15000.00, 3000.00);
    
        System.out.println(func1.calcularPagamento());
        System.out.println(g1.calcularPagamento());
        System.out.println(d1.calcularPagamento());
    }
    

    
}

