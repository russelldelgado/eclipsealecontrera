package modelo;

import java.time.LocalDate;

import modelo.TiposEnum.NivelEmision;
import modelo.TiposEnum.TipoFurgonetaCarnet;

public class Furgoneta extends CocheCombustible {
    double capacidadCarga;
	TipoFurgonetaCarnet tipoFurgonetaCarnet;

	public Furgoneta(String matricula, String marca, String modelo, String color, LocalDate fechaDeAlta, double kilometros,
            Categoria categoria, Oficina ubicacionDeLaOficina, double consumo, int potencia,
            NivelEmision nivelEmision , double capacidadCarga , TipoFurgonetaCarnet tipoFurgonetaCarnet){
                super(matricula, marca, modelo, color, fechaDeAlta, kilometros, categoria, ubicacionDeLaOficina, consumo, potencia,
                nivelEmision);

                this.capacidadCarga  = capacidadCarga;
                this.tipoFurgonetaCarnet = tipoFurgonetaCarnet;
            }
       
                
    
	
	@Override
	public String toString() {
		return "Coche [capacidadCarga=" + capacidadCarga + ", carne=" + tipoFurgonetaCarnet + "]";
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public TipoFurgonetaCarnet getCarne() {
		return tipoFurgonetaCarnet;
	}
	public void setCarne(TipoFurgonetaCarnet tipoFurgonetaCarnet) {
		this.tipoFurgonetaCarnet = tipoFurgonetaCarnet;
	}
	
	
	
}
