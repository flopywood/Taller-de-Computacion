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

public class Cafetera {
	private int capacidadTotalCafetera; /*capacidad que queda expresada en cc. 1 litro = 1000 cc (cm3)*/
	private int capacidadRemanenteCafetera; /*capacidad que queda expresada en cc. 1 litro = 1000 cc (cm3)*/
	private float precioPorLitro;
	private int tamañoMedida;
	private char nombreMedida;
	
	public int getTamañoMedida() {
		return tamañoMedida;
	}
	/*Guarda el tamaño de la medida seleccionada*/
	public void setTamañoMedida(char medida) {
		if( medida == 'G'){
			this.tamañoMedida = 600;	/*Tamaño de la medida Grande = 600 cc*/
		}
		else{
			this.tamañoMedida = 400;	/*Tamaño de la medida Mediana = 400 cc*/
		}
	}
	
	public char getNombreMedida() {
		return nombreMedida;
	}
	public void setNombreMedida(char nombreMedida) {
		if(nombreMedida == 'M' || nombreMedida == 'G'){
			this.nombreMedida = nombreMedida;
		}
		else{
			this.nombreMedida = '?';
		}
	}
	/*Devuelve la cantidad de cafe que queda en la cafetera (en cc)*/
	public int getCapacidadRemanenteCafetera() {
		return capacidadRemanenteCafetera;	
	}
	/*Guarda la cantidad de cafe que queda en la cafetera (en cc)*/
	public void setCapacidadRemanenteCafetera(int capacidad) {
		this.capacidadRemanenteCafetera = capacidad;	
	}
	/*Guarda en cc la cantidad de litros que se le pasa como argumento*/
	public void setCapacidadTotalCafetera(int capacidadCafetera) {
		this.capacidadTotalCafetera = capacidadCafetera * 1000;
		this.capacidadRemanenteCafetera = this.capacidadTotalCafetera;
	}
	/*Devuelve la capacidad total que permite la cafetera (en cc)*/
	public int getCapacidadTotalCafetera() {
		return capacidadTotalCafetera;	
	}
	public float getPrecioPorLitro() {
		return precioPorLitro;
	}
	public void setPrecioPorLitro(float precioPorLitro) {
		this.precioPorLitro = precioPorLitro;
	}
	
	public float generarPedido(int unidad){
		float calculo; 
		/* 1) Verificar que la cafetera tenga el cafe necesario para hacer el pedido*/
		int pedido; /*cuantos cc tiene el pedido actual?*/
		int capacidadRestante;
		
		pedido = unidad * getTamañoMedida();
		
		if( pedido > getCapacidadRemanenteCafetera()){
			calculo = 0.0f;	/*No hay cafe suficiente para preparar el pedido*/
		}else{	/*Hay cafe*/
			capacidadRestante = this.getCapacidadRemanenteCafetera();
			capacidadRestante -= pedido;
			this.setCapacidadRemanenteCafetera( capacidadRestante ); /*Actualiza la cantidad de cafe que queda*/
			
			calculo = (precioPorLitro/1000) * tamañoMedida * unidad;
		}
		
		return calculo;
	}
}
