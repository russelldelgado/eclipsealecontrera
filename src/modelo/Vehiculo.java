package modelo;

import java.util.Date;

public class Vehiculo {
	

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private Date fechaDeAlta;
	private double kilometros;
	private String ubicacionDeLaOficina;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, Date fechaDeAlta, double kilometros,
			String ubicacionDeLaOficina) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.fechaDeAlta = fechaDeAlta;
		this.kilometros = kilometros;
		this.ubicacionDeLaOficina = ubicacionDeLaOficina;
	}

	@Override
	public String toString() {
		return "Empleados [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", fechaDeAlta=" + fechaDeAlta + ", kilometros=" + kilometros + ", ubicacionDeLaOficina="
				+ ubicacionDeLaOficina + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public String getUbicacionDeLaOficina() {
		return ubicacionDeLaOficina;
	}

	public void setUbicacionDeLaOficina(String ubicacionDeLaOficina) {
		this.ubicacionDeLaOficina = ubicacionDeLaOficina;
	}
	

}
