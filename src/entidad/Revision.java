package entidad;

public class Revision {

	private Integer idRevision;
	private Integer idVisitaTerreno2;
	private String nombreRevision;
	private String detalleRevision;
	private Integer estado;
	
	public Revision() {
		super();
	}

	public Revision(Integer idRevision, Integer idVisitaTerreno2, String nombreRevision, String detalleRevision,
			Integer estado) {
		super();
		this.idRevision = idRevision;
		this.idVisitaTerreno2 = idVisitaTerreno2;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
	}

	public Integer getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(Integer idRevision) {
		this.idRevision = idRevision;
	}

	public Integer getIdVisitaTerreno2() {
		return idVisitaTerreno2;
	}

	public void setIdVisitaTerreno2(Integer idVisitaTerreno2) {
		this.idVisitaTerreno2 = idVisitaTerreno2;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisitaTerreno2=" + idVisitaTerreno2 + ", nombreRevision="
				+ nombreRevision + ", detalleRevision=" + detalleRevision + ", estado=" + estado + "]";
	}
	
	
	
	
}
