package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/**
 * Clase principal de nuestra aplicación
 * @author CMR - 05-12-23
 */
public class Inicio {

	/**
	 * Metodo de entrada de nuestra aplicación
	 * @author CMR - 05-12-23
	 * @param args
	 */
	public static void main(String[] args) {
	MenuInterfaz mi = new MenuImplementacion();
	OperativaInterfaz oi = new OperativaImplementacion();
		Scanner sc = new Scanner(System.in);
		
        
		int opcionSeleccionada;
		boolean cerrarMenu= false;
		
		while(!cerrarMenu) {
			opcionSeleccionada = mi.mostrarMenuYSeleccion(sc);
			
			switch(opcionSeleccionada) {
			case 0:
				System.out.println("Has seleccionado cerrar menú");
				cerrarMenu = true;
				break;
			case 1:
				System.out.println("Has seleccionado añadir venta");
				oi.añadirVenta(sc);
				break;
			case 2:
			    System.out.println("Has seleccionado añadir gasto");
			    oi.añadirGastos(sc);
			    break;
			case 3:
				System.out.println("Has seleccionado mostrar todo");
				oi.mostrarTodo();
				
				break;
			default:
				System.out.println("La opción seleccionada no coincide con ninguna");
				break;
				
			}
		
			
		}
	}

}
