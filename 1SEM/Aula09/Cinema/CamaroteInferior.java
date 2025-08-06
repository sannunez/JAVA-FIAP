public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valor,double valorAdicional, String localizacao){
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalização(){
        System.out.println("localização do Ingresso " + localizacao);
    }
}
