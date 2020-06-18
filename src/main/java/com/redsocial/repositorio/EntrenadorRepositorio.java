package com.redsocial.repositorio;

import java.util.List;

import com.redsocial.entidad.Entrenador;

public interface EntrenadorRepositorio {
	
	public int insertaEntrenador(Entrenador obj);
	public int actualizaEntrenadorr(Entrenador obj);
	public int eliminaEntrenador(int idEntrenador);

	public abstract List<Entrenador> listaEntrenador(String s);

}
