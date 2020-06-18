package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Entrenador;
import com.redsocial.repositorio.EntrenadorRepositorio;

@Service
public class EntrenadorServiceImpl implements EntrenadorServicio{
	
	@Autowired
	private EntrenadorRepositorio repositorio;

	@Override
	public int insertaProveedor(Entrenador obj) {
		return repositorio.insertaEntrenador(obj);
	}

	@Override
	public int actualizaProveedor(Entrenador obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminaProveedor(int idEntrenador) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Entrenador> listaEntrenador(String s) {
		return repositorio.listaEntrenador(s);
	}

}
