package metodosDeComprobacion;

import java.time.LocalDate;
import java.time.Period;

public class Auxiliar {
    

    public static boolean comprobarLetraCategoria(String letra){
        if(letra.length() > 1){
            return false;
        }else if(letra.isEmpty()){
            return false;
        }else if(letra.matches("/d")){
            return false;
        }
        return true;
    }

    public static boolean comprobarCodigoOficina(String codigo){
        return codigo.matches("[A-Za-z0-9]{4}");
    }

    public static boolean validarMatricula(String matricula) {
        return matricula.matches("[a-zA-Z]{3}[0-9]{4}");
        }

    public static boolean validarDni(String dni) {
        return dni.matches("[0-9]{8}[a-zA-Z]{1}");
        }

    public static int obtenerDiasEntreDosFechas(LocalDate fecha1, LocalDate fecha2){
        Period period = Period.between(fecha1, fecha2);
        return period.getDays();
    }
}
