package com.distribuida.entities;

public class DatosEmpresa {
	private String empresa;
	private String direccion;
	private String telefono;
	private String correo;
	
	public DatosEmpresa() {}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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

	@Override
	public String toString() {
		return "DatosEmpresa [empresa=" + empresa + ", direccion=" + direccion + ", telefono=" + telefono + ", correo="
				+ correo + "]";
	}
	
	

}
