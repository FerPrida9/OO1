package ar.edu.unlp.info.oo1.ejer7;

import java.util.List;
import java.util.ArrayList;

public class Farola {
	private boolean isOn;
	private List<Farola> neighbors;
	
	public Farola() {
		this.isOn = false;
		this.neighbors = new ArrayList<>();
	}
	
	/* 
	 * Este metodo agrega ambas farolas a la lista de vecinos 
	*/
	
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	public List<Farola> getNeighbors (){
		return this.neighbors;
		}
	
	public void turnOn() {
		if (this.isOff()) {
			this.isOn = true;
			for (Farola neighbor : this.neighbors) {
				neighbor.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.isOn = false;
			for(Farola neighbor : this.neighbors) {
				neighbor.turnOff();
			}
		}
	}
	
	public boolean isOff() {
		return !this.isOn;
	}

	public boolean isOn() {
		return this.isOn;
	}
}
