import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import conexion.Conexion;
import modelo.Cliente;
import modelo.Empleados;
import modelo.Oficina;
import modelo.Vehiculo;

public class Concesionario {


	//que me permite hacer mi concecionario

	//Crud completo OFICINAS , CATEGORIAS , VEHICULOS ,EMPLEADOS

	//REALIZAR PROCESO DE ALQUILER
		//VEHICULO QUE SE ALGUILA
		//EMPLEADO QUE LO ENTREGA
		//CLIENTE QUE LO ALGUILA
		//OFICINA DE DEVOLUCION
		//FECHA DEL FIN DEL PREVISTO ALQUILER
		//ESTO ME DEVUELVE EL IMPORTE PREVISTO DEL ALQUILER CON UNA FORMULA EXPLICADA

	public double alquilarCocheEnConcesionario(Vehiculo vehiculo , Empleados empleadoQueEntregaCoche , Cliente clienteQueAlquilaCoche, Oficina oficinaDeDevolucion, LocalDate fechaPrevistaDevolucion ){


		return 0;
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

		public void formulaParaCalcularPrecioAlquiler(){
			
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
