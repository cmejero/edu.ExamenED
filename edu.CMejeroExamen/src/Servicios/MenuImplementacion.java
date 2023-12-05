package Servicios;

import java.util.Scanner;

/**
 * Implementacion de la interfaz del menu de la aplicación
 * @author CMR - 05-12-23
 */
public class MenuImplementacion implements MenuInterfaz 
{

	

	public int mostrarMenuYSeleccion( Scanner comunicacionTeclado)
	{		
		
	    System.out.println("##########################");
		System.out.println("0. Cerrar Aplicacion");
		System.out.println("1. Añadir venta");
		System.out.println("2. Añadir gasto");
		System.out.println("3. mostrar total");
		System.out.println("##########################");
		
		int opcionUsuario = comunicacionTeclado.nextInt();
		return opcionUsuario;
	}
	
	
	public long pedirNumero(Scanner comunicacionTeclado) {
		
		long num;
		System.out.println("introduzca la cifra");
		num= comunicacionTeclado.nextLong();
		return num;
		
	}
}
