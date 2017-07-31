package edu.ort.t1.tp4;

public class Respuesta {
	private boolean estado;
	private String informe;

	public Respuesta(boolean estado, String informe) {
		this.estado = estado;
		this.informe = informe;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public String getInforme() {
		return this.informe;
	}
}
