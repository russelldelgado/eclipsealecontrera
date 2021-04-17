package modelo;

import java.time.LocalDate;

import modelo.TiposEnum.CarneMoto;
import modelo.TiposEnum.NivelEmision;

public class Moto extends CocheCombustible {

	int cilindrada;
	CarneMoto carne;

	public Moto(String matricula, String marca, String modelo, String color, LocalDate fechaDeAlta, double kilometros,
			Categoria categoria, Oficina ubicacionDeLaOficina, double consumo, int potencia,
			NivelEmision nivelEmision , int cilindrada , CarneMoto carneMoto) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros, categoria, ubicacionDeLaOficina, consumo, potencia,
				nivelEmision);
				this.cilindrada = cilindrada;
				this.carne = carneMoto;
	}
	
	
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", carne=" + carne + "]";
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public CarneMoto getCarne() {
		return carne;
	}
	public void setCarne(CarneMoto carne) {
		this.carne = carne;
	}
	
	
	
}
