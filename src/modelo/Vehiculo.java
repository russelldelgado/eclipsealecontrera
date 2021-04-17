package modelo;

import java.time.LocalDate;


public class Vehiculo {
	

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private LocalDate fechaDeAlta;
	private double kilometros; //esto ira variando según
	private Categoria categoria;
	private Oficina ubicacionDeLaOficina;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, LocalDate fechaDeAlta, double kilometros,
			Categoria categoria,Oficina ubicacionDeLaOficina) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.fechaDeAlta = fechaDeAlta;
		this.kilometros = kilometros;
		this.setCategoria(categoria);
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

	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public double getKilometros() {
		return kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Oficina getUbicacionDeLaOficina() {
		return ubicacionDeLaOficina;
	}

	public void setUbicacionDeLaOficina(Oficina ubicacionDeLaOficina) {
		this.ubicacionDeLaOficina = ubicacionDeLaOficina;
	}

	
	

}
