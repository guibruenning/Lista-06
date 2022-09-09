package Exer06;

//converter 24 horas para 12 horas
public class MinhasFuncoes {

    protected static String converterHora(int hora,int minuto,  String periodo) {
        String horaConvertida = "";

        if(periodo == "AM") {
            if(hora == 12) {
                horaConvertida = "00"+ ":" +minuto+ " " + periodo;
            } else {
                horaConvertida = hora+ ":" +minuto + " " +periodo;
            }
        } else {
            if(hora == 12) {
                horaConvertida = hora + ":" + minuto + " " +periodo;
            } else {
                horaConvertida = (hora - 12) + ":" + minuto +" " +periodo;
            }
        }
        return horaConvertida;
    }

    protected static String verificarPeriodo(int hora) {
        String periodo = "";
        if(hora >= 0 && hora < 12) {
            periodo = "AM";
        } else {
            periodo = "PM";
        }
        return periodo;
    }
}
