/*Tp4 Ejercicio 05
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * El cine de Villa Chica da una �nica funci�n por noche. Cada d�a ingresa el nombre de la pel�cula (casi siempre distinta)
 * para su sala de 170 espectadores, y en la boleter�a fijan el precio del boleto y reinician el contador de transacciones.
 * Por cada intento de transacci�n, la boleter�a controla que alcancen los asientos disponibles como para cumplir con el pedido.
 * Si no alcanzan las localidades se informa y el pedido es rechazado.
 * Cuando s� alcanza, la boleter�a procesa la venta de los boletos y entrega un ticket indicando el n�mero de transacci�n, la 
 * pel�cula, la cantidad de butacas pagadas y el importe total de la transacci�n, que se le muestra al comprador.
 * La carga se interrumpe cuando se ingresa 0 en la cantidad de entradas pedidas o cuando no hay m�s localidades 
 * (lo que se informa por programa).Al cierre se informan las localidades vendidas, la cantidad de transacciones 
 * realizadas y el total recaudado.
 */
package edu.ort.t1.tp4;

public class Funcion {
	private String pelicula;
	private Sala sala;
	private int localidadesVendidas;

	public Funcion(String pelicula, Sala sala) {
		this.pelicula = pelicula;
		this.sala = sala;
		localidadesVendidas = 0;
	}

	public int getLocalidadesLibres() {
		if (sala != null)
			return (sala.getCantButacas() - localidadesVendidas);
		else
			return 0;
	}

	public int getLocalidadesVendidas() {
		return localidadesVendidas;
	}

	public boolean venderLocalidades(int cantidad) {
		// Reviso que la cantidad sea mayor a cero, y que haya disponibilidad
		// para la cant q me pasen
		if (cantidad > 0 && getLocalidadesLibres() >= cantidad) {
			localidadesVendidas += cantidad;
			return true;
		} else
			return false;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

}
