package com.distribuida.entities;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Cliente {
	
	
	//ATRIBUTOS
	private int id_Cliente;
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;
	private Date fecha_Nac; // date
	private String direccion;
	private String telefono; // string
	private String correo;
	
	
	
	//METODO CONSTRUCTOR VACIO
	public Cliente() {
	
	}


	
	//METODOS SET Y GET ESTABLECER Y MOSTRAR
	public int getId_Cliente() {
		return id_Cliente;
	}


	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Date getFecha_Nac() {
		return fecha_Nac;
	}


	public void setFecha_Nac(Date fecha_Nac) {
		this.fecha_Nac = fecha_Nac;
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


	
	@PostConstruct
	public void despuesCreacion() {
		System.out.println("Despues de la creacion del bean");
	}

	@PreDestroy
	public void antesDestruccion() {
		System.out.println("Antes de la destruccion del bean");
	}
	
	
	//MOSTRAR LOS DATOS
	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_Cliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", fecha_nac=" + fecha_Nac + ", direccion=" + direccion + ", telefono="
				+ telefono + ", correo=" + correo + "]";
	}
	

	
	
	
	
	
	

}
