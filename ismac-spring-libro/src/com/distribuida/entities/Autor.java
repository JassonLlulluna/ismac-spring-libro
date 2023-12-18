package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Autor {
	
	
	//ATRIBUTOS
	private int id_Autor;
	private String nombre;
	private String apellido;
	private String pais;
	private String direccion;
	private String telefono;
	private String correo;
	
	
	//METODO CONSTRUCTOR VACIO
	public Autor() {
		
	}

	
	
	//METODOS SET Y GET

	public int getId_Autor() {
		return id_Autor;
	}


	public void setId_Autor(int id_Autor) {
		this.id_Autor = id_Autor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}



	//MOSTRAR LOS DATOS
	
	@Override
	public String toString() {
		return "Autor [id_Autor=" + id_Autor + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
	
	
	

	

}
