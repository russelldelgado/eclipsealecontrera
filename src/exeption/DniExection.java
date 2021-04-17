package exeption;

public class DniExection  extends Exception{
     @Override
     public String getMessage() {
         return "Lo sentimos su DNI no cumple con las caracteristicas especificadas";
     }

     
}
