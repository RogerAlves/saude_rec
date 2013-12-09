package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HospitaisId generated by hbm2java
 */
@Embeddable
public class HospitaisId implements java.io.Serializable {

	private String natureza;
	private Integer rpa;
	private Integer microRegiao;
	private Integer cnes;
	private String unidade;
	private String endereco;
	private String bairro;
	private String telefone;
	private String especialidades;
	private String latitude;
	private String longitude;

	public HospitaisId() {
	}

	public HospitaisId(String natureza, Integer rpa, Integer microRegiao,
			Integer cnes, String unidade, String endereco, String bairro,
			String telefone, String especialidades, String latitude,
			String longitude) {
		this.natureza = natureza;
		this.rpa = rpa;
		this.microRegiao = microRegiao;
		this.cnes = cnes;
		this.unidade = unidade;
		this.endereco = endereco;
		this.bairro = bairro;
		this.telefone = telefone;
		this.especialidades = especialidades;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Column(name = "NATUREZA", length = 80)
	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	@Column(name = "RPA")
	public Integer getRpa() {
		return this.rpa;
	}

	public void setRpa(Integer rpa) {
		this.rpa = rpa;
	}

	@Column(name = "MICRO_REGIAO")
	public Integer getMicroRegiao() {
		return this.microRegiao;
	}

	public void setMicroRegiao(Integer microRegiao) {
		this.microRegiao = microRegiao;
	}

	@Column(name = "CNES")
	public Integer getCnes() {
		return this.cnes;
	}

	public void setCnes(Integer cnes) {
		this.cnes = cnes;
	}

	@Column(name = "UNIDADE", length = 80)
	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Column(name = "ENDERECO", length = 80)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "BAIRRO", length = 80)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "TELEFONE", length = 80)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Column(name = "ESPECIALIDADES", length = 80)
	public String getEspecialidades() {
		return this.especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	@Column(name = "LATITUDE", length = 80)
	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "LONGITUDE", length = 80)
	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HospitaisId))
			return false;
		HospitaisId castOther = (HospitaisId) other;

		return ((this.getNatureza() == castOther.getNatureza()) || (this
				.getNatureza() != null && castOther.getNatureza() != null && this
				.getNatureza().equals(castOther.getNatureza())))
				&& ((this.getRpa() == castOther.getRpa()) || (this.getRpa() != null
						&& castOther.getRpa() != null && this.getRpa().equals(
						castOther.getRpa())))
				&& ((this.getMicroRegiao() == castOther.getMicroRegiao()) || (this
						.getMicroRegiao() != null
						&& castOther.getMicroRegiao() != null && this
						.getMicroRegiao().equals(castOther.getMicroRegiao())))
				&& ((this.getCnes() == castOther.getCnes()) || (this.getCnes() != null
						&& castOther.getCnes() != null && this.getCnes()
						.equals(castOther.getCnes())))
				&& ((this.getUnidade() == castOther.getUnidade()) || (this
						.getUnidade() != null && castOther.getUnidade() != null && this
						.getUnidade().equals(castOther.getUnidade())))
				&& ((this.getEndereco() == castOther.getEndereco()) || (this
						.getEndereco() != null
						&& castOther.getEndereco() != null && this
						.getEndereco().equals(castOther.getEndereco())))
				&& ((this.getBairro() == castOther.getBairro()) || (this
						.getBairro() != null && castOther.getBairro() != null && this
						.getBairro().equals(castOther.getBairro())))
				&& ((this.getTelefone() == castOther.getTelefone()) || (this
						.getTelefone() != null
						&& castOther.getTelefone() != null && this
						.getTelefone().equals(castOther.getTelefone())))
				&& ((this.getEspecialidades() == castOther.getEspecialidades()) || (this
						.getEspecialidades() != null
						&& castOther.getEspecialidades() != null && this
						.getEspecialidades().equals(
								castOther.getEspecialidades())))
				&& ((this.getLatitude() == castOther.getLatitude()) || (this
						.getLatitude() != null
						&& castOther.getLatitude() != null && this
						.getLatitude().equals(castOther.getLatitude())))
				&& ((this.getLongitude() == castOther.getLongitude()) || (this
						.getLongitude() != null
						&& castOther.getLongitude() != null && this
						.getLongitude().equals(castOther.getLongitude())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNatureza() == null ? 0 : this.getNatureza().hashCode());
		result = 37 * result
				+ (getRpa() == null ? 0 : this.getRpa().hashCode());
		result = 37
				* result
				+ (getMicroRegiao() == null ? 0 : this.getMicroRegiao()
						.hashCode());
		result = 37 * result
				+ (getCnes() == null ? 0 : this.getCnes().hashCode());
		result = 37 * result
				+ (getUnidade() == null ? 0 : this.getUnidade().hashCode());
		result = 37 * result
				+ (getEndereco() == null ? 0 : this.getEndereco().hashCode());
		result = 37 * result
				+ (getBairro() == null ? 0 : this.getBairro().hashCode());
		result = 37 * result
				+ (getTelefone() == null ? 0 : this.getTelefone().hashCode());
		result = 37
				* result
				+ (getEspecialidades() == null ? 0 : this.getEspecialidades()
						.hashCode());
		result = 37 * result
				+ (getLatitude() == null ? 0 : this.getLatitude().hashCode());
		result = 37 * result
				+ (getLongitude() == null ? 0 : this.getLongitude().hashCode());
		return result;
	}

}
