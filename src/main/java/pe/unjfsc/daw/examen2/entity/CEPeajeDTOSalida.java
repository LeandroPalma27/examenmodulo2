package pe.unjfsc.daw.examen2.entity;

public class CEPeajeDTOSalida {

	private Integer id;
	private String empresa;
	private Long uc;
	private String direccion;
	private String ubicacion;
	private String fechaPeaje;
	private String horaPeaje;
	private String tipoComprobante;
	private String numeroComprobante;
	private String categoria;
	private Double importe;
	private Double totalMasIGV;
	private Double igv;
	@Override
	public String toString() {
		return "CEPeajeDTOSalida [id=" + id + ", empresa=" + empresa + ", uc=" + uc + ", direccion=" + direccion
				+ ", ubicacion=" + ubicacion + ", fechaPeaje=" + fechaPeaje + ", horaPeaje=" + horaPeaje
				+ ", tipoComprobante=" + tipoComprobante + ", numeroComprobante=" + numeroComprobante + ", categoria="
				+ categoria + ", importe=" + importe + ", totalMasIGV=" + totalMasIGV + ", igv=" + igv + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Long getUc() {
		return uc;
	}
	public void setUc(Long uc) {
		this.uc = uc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getFechaPeaje() {
		return fechaPeaje;
	}
	public void setFechaPeaje(String fechaPeaje) {
		this.fechaPeaje = fechaPeaje;
	}
	public String getHoraPeaje() {
		return horaPeaje;
	}
	public void setHoraPeaje(String horaPeaje) {
		this.horaPeaje = horaPeaje;
	}
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	public String getNumeroComprobante() {
		return numeroComprobante;
	}
	public void setNumeroComprobante(String numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Double getTotalMasIGV() {
		return totalMasIGV;
	}
	public void setTotalMasIGV(Double totalMasIGV) {
		this.totalMasIGV = totalMasIGV;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	
	
	
}
