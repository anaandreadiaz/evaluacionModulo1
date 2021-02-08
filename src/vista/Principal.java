package vista;

import java.util.ArrayList;
import java.util.List;

import entidad.Administrativo;
import entidad.Asesoria;
import entidad.Capacitacion;
import entidad.Cliente;
import entidad.Contenedor;
import entidad.Profesional;
import entidad.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		Contenedor lista = new Contenedor();
		
		Usuario usuario1=new Usuario("Ana", "24021988", 12345678);
		usuario1.mostrarEdad();
		
		Cliente cliente1=new Cliente("Cristian", "23091989", 98765432, 98765432, "Cristian Alejandro", "Guerrero Rozas","7777777" , "Cuprum", 2, "Stgo", "Centro", 32);
		System.out.println("El nombre del cliente es "+ cliente1.obtenerNombre());
		System.out.println("El sistema de salud del cliente es "+ cliente1.obtenerSistemaSalud());
		lista.almacenarCliente(cliente1);
		cliente1.analizarUsuario();
	
		Profesional profesional1=new Profesional("Ana", "24021988", 12345678, "Ingeniera", "30 de Julio del 2011");
		profesional1.analizarUsuario();
		lista.almacenaProfesional(profesional1);
		
		Administrativo administrativo1=new Administrativo("Ana", "24021988", 12345678, "Finanzas", "5");
		administrativo1.analizarUsuario();
		
		Capacitacion capacitacion1=new Capacitacion(123,"123456","lunes","9:00","Providencia","40",4);
		capacitacion1.mostrarDetalle();
		
		System.out.println("");
		System.out.println("Listado de Usuarios");
		lista.listarUsuario();
	}
	

}
	