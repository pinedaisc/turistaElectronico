package com.pinedaisc.turista.objetos;

import java.util.ArrayList;

public class Jugador {
	String nombre;
	double balance;
	ArrayList<Propiedad> propiedades;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}
	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", balance=" + balance + ", propiedades=" + propiedades + "]";
	}
	
	
	
	

}
