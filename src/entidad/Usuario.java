package entidad;

public class Usuario implements Asesoria{

	private String nombre;
	private String fechaNacimiento;
	private Integer run;
	
	
	
	public Usuario() {
		super();
	}



	public Usuario(String nombre, String fechaNacimiento, Integer run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public Integer getRun() {
		return run;
	}



	public void setRun(Integer run) {
		this.run = run;
	}

	
	public void mostrarEdad() {
		Integer annoNacimiento=Integer.parseInt(fechaNacimiento.substring(fechaNacimiento.length()-4));
		Integer edad=2021-annoNacimiento;
		System.out.println("El usuario tiene "+ edad);


	}
	
	
    @Override
    public void analizarUsuario() {
        System.out.println(getNombre());

    }
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + "]";
	}
	




	
	}
	
	
	
