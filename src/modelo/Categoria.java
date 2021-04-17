package modelo;

public class Categoria {

	String codigo;
	String descripcion;
	String localidad;
	String provincia;
	double recargoQueSuponeALosAlquileres;
	public Categoria(String codigo, String descripcion, double recargoQueSuponeALosAlquileres , String localidad , String provincia) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.recargoQueSuponeALosAlquileres = recargoQueSuponeALosAlquileres;
	}
	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", descripcion=" + descripcion + ", recargoQueSuponeALosAlquileres="
				+ recargoQueSuponeALosAlquileres + ", localidad=" + localidad + ", provincia" + provincia + "]";
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getRecargoQueSuponeALosAlquileres() {
		return recargoQueSuponeALosAlquileres;
	}
	public void setRecargoQueSuponeALosAlquileres(double recargoQueSuponeALosAlquileres) {
		this.recargoQueSuponeALosAlquileres = recargoQueSuponeALosAlquileres;
	}
	
	
	
}
