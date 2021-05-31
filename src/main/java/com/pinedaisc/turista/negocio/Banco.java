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

}
