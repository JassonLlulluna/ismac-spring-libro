package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;



public class Principal3 {
	
	public static void main(String [] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
	
		//APUNTANDO A LOS BEAN DE APPLICATION CONTEXT
		
		Cliente cliente = context.getBean("idCliente",Cliente.class);
		Libro libro = context.getBean("idLibro",Libro.class);		     //CODIGO ACOPLADO
		Factura factura = context.getBean("idFactura",Factura.class);	
		DetalleFactura facturaDetalle = context.getBean("idFacturaDetalle",DetalleFactura.class);
		Categoria categoria = context.getBean("idCategoria",Categoria.class);
		Autor autor = context.getBean("idAutor",Autor.class);
		
		
		cliente.setId_cliente(1);
		cliente.setNombre("Paul");
		cliente.setApellido("Apellido");
		cliente.setCedula("1755414727");
		cliente.setCorreo("jassonl@gmail");
		cliente.setDireccion("Tumbaco");
		cliente.setEdad(19);
		cliente.setFecha_nac(new Date());
		
		libro.setId_libro(1);
		libro.setTitulo("Don Quijotes");
		libro.setEditorial("Editorial");
		libro.setNum_paginas(1);
		libro.setEdicion("Edicion");
		libro.setIdioma("Español");
		libro.setFecha_publicacion(new Date());
		libro.setDescripcion("Libro original don quijote");
		libro.setTipo_pasta("Empastado");
		libro.setIsbn("02030");
		libro.setNum_ejemplares(100);
		libro.setPortada("Portada");
		libro.setPresentacion("Presentacion");
		libro.setPrecio(50);
		
		factura.setId_factura(1);
		factura.setFecha(0);
		factura.setIva(0);
		factura.setTotal(0);
		factura.setTotal_neto(0);
		
		facturaDetalle.setId_detallefactura(1);
		facturaDetalle.setCantidad(1);
		facturaDetalle.setSubtotal(1);
		
		categoria.setId_categoria(1);
		categoria.setCategoria("Infantil");
		categoria.setDescripcion("Libro de Don Quijotes");
		
		
		autor.setId_autor(1);
		autor.setNombre("Don");
		autor.setApellido("Quijote");
		autor.setCorreo("donquijote@email.com");
		autor.setDireccion("America y Sur");
		autor.setTelefono("0957878451");
		autor.setPais("Argentina");
		
		
		System.out.println(factura.toString());
		System.out.println(facturaDetalle.toString());
		System.out.println(libro.toString());
	
	
		context.close(); //Apagar bean  
		

		
			
		
		 
		
	}

}
