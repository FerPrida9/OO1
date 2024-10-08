package ar.edu.info.unlp.ejer4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.productos = productos;
	}
	
	public LocalDate getFecha () {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto producto : this.productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public double getPesoTotal() {
		double pesoTotal = 0;
		for(Producto producto : this.productos) {
			pesoTotal += producto.getPeso();
		}
		return pesoTotal;
	}

	public double impuesto() {
		return this.getPrecioTotal()*0.21;
	}
}