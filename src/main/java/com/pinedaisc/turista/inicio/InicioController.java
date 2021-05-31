package com.pinedaisc.turista.inicio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
