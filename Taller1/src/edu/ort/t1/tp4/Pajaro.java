/* Tp4 Ejercicio 01
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Declare la clase Pajaro con los atributos que considere necesarios. Debe tener,
 * como mínimo, los atributos booleanos hambriento y sediento.
 * Instancie un gorrión de 6 años de edad, 28 gramos de peso, 14 centímetros de
 * longitud y 20 de envergadura. completando los valores de todos sus atributos a
 * través de sus setters. Haga que coma semillas (o lo que le demos) y que beba, a
 * fin de calmar su hambre y su sed.
 * Finalmente muestre el estado de todos sus atributos.
 */
package edu.ort.t1.tp4;

public class Pajaro {
		private String nombre;
		private String tipo;
		private boolean hambriento = true;
		private boolean sediento = true;
		private int edad = 0;
		private float peso = 0;
		private float longitud = 0;
		private float envergadura;
		private float comidaActual = 0;
		private float bebidaActual = 0;

		final float ESTABLE_COMIDA = 30; // A partir de este valor no tiene más
											// hambre, menos esta hambriento.
		final float MAX_COMIDA = 58; // Valor Maximo que indica hasta donde puede
										// comer
		final float ESTABLE_BEBIDA = 10; // A partir de este valor no tiene más sed,
											// menos esta sediento.
		final float MAX_BEBIDA = 35; // Valor Maximo que indica hasta donde puede tomar

		
		public boolean getHambriento()
		{
			return this.hambriento;
		}
		
		public boolean getSediento()
		{
			return this.sediento;
		}
		
		public String getNombre() {
			return this.nombre;
		}

		public void setNombre(String _nombre) {
			this.nombre = _nombre;
		}
		
		public float getpeso() {
			return this.peso ;
		}
		public void setPeso (float peso){
			this.peso = peso ;
		}

		public String getTipo() {
			return this.tipo;
		}

		public void setTipo(String _tipo) {
			this.tipo = _tipo;
		}

		public int getEdad() {
			return this.edad;
		}

		public void setEdad(int _edad) {
			this.edad = _edad;
		}

		public float getPeso() {
			return this.peso;
		}

		public float getLongitud() {
			return this.longitud;
		}

		public void setLongitud(float _longitud) {
			this.longitud = _longitud;
		}

		public float getEnvergadura() {
			return this.envergadura;
		}

		public void setEnvergadura(float _envergadura) {
			this.envergadura = _envergadura;
		}

		public float alimentar(float cant) {
			float calculo = this.comidaActual + cant;

			if (this.hambriento || this.comidaActual < MAX_COMIDA) {
				if (calculo > MAX_COMIDA) {
					this.comidaActual = MAX_COMIDA;
					this.hambriento = false;
					return (calculo - MAX_COMIDA); // Devuelvo lo que no llego a
													// comer por estar lleno.
				} else if (calculo > ESTABLE_COMIDA) {
					this.comidaActual = calculo;
					this.hambriento = false;
					return 0;
				} else if (calculo < ESTABLE_COMIDA) {
					this.comidaActual = calculo;
					this.hambriento = true; // Sigue hambriento porque no supera el
											// valor estable.
					return 0;
				}
			}
			return cant; // Si no estaba hambriento y quedo alimentado al MAXIMO
							// devuelve toda la comida.

		}

		public float beber(float cant) {
			float calculo = this.bebidaActual + cant;

			if (this.sediento || this.bebidaActual < MAX_BEBIDA) {
				if (calculo > MAX_BEBIDA) {
					this.bebidaActual = MAX_BEBIDA;
					this.sediento = false;
					return (calculo - MAX_BEBIDA); // Devuelvo lo que no llego a
													// tomar por estar lleno.
				} else if (calculo > ESTABLE_BEBIDA) {
					this.bebidaActual = calculo;
					this.sediento = false;
					return 0;
				} else if (calculo < ESTABLE_BEBIDA) {
					this.bebidaActual = calculo;
					this.sediento = true; // Sigue hambriento porque no supera el
											// valor estable.
					return 0;
				}
			}
			return cant; // Si no estaba hambriento y quedo alimentado al MAXIMO
							// devuelve toda la comida.

		}
		

		
	}
