package com.redsocial.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.redsocial.entidad.Entrenador;
import com.redsocial.servicio.EntrenadorServicio;

@Controller
public class EntrenadorController {
	
	@Autowired
	private EntrenadorServicio servicio;
	
	@RequestMapping("/verEntrenador")
	public String mostrar() {
		return "/crudEntrenador";
	}
	@RequestMapping("/listaEntrenador")
	public String lista(@RequestParam Map<String,String> params, Model m) {
		String fil = params.get("filtro");
		List<Entrenador> lista = servicio.listaEntrenador(fil);
		m.addAttribute("entrenador",lista);
		return "/crudEntrenador";
	}
	@RequestMapping("/registraEntrenador")
	public String registra(Entrenador obj , Model m) {
		servicio.insertaProveedor(obj);
		List<Entrenador> lista = servicio.listaEntrenador("");
		m.addAttribute("entrenador",lista);
		return "/crudEntrenador";
	}

}
