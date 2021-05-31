package com.pinedaisc.turista.objetos;

public class Estado extends Propiedad{
	 double casax1 = 0;
	 double casax2 = 0;
	 double casax3 = 0;
	 double casax4 = 0;
	 double hotel = 0;
	 double valorCasa = 0;
	 double valorHotel = 0;
	 
	 
	 
	public double getCasax1() {
		return casax1;
	}



	public void setCasax1(double casax1) {
		this.casax1 = casax1;
	}



	public double getCasax2() {
		return casax2;
	}



	public void setCasax2(double casax2) {
		this.casax2 = casax2;
	}



	public double getCasax3() {
		return casax3;
	}



	public void setCasax3(double casax3) {
		this.casax3 = casax3;
	}



	public double getCasax4() {
		return casax4;
	}



	public void setCasax4(double casax4) {
		this.casax4 = casax4;
	}



	public double getHotel() {
		return hotel;
	}



	public void setHotel(double hotel) {
		this.hotel = hotel;
	}



	public double getValorCasa() {
		return valorCasa;
	}



	public void setValorCasa(double valorCasa) {
		this.valorCasa = valorCasa;
	}



	public double getValorHotel() {
		return valorHotel;
	}



	public void setValorHotel(double valorHotel) {
		this.valorHotel = valorHotel;
	}



	@Override
	public String toString() {
		return "Estado [casax1=" + casax1 + ", casax2=" + casax2 + ", casax3=" + casax3 + ", casax4=" + casax4
				+ ", hotel=" + hotel + ", valorCasa=" + valorCasa + ", valorHotel=" + valorHotel + ", nombre=" + nombre
				+ ", valor=" + valor + ", renta=" + renta + ", hipoteca=" + hipoteca + ", bloque=" + bloque
				+ ", reglaadicional=" + reglaadicional + ", esEmbargado=" + esEmbargado + ", esHipotecado="
				+ esHipotecado + "]";
	}




}
