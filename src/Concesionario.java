import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import conexion.Conexion;
import metodosDeComprobacion.Auxiliar;
import modelo.Alquiler;
import modelo.Categoria;
import modelo.CocheCombustible;
import modelo.CocheElectrico;
import modelo.Empleados;
import modelo.Vehiculo;

public class Concesionario {

	 private String nombreConcesionario;
	 private List<Empleados> listaEmpleadosDelConcesionario;
	 private List<Vehiculo> listaDVehiculosDelConcesionario;
	 private List<Categoria> categoriasDentroDeMiConcesionario;
	 private List<Alquiler> listaDeAlquileresDelConcesionario;




	//que me permite hacer mi concecionario

	//Crud completo OFICINAS , CATEGORIAS , VEHICULOS ,EMPLEADOS

	//REALIZAR PROCESO DE ALQUILER
		//VEHICULO QUE SE ALGUILA
		//EMPLEADO QUE LO ENTREGA
		//CLIENTE QUE LO ALGUILA
		//OFICINA DE DEVOLUCION
		//FECHA DEL FIN DEL PREVISTO ALQUILER
		//ESTO ME DEVUELVE EL IMPORTE PREVISTO DEL ALQUILER CON UNA FORMULA EXPLICADA

	public double alquilarCocheEnConcesionario(Alquiler alquiler){

		double precio = formulaParaCalcularPrecioAlquiler(alquiler);

		return 0.0;
	}

	//PROCESO DE DEVOLUCIÓN DEL VEHÍCULO
		//KILOMETRAJES RECORRIDOS QUE SE SUMARAN A LOS DEL VEHICULO ACTUAL
		//FECHA REAL DE DEVOLUCIÓN
		//EMPLEADO QUE REALIZA LA DEVOLUCIÓN 
		//ESTO ME DEVUELVE EL IMPORTE PREVISTO DEL ALQUILER QUE PUEDE VARIAR DEL PREVITO ANTERIORMENTE


	//LISTADO E INFORMES OPORTUNOS
		//ALQUILERES REALIZADOS ENTRE FECHAS
		//ALQUILERES DE UN DETERMINADO VEHICULO
		//LISTADO DE STOCK DE VEHÍCULOS DE LA EMPRESA ORDENADOS POR OFICINA , MARCA , MODELO ETC...

	//FORMULA PARA CALCULAR EL PRECIO DEL ALQUILER
		//CADA COCHE TIENE UN PRECIO BASE DE ALQUILER POR DIA
			//MOTOS =10 EUROS
			//COCHES = 50 EUROS
			//FURGONETA = 70 EUROS

		//SI EL COCHE ES ELECTRICO SE LE APLICA UN 15% MAS
		//SE LE IMPLICA EL % DE LA CATEGORIA A LA QUE PERTENECE
		//INCREMENTO DE UN 10% SI LA OFICINA ES DE AEROPURTO 

		public  double formulaParaCalcularPrecioAlquiler(Alquiler alquiler){

			int precioMoto = 10;
			int precioCoche = 50;
			int precioFurgoneta = 70;
			double incrementoPorCocheElectrico =  1;
			double incrementoPorOficinaDeAeropuerto =1;

			double precioFinal = 0;
			//calculamos los dias que pasan entre la fecha de hoy y la fecha de entrega
			int dias = Auxiliar.obtenerDiasEntreDosFechas(LocalDate.now(), alquiler.getLocalDate());
			//calculamos el incremento o no del 15% para coches electrico segun el tipo de vehículo con el instance determinamos si es electrico o de combustion
			if(alquiler.getVehiculo() instanceof CocheElectrico){
			 incrementoPorCocheElectrico = 1.15;
			}
			if(alquiler.getOficina().isEsOficinaDeAeropuerto()){
				 incrementoPorOficinaDeAeropuerto = 10;
			}

			

			return precioFinal;
		}

	public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
        
        System.out.println(conexion.toString());
        try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
	}
}
