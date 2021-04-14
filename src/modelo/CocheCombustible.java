package modelo;

import java.util.Date;

public class CocheCombustible extends Vehiculo{

	double consumo;
	double potencia;
	String nivelEmision;
	
	public CocheCombustible(String matricula, String marca, String modelo, String color, Date fechaDeAlta,
			double kilometros, String ubicacionDeLaOficina, double consumo, double potencia, String nivelEmision) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros, ubicacionDeLaOficina);
		this.consumo = consumo;
		this.potencia = potencia;
		this.nivelEmision = nivelEmision;
	}

	@Override
	public String toString() {
		return "CocheCombustible [consumo=" + consumo + ", potencia=" + potencia + ", nivelEmision=" + nivelEmision
				+ "]";
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getNivelEmision() {
		return nivelEmision;
	}

	public void setNivelEmision(String nivelEmision) {
		this.nivelEmision = nivelEmision;
	}
	
	
	
	


}
