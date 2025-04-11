public class tecnico extends assistente{
    double bonus;

    public tecnico(String nome, double salario, int matricula, double bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        // System.out.println("Nome: " + getNome());
        // System.out.println("Salario: " + getSalario());
        // System.out.println("Matricula: " + getMatricula());
        System.out.println("Bonus: " + bonus);
    }
}
