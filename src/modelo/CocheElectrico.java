package modelo;

import java.util.Date;

public class CocheElectrico extends Vehiculo{

	double autonomia;
	double tiempoDeRecarga;
	public CocheElectrico(String matricula, String marca, String modelo, String color, Date fechaDeAlta,
			double kilometros, String ubicacionDeLaOficina, double autonomia, double tiempoDeRecarga) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros, ubicacionDeLaOficina);
		this.autonomia = autonomia;
		this.tiempoDeRecarga = tiempoDeRecarga;
	}
	@Override
	public String toString() {
		return "CocheElectrico [autonomia=" + autonomia + ", tiempoDeRecarga=" + tiempoDeRecarga + "]";
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	public double getTiempoDeRecarga() {
		return tiempoDeRecarga;
	}
	public void setTiempoDeRecarga(double tiempoDeRecarga) {
		this.tiempoDeRecarga = tiempoDeRecarga;
	}
	
	
	
}
