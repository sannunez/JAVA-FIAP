package Aula012.PraticaCP3;

public class Carro extends Veiculo {
    String modelo;
    int tamanho;

    public Carro(String cor, int ano, String modelo, int tamanho){
        super(ano, cor);
        this.modelo = modelo;
        this.tamanho = tamanho;
    }

    @Override
    public void Som(){
        super.Som();
        System.out.println("Pode crer");
    }
}
