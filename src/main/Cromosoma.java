package main;

public abstract class Cromosoma {
	protected boolean[] genes;
	protected double aptitud;
	protected double puntuacion;
	protected double acumulada;
	public Cromosoma() {
		aptitud = 0;
		puntuacion = 0;
		acumulada = 0;
	}
	
}