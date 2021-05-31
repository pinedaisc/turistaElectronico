package com.pinedaisc.turista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pinedaisc.turista.objetos.Estado;

@Controller
public class BancoController {
	
	@GetMapping("hipotecar")
	public ModelAndView hipotecar() {
		return new ModelAndView("hipoteca");
	}
	
	@GetMapping("comprar")
	public ModelAndView comprar() {
		Estado e = new Estado();
		e.setNombre("Michoacan");
		System.out.println(e.toString());
		return new ModelAndView("inicio");
	}
	

}
