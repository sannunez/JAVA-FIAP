public class Main {
    public static void main(String[] args) {
        Datas data = new Datas(31, 5);
        try {
            data.transforma();
        } catch (DiaInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (MesInvalidoException e){
            System.out.println(e.getMessage());
        } catch (CombinacaoInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
