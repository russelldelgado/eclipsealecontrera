package modelo;

import java.util.Date;

public class CocheElectrico extends Vehiculo{

	int autonomia;
	int tiempoDeRecarga;
	public CocheElectrico(String matricula, String marca, String modelo, String color, Date fechaDeAlta,
			double kilometros, Categoria categoria,Oficina ubicacionDeLaOficina, int autonomia, int tiempoDeRecarga) {
		super(matricula, marca, modelo, color, fechaDeAlta, kilometros,categoria ,ubicacionDeLaOficina);
		this.autonomia = autonomia;
		this.tiempoDeRecarga = tiempoDeRecarga;
	}
	@Override
	public String toString() {
		return "CocheElectrico [autonomia=" + autonomia + ", tiempoDeRecarga=" + tiempoDeRecarga + "]";
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	public int getTiempoDeRecarga() {
		return tiempoDeRecarga;
	}
	public void setTiempoDeRecarga(int tiempoDeRecarga) {
		this.tiempoDeRecarga = tiempoDeRecarga;
	}
	
	
	
}
