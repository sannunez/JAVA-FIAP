public class Datas {
    int dia;
    int mes;
    String mesExtenso;

    public Datas(){}

    public Datas(int dia, int mes){
        this.dia = dia;
        this.mes = mes;

        switch (mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;

            case 2:
                mesExtenso = "Fevereiro";
                break;

            case 3:
                mesExtenso = "Março";    
                break;

            case 4:
                mesExtenso = "Abril";
                break;

            case 5:
                mesExtenso = "Maio";
                break;

            case 6:
                mesExtenso = "Junho";
                break;

            case 7:
                mesExtenso = "Julho";
                break;

            case 8:
                mesExtenso = "Agosto";
                break;

            case 9:
                mesExtenso = "Setembro";
                break;

            case 10:
                mesExtenso = "Outubro";
                break;

            case 11:
                mesExtenso = "Novembro";
                break;

            case 12:
                mesExtenso = "Dezembro";
                break;

            default:

                break;
        }
    }



    public void transforma() throws DiaInvalidoException, MesInvalidoException, CombinacaoInvalidaException{
        if (dia > 31 || dia < 1){
            throw new DiaInvalidoException("Dia invalido.");
        }

        else if (mes > 12 || mes < 1){
            throw new MesInvalidoException("Mes Invalido");

        }

        else if (((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) || (mes == 2 && dia >= 30) ){
            throw new CombinacaoInvalidaException("Combinação DIA + MÊS invalida");
        }
        else{
            System.out.println(dia + "/" + mesExtenso);
        }
    }

    
}
