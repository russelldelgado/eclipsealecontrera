package modelo;

import java.util.ArrayList;

public class Cliente {
	String dni;
	String nombre;
	String apellido1;
	String apellido2;
	boolean clienteHabitual;
	ArrayList<CarneCoche> carneCoche;
	ArrayList<CarneMoto> carneMoto;
	public Cliente(String dni, String nombre, String apellido1, String apellido2, boolean clienteHabitual,
			ArrayList<CarneCoche> carneCoche, ArrayList<CarneMoto> carneMoto) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.clienteHabitual = clienteHabitual;
		this.carneCoche = carneCoche;
		this.carneMoto = carneMoto;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", clienteHabitual=" + clienteHabitual + ", carneCoche=" + carneCoche + ", carneMoto=" + carneMoto
				+ "]";
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
	public boolean isClienteHabitual() {
		return clienteHabitual;
	}
	public void setClienteHabitual(boolean clienteHabitual) {
		this.clienteHabitual = clienteHabitual;
	}
	public ArrayList<CarneCoche> getCarneCoche() {
		return carneCoche;
	}
	public void setCarneCoche(ArrayList<CarneCoche> carneCoche) {
		this.carneCoche = carneCoche;
	}
	public ArrayList<CarneMoto> getCarneMoto() {
		return carneMoto;
	}
	public void setCarneMoto(ArrayList<CarneMoto> carneMoto) {
		this.carneMoto = carneMoto;
	}

	
	
	
}
