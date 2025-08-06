public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(30.0);
        i1.imprimeValor();
        System.out.println("\n");
        Normal i2 = new Normal(30.0);
        i2.imprimeTipo();
        System.out.println("\n");
        Vip i3 = new Vip(30.0,50.0);
        System.out.println("Valor do ingresso VIP: R$" + i3.getValorVip());
        System.out.println("\n");
        CamaroteInferior camaroteInferior = new CamaroteInferior(30.0,50.0,"Setor XPTO");
        camaroteInferior.imprimeLocalização();
        System.out.println("Valor do Camarote Inferior: R$: " + camaroteInferior.getValorVip());
        System.out.println("\n");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(30.0,70.0);
        System.out.println("valor do Camarote Superior: R$ " + camaroteSuperior.getValorIngresso());

    }
}
