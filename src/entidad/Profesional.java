package entidad;

public class Profesional extends Usuario{
	
	private String titulo;
	private String fechaIngreso;

	
	public Profesional() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profesional(String nombre, String fechaNacimiento, Integer run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
	
	@Override
	public String toString() {
		return "Profesional [Nombre=" + getNombre() + ", FechaNacimiento()=" + getFechaNacimiento()
				+ ", Run=" + getRun() + ", titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	@Override
    public void analizarUsuario() {
		System.out.println("El profesional se llama " + getNombre()+ ", su fecha de nacimientos es "+ getFechaNacimiento()
		+", su run es "+getRun() +", su titulo es de " + getTitulo()+" e ingreso el dia " +getFechaIngreso()+".");

    }
	

}
