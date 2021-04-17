package modelo;
import java.util.Date;

import modelo.TiposEnum.NivelEmision;
import modelo.TiposEnum.TipoCoche;

class Coche extends CocheCombustible{
    int numeroPlazas;
    TipoCoche tipoCoche;

    public Coche(String matricula, String marca, String modelo, String color, Date fechaDeAlta, double kilometros,
            Categoria categoria, Oficina ubicacionDeLaOficina, double consumo, int potencia,
            NivelEmision nivelEmision , int numeroPlazas , TipoCoche tipoCoche){
                super(matricula, marca, modelo, color, fechaDeAlta, kilometros, categoria, ubicacionDeLaOficina, consumo, potencia,
                nivelEmision);
                this.numeroPlazas = numeroPlazas;
                this.tipoCoche = tipoCoche;

            }


}