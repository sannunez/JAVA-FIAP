public class funcionario {
    private String nome;
    private Double salario;

    public funcionario(){
        
    }

    public funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
