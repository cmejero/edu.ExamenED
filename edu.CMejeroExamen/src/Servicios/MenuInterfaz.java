package Servicios;

import java.util.Scanner;
/**
 * Clase interfaz que se encarga del menu principal de la aplicacion
 * @author CMR - 05-12-23
 */
public interface MenuInterfaz {
	
/**
 * Metodo que mostrara las diferentes opciones que puede realizar el usuario
 * @author CMR - 05-12-23
 * @param comunicacionTeclado
 * @return
 */
	public int mostrarMenuYSeleccion(Scanner comunicacionTeclado);
				
	
/**
 * Metodo que se encarga de pedir la cifra que queremos introducir para las ventas
 * o gastos.
 * @author CMR - 05-12-23
 * @param comunicacionTeclado
 * @return
 */
	public long pedirNumero(Scanner comunicacionTeclado);
}
