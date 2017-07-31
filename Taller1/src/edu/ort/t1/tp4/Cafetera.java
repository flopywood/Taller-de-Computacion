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

public class Cafetera {
	private int capacidadTotalCafetera; /*capacidad que queda expresada en cc. 1 litro = 1000 cc (cm3)*/
	private int capacidadRemanenteCafetera; /*capacidad que queda expresada en cc. 1 litro = 1000 cc (cm3)*/
	private float precioPorLitro;
	private int tama�oMedida;
	private char nombreMedida;
	
	public int getTama�oMedida() {
		return tama�oMedida;
	}
	/*Guarda el tama�o de la medida seleccionada*/
	public void setTama�oMedida(char medida) {
		if( medida == 'G'){
			this.tama�oMedida = 600;	/*Tama�o de la medida Grande = 600 cc*/
		}
		else{
			this.tama�oMedida = 400;	/*Tama�o de la medida Mediana = 400 cc*/
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
		
		pedido = unidad * getTama�oMedida();
		
		if( pedido > getCapacidadRemanenteCafetera()){
			calculo = 0.0f;	/*No hay cafe suficiente para preparar el pedido*/
		}else{	/*Hay cafe*/
			capacidadRestante = this.getCapacidadRemanenteCafetera();
			capacidadRestante -= pedido;
			this.setCapacidadRemanenteCafetera( capacidadRestante ); /*Actualiza la cantidad de cafe que queda*/
			
			calculo = (precioPorLitro/1000) * tama�oMedida * unidad;
		}
		
		return calculo;
	}
}
