package entidad;

public class VisitaTerreno {

	private Integer idVisitaTerreno;
	private String rutCliente3;
	private String diaVisitaTerreno;
	private String horaVisitaTerreno;
	private String lugarVisita;
	private String comentarios;
	
	public VisitaTerreno() {
		super();
	}

	public VisitaTerreno(Integer idVisitaTerreno, String rutCliente3, String diaVisitaTerreno, String horaVisitaTerreno,
			String lugarVisita, String comentarios) {
		super();
		this.idVisitaTerreno = idVisitaTerreno;
		this.rutCliente3 = rutCliente3;
		this.diaVisitaTerreno = diaVisitaTerreno;
		this.horaVisitaTerreno = horaVisitaTerreno;
		this.lugarVisita = lugarVisita;
		this.comentarios = comentarios;
	}

	public Integer getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	public void setIdVisitaTerreno(Integer idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	public String getRutCliente3() {
		return rutCliente3;
	}

	public void setRutCliente3(String rutCliente3) {
		this.rutCliente3 = rutCliente3;
	}

	public String getDiaVisitaTerreno() {
		return diaVisitaTerreno;
	}

	public void setDiaVisitaTerreno(String diaVisitaTerreno) {
		this.diaVisitaTerreno = diaVisitaTerreno;
	}

	public String getHoraVisitaTerreno() {
		return horaVisitaTerreno;
	}

	public void setHoraVisitaTerreno(String horaVisitaTerreno) {
		this.horaVisitaTerreno = horaVisitaTerreno;
	}

	public String getLugarVisita() {
		return lugarVisita;
	}

	public void setLugarVisita(String lugarVisita) {
		this.lugarVisita = lugarVisita;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [idVisitaTerreno=" + idVisitaTerreno + ", rutCliente3=" + rutCliente3
				+ ", diaVisitaTerreno=" + diaVisitaTerreno + ", horaVisitaTerreno=" + horaVisitaTerreno
				+ ", lugarVisita=" + lugarVisita + ", comentarios=" + comentarios + "]";
	}
	
	
}
