package ar.edu.unlp.info.oo1.ejer11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDelInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDelInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDelInteresDiario = porcentajeDelInteresDiario;
	}
	
	public double valorActual() {
		return (this.montoDepositado + (this.montoDepositado * this.porcentajeDelInteresDiario * ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now())));
	}
	
	public LocalDate getFechaDeConstitucion() {
		return this.fechaDeConstitucion;
	}
	
	public double getMontoDepositado() {
		return this.montoDepositado;
	}
	
	public double getPorcentajeDelInteresDiario() {
		return this.porcentajeDelInteresDiario;
	}
}