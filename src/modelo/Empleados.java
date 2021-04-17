package modelo;

import java.time.LocalDate;

public class Empleados {
	
	String dni;
	String nombre;
	String apellido1;
	String apellido2;
	LocalDate fechaAltaEnLaEmpresa;
	Oficina oficinaDeTrabajo;
	public Empleados(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaAltaEnLaEmpresa,
			Oficina oficinaDeTrabajo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaAltaEnLaEmpresa = fechaAltaEnLaEmpresa;
		this.oficinaDeTrabajo = oficinaDeTrabajo;
	}
	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", fechaAltaEnLaEmpresa=" + fechaAltaEnLaEmpresa + ", oficinaDeTrabajo=" + oficinaDeTrabajo + "]";
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public LocalDate getFechaAltaEnLaEmpresa() {
		return fechaAltaEnLaEmpresa;
	}
	public void setFechaAltaEnLaEmpresa(LocalDate fechaAltaEnLaEmpresa) {
		this.fechaAltaEnLaEmpresa = fechaAltaEnLaEmpresa;
	}
	public Oficina getOficinaDeTrabajo() {
		return oficinaDeTrabajo;
	}
	public void setOficinaDeTrabajo(Oficina oficinaDeTrabajo) {
		this.oficinaDeTrabajo = oficinaDeTrabajo;
	}
//metodos

	public void entregarCoche(){

	}

	public void recogerCoche(){
		
	}

	
	
}
