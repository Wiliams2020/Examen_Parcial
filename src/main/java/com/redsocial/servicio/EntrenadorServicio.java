package com.redsocial.servicio;

import java.util.List;

import com.redsocial.entidad.Entrenador;

public interface EntrenadorServicio {
	
	public int insertaProveedor(Entrenador obj);
	public int actualizaProveedor(Entrenador obj);
	public int eliminaProveedor(int idEntrenador);

	public abstract List<Entrenador> listaEntrenador(String s);

}
