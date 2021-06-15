package com.pinedaisc.turista.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pinedaisc.turista.objetos.Estado;
import com.pinedaisc.turista.objetos.Jugador;

@Controller
public class InicioController {
	/**
	 * 
	 * @return un string solo para probar que funciona
	 */
	@GetMapping("inicio")
	public ModelAndView inicio(HttpSession session) {
		Jugador j = new Jugador();
		System.out.println("balcne del jugador "+ j.getNombre() + "="  + j.getBalance());
		System.out.println("recuperado de sesion nombreisto: " + (String)session.getAttribute("nombresito") );
		System.out.println("id de session " + session.getId());
		return new ModelAndView("inicio");
	}
	
	//TODO: meter aqui manejo de sesion
	/**
	 * moostar el estatus del jugador
	 * @return
	 */
	@GetMapping("jugador")
	public ModelAndView jugador(HttpSession session) {
		ModelAndView mav = new ModelAndView("vistajugador");
		Jugador j = new Jugador();
		j.setNombre("jugador anonimo");
		System.out.println("balance del jugador --->"+ j);
		session.setAttribute("nombresito", "hola");
		mav.addObject("jugador", j);
		return mav;
	}

	@GetMapping("score")
	public ModelAndView score(HttpSession session) {
		ModelAndView mav = new ModelAndView("score");
		Jugador j = new Jugador();
		j.setNombre("jugador anonimo");
		System.out.println("balance del jugador --->"+ j);
		session.setAttribute("nombresito", "hola");
		mav.addObject("jugador", j);
		return mav;
	}
	
	@GetMapping("destroy")
	@ResponseBody
	public String destroy(HttpSession session) {
		session.invalidate();
		System.out.println("se destruyo la session ve a jugador para revisar");
		return "se destruyo la session ve a jugador para revisar";
	}
}
