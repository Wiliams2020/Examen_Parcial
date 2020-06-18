package com.redsocial.entidad;

import java.sql.Date;

public class Entrenador {
	
	private int identrenador;
	private String nombre;
	private String fechanacimiento;
	private Double sueldo;
	private String telefono;
	private String equipo;
	private String email;
	public int getIdentrenador() {
		return identrenador;
	}
	public void setIdentrenador(int identrenador) {
		this.identrenador = identrenador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
