public class gerente extends funcionario {
    String cargo;

    public gerente(String nome, double salario, String cargo){
        super(nome, salario);
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        // System.out.println("Nome: " + getNome());
        // System.out.println("Salario: " + getSalario());
        System.out.println("Cargo: " + cargo);
    }
}
