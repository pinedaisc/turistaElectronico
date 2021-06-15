package com.pinedaisc.turista.negocio;

import java.util.ArrayList;

import com.pinedaisc.turista.objetos.Jugador;
import com.pinedaisc.turista.objetos.Propiedad;

public class Banco {
	
	public int compruebaPropiedaedsPorZona(Jugador jugador){
		ArrayList<Propiedad> propiedades = jugador.getPropiedades();
		
		for (Propiedad propiedad : propiedades) {
			//TODO si tienes las 3 propiedades de alguna region aplica alguna regla
		}
		return 0;
	}
	
	
	/**
	 * El banco paga 20,000 de sueldo al jugador que pase o caiga en la casilla de inicio  si no  es  por viaje sin escalas
	 * @param jugador
	 * @return
	 */
	public int sueldo(Jugador jugador) {
		double balance = jugador.getBalance();
		jugador.setBalance(balance + 2000);
		return 0;
	}
	
	
	public int entrarCarcel(Jugador j) {
		j.setTurnosBloqueados(3);
		j.setEncarcelado(true);
		return 0;
	}
	
	public int pagarCarcel(Jugador j) {
		if(j.getBalance()-5000 < 0) {
			System.out.println("No tiene suficiente dinero");
			return -1;
		}
		j.setBalance(j.getBalance()-5000);
		salirCarcel(j);
		System.out.println("paga y sale de la cárcel");
		return 0;

	}
	
	public int salirCarcel(Jugador j) {
		if(j.getTurnosBloqueados()<= 0)
			j.setEncarcelado(false);
		return 0;
	}
}
