package Aula010.exerciciosCP2.exe4;

public class VooDomestico extends Voo {
    private double taxa_domestico = 0.50;

    public VooDomestico(String origem, String destino, double distancia, String data){
        super(origem, destino, distancia, data);
    }

    @Override
    public double CalcularPreco(){
        return distancia * taxa_domestico;
    }
    
}
