/* Tp4 Ejercicio 04
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * La Cafetería “Café Fernández” posee una Cafetera que carga cada día con un
 * tipo de Café distinto. La capacidad de la cafetera es de 100 litros de agua, los que son completados cada mañana.
 * Hoy será cargada con “Café Colombia”, cuyo precio es de $150 por litro.
 * Su política de precios es muy simple: vende café en envases de dos Medidas distintas y el precio de cada medida es calculado
 * a partir de sus centímetros cúbicos. Dado que la cafetería sabe el nombre del café y su precio por litro(1000cc), 
 * para calcular el precio de la medida no hay más que dividir el precio del litro / 1000 y luego multiplicarlo por los centímetros
 * cúbicos de la medida. La cafetería procesa los pedidos que haya en el día (termina cuando el pedido es null).
 * Para generar los pedidos hay tres opciones de carga, que son ”M” (medida mediana, 400cc) y “G” (grande, 600cc),
 * —estas dos opciones se obtienen de las iniciales del nombre de cada medida—, ó “F” (final), que se usa para indicar que
 * ya no habrá más pedidos. En el caso de las opciones relacionadas a las medidas también se mostrará el nombre de la misma
 * y su precio. Si al elegir la opción ésta no es “F”, pedirá la cantidad de unidades deseadas y se creará el pedido con la
 * cantidad y la medida indicada por la opción; si no, devolverá null y se cerrará el día.
 * En el cierre se informará el importe recaudado del día y los litros consumidos, que se obtienen de la Cafetera. 
 * La Cafetera va descontando los litros que se van sirviendo según lo indicado en cada pedido.
 * Solamente serán válidos aquellos pedidos que se puedan servir completos.
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
		
		/*Ingresa y valida nombre y tamaño de la medida*/
		medida = pedirMedida();
		cafetera.setNombreMedida(medida);			/*Nombre*/
		cafetera.setTamañoMedida(medida);			/*Tamaño*/
		
		while (medida != 'F') {
			unidades = cantidadUnidades();
			facturacionPedido = cafetera.generarPedido(unidades);
			
			if( facturacionPedido == 0.0f){
				System.out.println("Sin cafe!");
			}
			facturacionTotal += facturacionPedido;
			
			medida = pedirMedida();
			cafetera.setNombreMedida(medida);
			cafetera.setTamañoMedida(medida);
		}

		System.out.println("Recaudacion: $ "+facturacionTotal);
		litrosConsumidos = (float)( cafetera.getCapacidadTotalCafetera() - cafetera.getCapacidadRemanenteCafetera())/ 1000.0f;
		System.out.println("Litros Consumidos: "+litrosConsumidos);
		
		input.close();
	}
}
