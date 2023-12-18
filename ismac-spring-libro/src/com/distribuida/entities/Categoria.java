package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Categoria {
	
	
	//ATRIBUTOS
	private int id_Categoria;
	private String categoria;
	private String descripcion;
	
	//NETODO CONSTRUCTOR VACIO
	public Categoria(){
		
	}

	
	
	//METODO SET Y GET
	public int getId_Categoria() {
		return id_Categoria;
	}

	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	
	//MOSTRAR LOS DATOS
	@Override
	public String toString() {
		return "Categoria [id_Categoria=" + id_Categoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	

}
