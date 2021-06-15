package com.pinedaisc.turista.objetos;

import java.util.ArrayList;

public class Jugador {
	String nombre;
	double balance = 150000;
	ArrayList<Propiedad> propiedades;
	int turnosBloqueados = 0;
	boolean encarcelado = false;
	
	
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
	public int getTurnosBloqueados() {
		return turnosBloqueados;
	}
	public void setTurnosBloqueados(int turnosBloqueados) {
		this.turnosBloqueados = turnosBloqueados;
	}
	public boolean isEncarcelado() {
		return encarcelado;
	}
	public void setEncarcelado(boolean encarcelado) {
		this.encarcelado = encarcelado;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", balance=" + balance + ", propiedades=" + propiedades
				+ ", turnosBloqueados=" + turnosBloqueados + ", isEncarcelado=" + encarcelado + "]";
	}
	
	
	
	
	

}
