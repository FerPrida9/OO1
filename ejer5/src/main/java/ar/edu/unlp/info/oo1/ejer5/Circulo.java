package ar.edu.unlp.info.oo1.ejer5;

public class Circulo implements Figura{
	private double radio;
	private double diametro;
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI * this.diametro;
	}
	
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}
}