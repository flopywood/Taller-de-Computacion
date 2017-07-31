/* Tp4 Ejercicio 04
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * La Cafeter�a �Caf� Fern�ndez� posee una Cafetera que carga cada d�a con un
 * tipo de Caf� distinto. La capacidad de la cafetera es de 100 litros de agua, los que son completados cada ma�ana.
 * Hoy ser� cargada con �Caf� Colombia�, cuyo precio es de $150 por litro.
 * Su pol�tica de precios es muy simple: vende caf� en envases de dos Medidas distintas y el precio de cada medida es calculado
 * a partir de sus cent�metros c�bicos. Dado que la cafeter�a sabe el nombre del caf� y su precio por litro(1000cc), 
 * para calcular el precio de la medida no hay m�s que dividir el precio del litro / 1000 y luego multiplicarlo por los cent�metros
 * c�bicos de la medida. La cafeter�a procesa los pedidos que haya en el d�a (termina cuando el pedido es null).
 * Para generar los pedidos hay tres opciones de carga, que son �M� (medida mediana, 400cc) y �G� (grande, 600cc),
 * �estas dos opciones se obtienen de las iniciales del nombre de cada medida�, � �F� (final), que se usa para indicar que
 * ya no habr� m�s pedidos. En el caso de las opciones relacionadas a las medidas tambi�n se mostrar� el nombre de la misma
 * y su precio. Si al elegir la opci�n �sta no es �F�, pedir� la cantidad de unidades deseadas y se crear� el pedido con la
 * cantidad y la medida indicada por la opci�n; si no, devolver� null y se cerrar� el d�a.
 * En el cierre se informar� el importe recaudado del d�a y los litros consumidos, que se obtienen de la Cafetera. 
 * La Cafetera va descontando los litros que se van sirviendo seg�n lo indicado en cada pedido.
 * Solamente ser�n v�lidos aquellos pedidos que se puedan servir completos.
 */
package edu.ort.t1.tp4;

import java.util.Scanner;

public class TestCafeteria {

	public static Scanner input;

	public static char pedirMedida() {
		char medida;
		do{
			System.out.print("Ingresar opcion de carga ('M' 'G' o 'F'):");
			medida = input.next().charAt(0);
		}while(medida != 'M' && medida != 'G' && medida != 'F');
		
		return medida;
	}

	public static int cantidadUnidades() {
		int cantidad;
		System.out.print("Ingrese la cantidad de unidades deseadas:");
		cantidad = input.nextInt();
		return cantidad;
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Cafetera cafetera = new Cafetera();

		char medida;
		int unidades;
		float facturacionPedido;
		float facturacionTotal;
		float litrosConsumidos;
		
		facturacionTotal = 0.0f;
		/*Defino capacidad*/
		cafetera.setCapacidadTotalCafetera(100);	/*Capacidad total = 100 litros*/
		
		/*Defino precio/litro*/
		cafetera.setPrecioPorLitro(150.0f); 		/*Precio por cada litro = $150.00*/
		
		/*Ingresa y valida nombre y tama�o de la medida*/
		medida = pedirMedida();
		cafetera.setNombreMedida(medida);			/*Nombre*/
		cafetera.setTama�oMedida(medida);			/*Tama�o*/
		
		while (medida != 'F') {
			unidades = cantidadUnidades();
			facturacionPedido = cafetera.generarPedido(unidades);
			
			if( facturacionPedido == 0.0f){
				System.out.println("Sin cafe!");
			}
			facturacionTotal += facturacionPedido;
			
			medida = pedirMedida();
			cafetera.setNombreMedida(medida);
			cafetera.setTama�oMedida(medida);
		}

		System.out.println("Recaudacion: $ "+facturacionTotal);
		litrosConsumidos = (float)( cafetera.getCapacidadTotalCafetera() - cafetera.getCapacidadRemanenteCafetera())/ 1000.0f;
		System.out.println("Litros Consumidos: "+litrosConsumidos);
		
		input.close();
	}
}
