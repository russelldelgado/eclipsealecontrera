package modelo;

import java.util.Date;

public class Moto extends CocheCombustible {

	String cilindrada;
	CarneMoto carne;
	public Moto(String matricula, String marca, String modelo, String color, Date fechaDeAlta, double kilometros,
			String ubicacionDeLaOficina, double consumo, double potencia, String nivelEmision, String cilindrada,
			CarneMoto carne) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros, ubicacionDeLaOficina, consumo, potencia,
				nivelEmision);
		this.cilindrada = cilindrada;
		this.carne = carne;
	}
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", carne=" + carne + "]";
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public CarneMoto getCarne() {
		return carne;
	}
	public void setCarne(CarneMoto carne) {
		this.carne = carne;
	}
	
	
	
}
