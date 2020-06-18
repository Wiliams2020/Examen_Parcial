package com.redsocial.repositorio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.redsocial.entidad.Entrenador;
@Repository
public class EntrenadorMySqlRepositorio implements EntrenadorRepositorio{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertaEntrenador(Entrenador obj) {
		String sql = "insert into entrenador values(null,?,?,?,?,?,?)";
		Object[] val = {obj.getNombre(), obj.getFechanacimiento(),obj.getSueldo(), obj.getTelefono(),obj.getEquipo(),obj.getEmail() };
		return jdbcTemplate.update(sql, val);
	}

	@Override
	public int actualizaEntrenadorr(Entrenador obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminaEntrenador(int idEntrenador) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Entrenador> listaEntrenador(String s) {
		String sql ="select * from entrenador where nombre like ?";
		Object[] val = { s+"%" };
		
		List<Entrenador> lista =  jdbcTemplate.query(sql, val, new RowMapper<Entrenador>() {
			@Override
			public Entrenador mapRow(ResultSet rs, int rowNum) throws SQLException {
				Entrenador obj = new Entrenador();
				obj.setIdentrenador(rs.getInt(1));
				obj.setNombre(rs.getString(2));
				obj.setFechanacimiento(rs.getString(3));
				obj.setSueldo(rs.getDouble(4));
				obj.setTelefono(rs.getString(5));
				obj.setEquipo(rs.getString(6));
				obj.setEmail(rs.getString(7));

				return obj;
			}
			
		});
		
		return lista;
	}
	


}
