package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {
	
	public static void main(String [] args) {
		
		//CONECTAMOS CON NUESTRO APPLICATION CONTEXT
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//INSTANCIAR               //En anotaciones es el nombre de la clase pero primero con minuscula
		Cliente cliente = context.getBean("cliente",Cliente.class);
		Libro libro = context.getBean("libro",Libro.class);		     //CODIGO ACOPLADO
		Factura factura = context.getBean("factura",Factura.class);	
		DetalleFactura facturaDetalle = context.getBean("detalleFactura",DetalleFactura.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Autor autor = context.getBean("autor",Autor.class);
		

		
		cliente.setId_Cliente(1);
		cliente.setNombre("Paul");
		cliente.setApellido("Apellido");
		cliente.setCedula("1755414727");
		cliente.setCorreo("jassonl@gmail");
		cliente.setDireccion("Tumbaco");
		cliente.setTelefono("098784858");
		cliente.setEdad(19);
		cliente.setFecha_Nac(new Date());
		
		libro.setId_Libro(1);
		libro.setTitulo("Don Quijotes");
		libro.setEditorial("Editorial");
		libro.setNum_Paginas(1);
		libro.setEdicion("Edicion");
		libro.setIdioma("Español");
		libro.setFecha_publicacion(new Date());
		libro.setDescripcion("Libro original don quijote");
		libro.setTipo_Pasta("Empastado");
		libro.setIsbn("02030");
		libro.setNum_Ejemplares(100);
		libro.setPortada("Portada");
		libro.setPresentacion("Presentacion");
		libro.setPrecio(50);
		
		factura.setId_Factura(1);
		factura.setFecha(0);
		factura.setIva(0);
		factura.setTotal(0);
		factura.setTotal_Neto(0);
		
		facturaDetalle.setId_DetalleFactura(1);
		facturaDetalle.setCantidad(1);
		facturaDetalle.setSubtotal(1);
		
		categoria.setId_Categoria(1);
		categoria.setCategoria("Infantil");
		categoria.setDescripcion("Libro de Don Quijotes");
		
		
		autor.setId_Autor(1);
		autor.setNombre("Don");
		autor.setApellido("Quijote");
		autor.setCorreo("donquijote@email.com");
		autor.setDireccion("America y Sur");
		autor.setTelefono("0957878451");
		autor.setPais("Argentina");
		
		
		System.out.println(factura.toString());
		System.out.println(facturaDetalle.toString());
		System.out.println(libro.toString());
	
		
		context.close(); //APAGAR bean  
		
		
		
		
	}

}
