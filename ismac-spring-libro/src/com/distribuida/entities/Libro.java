package com.distribuida.entities;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Libro {
	
	//ATRIBUTOS
		private int id_Libro;
		private String titulo;
		private String editorial;
		private int num_Paginas;
		private String edicion;
		private String idioma;
		private Date fecha_Publicacion;
		private String descripcion;
		private String tipo_Pasta;
		private String isbn;
		private int num_Ejemplares;
		private String portada;
		private String presentacion;
		private float precio;
		
		
		//CATEGORIA Y AUTOR
		@Autowired
		private Categoria categoria;  // CATEGORIA
		@Autowired
		private Autor autor;// AUTOR	
		
		
		
	//METODOS SET Y GET
		
		public int getId_Libro() {
			return id_Libro;
		}
		public void setId_Libro(int id_Libro) {   ///SET
			this.id_Libro = id_Libro;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {   ///SET
			this.titulo = titulo;
		}
		public String getEditorial() {
			return editorial;
		}
		public void setEditorial(String editorial) { ///SET
			this.editorial = editorial;
		}
		public int getNum_Paginas() {
			return num_Paginas;
		}
		public void setNum_Paginas(int num_Paginas) { ///SET
			this.num_Paginas = num_Paginas;
		}
		public String getEdicion() {
			return edicion;
		}
		public void setEdicion(String edicion) {  ///SET
			this.edicion = edicion; 
		}
		public String getIdioma() {
			return idioma;
		}
		public void setIdioma(String idioma) {  ///SET
			this.idioma = idioma;
		}
		public Date getFecha_Publicacion() {
			return fecha_Publicacion;
		}
		public void setFecha_publicacion(Date fecha_publicacion) { ///SET
			this.fecha_Publicacion = fecha_publicacion;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {   ///SET
			this.descripcion = descripcion;
		}
		public String getTipo_Pasta() {
			return tipo_Pasta;
		}
		public void setTipo_Pasta(String tipo_Pasta) {   ///SET
			this.tipo_Pasta = tipo_Pasta;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {   ///SET
			this.isbn = isbn;
		}
		public int getNum_Ejemplares() {
			return num_Ejemplares;
		}
		public void setNum_Ejemplares(int num_Ejemplares) {  ///SET
			this.num_Ejemplares = num_Ejemplares;
		}
		public String getPortada() {
			return portada;
		}
		public void setPortada(String portada) {  ///SET
			this.portada = portada;
		}
		public String getPresentacion() {
			return presentacion;
		}
		public void setPresentacion(String presentacion) {    ///SET
			this.presentacion = presentacion;
		}
		public float getPrecio() {
			return precio;
		}
		public void setPrecio(float precio) {   ///SET
			this.precio = precio;
		}
	
		
		
		
		
		//INYECTAMOS POR SET Y GET A CATEGORIA Y AUTOR
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public Autor getAutor() {
			return autor;
		}
		public void setAutor(Autor autor) {
			this.autor = autor;
		}
		
		
		
		
		
		//MOSTRAMOS LOS DATOS
		@Override
		public String toString() {
			return "Libro [id_Libro=" + id_Libro + ", titulo=" + titulo + ", editorial=" + editorial + ", num_paginas="
					+ num_Paginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fecha_publicacion="
					+ fecha_Publicacion + ", descripcion=" + descripcion + ", tipo_pasta=" + tipo_Pasta + ", isbn="
					+ isbn + ", num_ejemplares=" + num_Ejemplares + ", portada=" + portada + ", presentacion="
					+ presentacion + ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
		}
		
		

		
		

		
	

}
