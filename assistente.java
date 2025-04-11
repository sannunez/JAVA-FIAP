public class assistente extends funcionario{
    private int matricula;

    public assistente(){
        
    }

    public assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;

    }

    public int getMatricula(){
       return matricula;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        // System.out.println("Nome: " + getNome());
        // System.out.println("Salario: " + getSalario());
        System.out.println("Matricula: " + matricula);
    }
}
