package Aula010.exerciciosCP2.exe4;

public class Voo {
    protected String origem;
    protected String destino;
    protected double distancia;
    protected String data;

    public Voo(String origem, String destino, double distancia, String data){
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.data = data;
    }

    public double CalcularPreco(){
        return 0.0;

    }

    public void exibirInformacoes() {
        System.out.println("Voo de " + origem + " para " + destino);
        System.out.println("Data do voo: " + data);
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Preço da passagem: R$" + CalcularPreco());
    }
}
