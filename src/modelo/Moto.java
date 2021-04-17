package modelo;

import java.util.Date;

import modelo.TiposEnum.CarneMoto;
import modelo.TiposEnum.NivelEmision;

public class Moto extends CocheCombustible {

	public Moto(String matricula, String marca, String modelo, String color, Date fechaDeAlta, double kilometros,
			Categoria categoria, Oficina ubicacionDeLaOficina, double consumo, int potencia,
			NivelEmision nivelEmision , int cilindrada , CarneMoto carneMoto) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros, categoria, ubicacionDeLaOficina, consumo, potencia,
				nivelEmision);
				this.cilindrada = cilindrada;
				this.carne = carne;
	}
	int cilindrada;
	CarneMoto carne;
	
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
