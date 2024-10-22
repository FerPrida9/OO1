package ar.edu.unlp.info.oo1.ejer11;

import java.util.LinkedList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new LinkedList<>();
	}
	
	public Inversor() {
		this.inversiones = new LinkedList<>();
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Inversion> getInversiones(){
		return new LinkedList<>(inversiones);
	}
	
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
}