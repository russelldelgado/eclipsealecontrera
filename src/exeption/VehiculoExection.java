package exeption;

public class VehiculoExection  extends Exception{
    
    @Override
    public String getMessage() {
        return "Su coche no tiene algun problema";
    }
}
