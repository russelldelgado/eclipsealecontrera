package modelo;

import java.util.ArrayList;

public class Oficina {

	String codigo;
	String descripcion;
	String localidad;
	String provincia;
	boolean esOficinaDeAeropuerto;
	ArrayList<Empleados> empleados;
	public Oficina(String codigo, String descripcion, String localidad, String provincia, boolean esOficinaDeAeropuerto,
			ArrayList<Empleados> empleados) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.esOficinaDeAeropuerto = esOficinaDeAeropuerto;
		this.empleados = empleados;
	}
	@Override
	public String toString() {
		return "Oficina [codigo=" + codigo + ", descripcion=" + descripcion + ", localidad=" + localidad
				+ ", provincia=" + provincia + ", esOficinaDeAeropuerto=" + esOficinaDeAeropuerto + ", empleados="
				+ empleados + "]";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public boolean isEsOficinaDeAeropuerto() {
		return esOficinaDeAeropuerto;
	}
	public void setEsOficinaDeAeropuerto(boolean esOficinaDeAeropuerto) {
		this.esOficinaDeAeropuerto = esOficinaDeAeropuerto;
	}
	public ArrayList<Empleados> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleados> empleados) {
		this.empleados = empleados;
	}

	
	
}
