package entidad;

public class Accidente {

	
	private Integer idAccidente;
	private String rutCliente2;
	private String diaAccidente;
	private String horaAccidente;
	private String lugarAccidente;
	private String origen;
	private String consecuencias;
	
	public Accidente() {
		super();
	}

	public Accidente(Integer idAccidente, String rutCliente2, String diaAccidente, String horaAccidente,
			String lugarAccidente, String origen, String consecuencias) {
		super();
		this.idAccidente = idAccidente;
		this.rutCliente2 = rutCliente2;
		this.diaAccidente = diaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugarAccidente = lugarAccidente;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public Integer getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(Integer idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getRutCliente2() {
		return rutCliente2;
	}

	public void setRutCliente2(String rutCliente2) {
		this.rutCliente2 = rutCliente2;
	}

	public String getDiaAccidente() {
		return diaAccidente;
	}

	public void setDiaAccidente(String diaAccidente) {
		this.diaAccidente = diaAccidente;
	}

	public String getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugarAccidente() {
		return lugarAccidente;
	}

	public void setLugarAccidente(String lugarAccidente) {
		this.lugarAccidente = lugarAccidente;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [idAccidente=" + idAccidente + ", rutCliente2=" + rutCliente2 + ", diaAccidente="
				+ diaAccidente + ", horaAccidente=" + horaAccidente + ", lugarAccidente=" + lugarAccidente + ", origen="
				+ origen + ", consecuencias=" + consecuencias + "]";
	}
	
	
	

}
