package com.pinedaisc.turista.objetos;

public class Secretaria extends Propiedad{

	double multiplicadorx1;
	double multiplicadorx2;
	double multiplicadorx3;
	double multiplicadorx4;
	public double getMultiplicadorx1() {
		return multiplicadorx1;
	}
	public void setMultiplicadorx1(double multiplicadorx1) {
		this.multiplicadorx1 = multiplicadorx1;
	}
	public double getMultiplicadorx2() {
		return multiplicadorx2;
	}
	public void setMultiplicadorx2(double multiplicadorx2) {
		this.multiplicadorx2 = multiplicadorx2;
	}
	public double getMultiplicadorx3() {
		return multiplicadorx3;
	}
	public void setMultiplicadorx3(double multiplicadorx3) {
		this.multiplicadorx3 = multiplicadorx3;
	}
	public double getMultiplicadorx4() {
		return multiplicadorx4;
	}
	public void setMultiplicadorx4(double multiplicadorx4) {
		this.multiplicadorx4 = multiplicadorx4;
	}
	@Override
	public String toString() {
		return "Secretaria [multiplicadorx1=" + multiplicadorx1 + ", multiplicadorx2=" + multiplicadorx2
				+ ", multiplicadorx3=" + multiplicadorx3 + ", multiplicadorx4=" + multiplicadorx4 + ", nombre=" + nombre
				+ ", valor=" + valor + ", renta=" + renta + ", hipoteca=" + hipoteca + ", bloque=" + bloque
				+ ", reglaadicional=" + reglaadicional + ", esEmbargado=" + esEmbargado + ", esHipotecado="
				+ esHipotecado + "]";
	}
	
	
	
	
}
