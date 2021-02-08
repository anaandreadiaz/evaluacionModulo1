package entidad;

public class Administrativo extends Usuario{
	
	private String area;
	private String experiencia;
	
	
	public Administrativo() {
		super();

	}
	public Administrativo(String nombre, String fechaNacimiento, Integer run, String area, String experiencia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experiencia = experiencia;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	
	@Override
    public void analizarUsuario() {
        System.out.println("El administrativo se llama " + getNombre()+ ", su fecha de nacimientos es "+ getFechaNacimiento()+
        		", su run es "+getRun() +", trabaja en el area de " + area+" y tiene " +experiencia+" años de experiencia.");

    }
	
	
	
}
