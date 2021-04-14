package modelo;

public class Categoria {

	String codigo;
	String descripcion;
	double recargoQueSuponeALosAlquileres;
	public Categoria(String codigo, String descripcion, double recargoQueSuponeALosAlquileres) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.recargoQueSuponeALosAlquileres = recargoQueSuponeALosAlquileres;
	}
	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", descripcion=" + descripcion + ", recargoQueSuponeALosAlquileres="
				+ recargoQueSuponeALosAlquileres + "]";
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
	public double getRecargoQueSuponeALosAlquileres() {
		return recargoQueSuponeALosAlquileres;
	}
	public void setRecargoQueSuponeALosAlquileres(double recargoQueSuponeALosAlquileres) {
		this.recargoQueSuponeALosAlquileres = recargoQueSuponeALosAlquileres;
	}
	
	
	
}
