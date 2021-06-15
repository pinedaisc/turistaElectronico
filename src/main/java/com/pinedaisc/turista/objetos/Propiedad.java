package com.pinedaisc.turista.objetos;


public class Propiedad {
	 String id ="CC"; 
	 String nombre = "propiedadx";
	 double valor = 0;
	 double renta = 0;
	 double hipoteca = 0;
	 String bloque = "bajio";
	 String reglaadicional = "";
	 boolean esEmbargado = false;
	 boolean esHipotecado = false;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getRenta() {
		return renta;
	}
	public void setRenta(double renta) {
		this.renta = renta;
	}
	public double getHipoteca() {
		return hipoteca;
	}
	public void setHipoteca(double hipoteca) {
		this.hipoteca = hipoteca;
	}
	public String getBloque() {
		return bloque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	public String getReglaadicional() {
		return reglaadicional;
	}
	public void setReglaadicional(String reglaadicional) {
		this.reglaadicional = reglaadicional;
	}
	public boolean isEsEmbargado() {
		return esEmbargado;
	}
	public void setEsEmbargado(boolean esEmbargado) {
		this.esEmbargado = esEmbargado;
	}
	public boolean isEsHipotecado() {
		return esHipotecado;
	}
	public void setEsHipotecado(boolean esHipotecado) {
		this.esHipotecado = esHipotecado;
	}
	
	@Override
	public String toString() {
		return "Propiedad [id=" + id + ", nombre=" + nombre + ", valor=" + valor + ", renta=" + renta + ", hipoteca="
				+ hipoteca + ", bloque=" + bloque + ", reglaadicional=" + reglaadicional + ", esEmbargado="
				+ esEmbargado + ", esHipotecado=" + esHipotecado + "]";
	}

	 
	
}
