package ar.edu.unlp.info.oo1.ejer3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto (String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem (Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Item item : this.items) {
			total += item.costo();
		}
		return total;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems (List<Item> items) {
		this.items = items;
	}
}