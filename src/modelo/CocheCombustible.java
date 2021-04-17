package modelo;

import java.util.Date;

import modelo.TiposEnum.NivelEmision;

public class CocheCombustible extends Vehiculo{

	double consumo;
	int potencia;
	NivelEmision nivelEmision;
	
	public CocheCombustible(String matricula, String marca, String modelo, String color, Date fechaDeAlta,
			double kilometros, Categoria categoria , Oficina ubicacionDeLaOficina, double consumo, int potencia, NivelEmision nivelEmision) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros,categoria , ubicacionDeLaOficina);
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

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public NivelEmision getNivelEmision() {
		return nivelEmision;
	}

	public void setNivelEmision(NivelEmision nivelEmision) {
		this.nivelEmision = nivelEmision;
	}
	
	
	
	


}
