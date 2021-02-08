package entidad;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

	    private List<Asesoria> lista; 
	    private List<Capacitacion> lista1;

	    public Contenedor() {
	        lista = new ArrayList<Asesoria>();
	        lista1 = new ArrayList<Capacitacion>();
	    }
   
	    public void almacenarCliente(Cliente cliente1) {
	    	lista.add(cliente1);
	   
	    }
	    /*public void almacenarProfesional(Asesoria profesional1) { "La clase
	     *  Asesoría llama a los atributos de la clase usuario, por lo que no 
	     *  es conveniente usar en este ejemplo"
	        lista.add(profesional1);
	    }*/
	    
	    public void almacenaProfesional(Profesional profesional1) {
	        lista.add(profesional1);
	    }
    
	    public void almacenaAdministrativo(Administrativo administrativo1) {
	        lista.add(administrativo1);
	    }
	    
	    public void almacenaCapacitacion(Capacitacion capacitacion1) {
	        lista.add(capacitacion1);
	    }
	    public void eliminarUsuario(Usuario usuario1) {
	        lista.remove(usuario1);
		}
	    public void listarUsuario() {
	        for(Asesoria u: lista) {
	        	System.out.println(u);
	        }
		}


}
	