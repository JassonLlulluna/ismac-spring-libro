package com.distribuida.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Factura {
	
	
	//ATRIBUTOS
		private int id_Factura; 
		private int fecha;         
		private float total_Neto; 
		private float iva; 
		private float total;
		
		//GENERAMOS CLIENTE
		@Autowired
		private Cliente cliente;  //CLIENTE
		

		
		//CONSTRUCTOR VACIO
		public Factura() {}
		
		
		//CONSTRUCTOR CON CLIENTE
		public Factura(Cliente cliente) {
			this.cliente=cliente;
		}
		
		
		
		
		//METODOS SET Y GET
		public int getId_Factura() {
			return id_Factura;
		}
		public void setId_Factura(int id_Factura) {
			this.id_Factura = id_Factura;
		}
		public int getFecha() {
			return fecha;
		}
		public void setFecha(int fecha) {
			this.fecha = fecha;
		}
		public float getTotal_Neto() {
			return total_Neto;
		}
		public void setTotal_Neto(float total_Neto) {
			this.total_Neto = total_Neto;
		}
		public float getIva() {
			return iva;
		}
		public void setIva(float iva) {
			this.iva = iva;
		}
		public float getTotal() {
			return total;
		}
		public void setTotal(float total) {
			this.total = total;
		}

		
	
		//INYECTAR POR SET Y GET A CLIENTE
		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		
		
		//IMPRIMIR DATOS 
		@Override
		public String toString() {
			return "Factura [id_Factura=" + id_Factura + ", fecha=" + fecha + ", total_Neto=" + total_Neto + ", iva="
					+ iva + ", total=" + total + ", cliente=" + cliente + "]";
		}
		
		
		
		
		
		
		
		

}
