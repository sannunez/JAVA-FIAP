public class admnistrativo extends assistente{
    String turno;
    double adicionalNoturno;
    
    public admnistrativo(String nome, double salario, int matricula, String turno){
        super(nome, salario, matricula);
        this.turno = turno.toLowerCase();
    }

    public void adicionalNoturno(double adicionalNoturno){
        if (turno.equals("noturno")){
            this.adicionalNoturno = adicionalNoturno;
        }
        else{
            this.adicionalNoturno = 0;
        }
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        // System.out.println("Nome: " + getNome());
        // System.out.println("Salario: " + getSalario());
        // System.out.println("Matricula: " + getMatricula());
        System.out.println("Turno: " + turno);

        if (turno.equals("noturno")){
            System.out.println("Adicional Noturno: " + adicionalNoturno);
        }
    }
    
}
