public class CamaroteSuperior extends Vip {

    public CamaroteSuperior(double valor, double valorAdicional){
        super(valor, valorAdicional);
    }

    public double getValorIngresso(){
        return getValorVip();

    }
}
