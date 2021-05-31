package com.pinedaisc.turista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pinedaisc.turista.objetos.Estado;

@Controller
public class InicioController {
	/**
	 * 
	 * @return un string solo para probar que funciona
	 */
	@GetMapping("inicio")
	public ModelAndView incio() {
		return new ModelAndView("inicio");
	}

}
