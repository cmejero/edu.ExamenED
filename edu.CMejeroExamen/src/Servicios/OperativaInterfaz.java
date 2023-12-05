package Servicios;

import java.util.Scanner;

/**
 * Clase que se encarga de la operativa de nuestra aplicación.
 * @author CMR - 05-12-23
 */
public interface OperativaInterfaz {

	/**
	 * Metodo que se encarga de añadir las ganancias con cada venta
	 * @author CMR - 05-12-23
	 * @param comunicacionTeclado
	 */
	public long añadirVenta(Scanner comunicacionTeclado);
	
	/**
	 * Método que se encarga de las perdidas 
	 * @author CMR - 05-12-23
	 * @param comunicacionTeclado
	 */
	public long añadirGastos(Scanner comunicacionTeclado);
	
	/**
	 * Metodo que se encarga de mostrar el total de ganancias/perdidas
	 * @author CMR - 05-12-23
	 * @param comunicacionTeclado
	 * @return
	 */
	public void mostrarTodo();
			
	
	
}
