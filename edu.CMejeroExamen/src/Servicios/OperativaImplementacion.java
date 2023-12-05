package Servicios;
import java.util.Scanner;

/**
 * Implementacion de la interfaz operativa de la aplicación
 * @author CMR - 05-12-23
 */
public class OperativaImplementacion implements OperativaInterfaz
{
	
	
			
	MenuInterfaz mi = new MenuImplementacion();
	long total=0;
			
public long añadirVenta(Scanner comunicacionTeclado) {
	
	long ventas;
	long cifraVenta= mi.pedirNumero(comunicacionTeclado);	
	long aux= 0;
	int i;
	for(i= 0; i<=0 ; ++i) {
		aux= total + cifraVenta;
		ventas= aux + cifraVenta ;
			total=ventas;
			
	}
	return total;
	
}


public long añadirGastos(Scanner comunicacionTeclado)
{
	long gastos;
	long cifraVenta= mi.pedirNumero(comunicacionTeclado);	
	long aux= 0;
	int i;
	for(i= 0; i<=0 ; ++i) {
		aux= total - cifraVenta;
		gastos= aux - cifraVenta;
		total=gastos;
		
		if(total==0) {
			System.out.println("Tus balance ganancias/perdidas esta en 0");
		}
		 else if(total<=0) {
			System.out.println("Tu balance ganancias/perdidas esta en negativo");
		}
		 else {
			 System.out.println("Tu balance ganancias/perdidas es positivo");
		 }
		
	}
	return total;
}


public void mostrarTodo() {
	long calculoTotal= total;
	System.out.println(calculoTotal);
	
	if(calculoTotal<0) {
		System.out.println("Vamos muy mal");
	}
	else if(calculoTotal==0) {
		System.out.println("Vamos mal");
	}
}


	
}





