package modelo;

import java.util.Date;

public class Coche extends CocheCombustible {

	String capacidadCarga;
	CarneCoche carne;
	public Coche(String matricula, String marca, String modelo, String color, Date fechaDeAlta, double kilometros,
			String ubicacionDeLaOficina, double consumo, double potencia, String nivelEmision, String capacidadCarga,
			CarneCoche carne) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros, ubicacionDeLaOficina, consumo, potencia,
				nivelEmision);
		this.capacidadCarga = capacidadCarga;
		this.carne = carne;
	}
	@Override
	public String toString() {
		return "Coche [capacidadCarga=" + capacidadCarga + ", carne=" + carne + "]";
	}
	public String getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(String capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public CarneCoche getCarne() {
		return carne;
	}
	public void setCarne(CarneCoche carne) {
		this.carne = carne;
	}
	
	
	
}
