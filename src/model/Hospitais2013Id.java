package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Hospitais2013Id generated by hbm2java
 */
@Embeddable
public class Hospitais2013Id implements java.io.Serializable {

	private Integer hospitalCodigo;
	private String hospitalNome;
	private Integer bairrosaudeCodigo;

	public Hospitais2013Id() {
	}

	public Hospitais2013Id(Integer hospitalCodigo, String hospitalNome,
			Integer bairrosaudeCodigo) {
		this.hospitalCodigo = hospitalCodigo;
		this.hospitalNome = hospitalNome;
		this.bairrosaudeCodigo = bairrosaudeCodigo;
	}

	@Column(name = "HOSPITAL_CODIGO")
	public Integer getHospitalCodigo() {
		return this.hospitalCodigo;
	}

	public void setHospitalCodigo(Integer hospitalCodigo) {
		this.hospitalCodigo = hospitalCodigo;
	}

	@Column(name = "HOSPITAL_NOME", length = 50)
	public String getHospitalNome() {
		return this.hospitalNome;
	}

	public void setHospitalNome(String hospitalNome) {
		this.hospitalNome = hospitalNome;
	}

	@Column(name = "BAIRROSAUDE_CODIGO")
	public Integer getBairrosaudeCodigo() {
		return this.bairrosaudeCodigo;
	}

	public void setBairrosaudeCodigo(Integer bairrosaudeCodigo) {
		this.bairrosaudeCodigo = bairrosaudeCodigo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Hospitais2013Id))
			return false;
		Hospitais2013Id castOther = (Hospitais2013Id) other;

		return ((this.getHospitalCodigo() == castOther.getHospitalCodigo()) || (this
				.getHospitalCodigo() != null
				&& castOther.getHospitalCodigo() != null && this
				.getHospitalCodigo().equals(castOther.getHospitalCodigo())))
				&& ((this.getHospitalNome() == castOther.getHospitalNome()) || (this
						.getHospitalNome() != null
						&& castOther.getHospitalNome() != null && this
						.getHospitalNome().equals(castOther.getHospitalNome())))
				&& ((this.getBairrosaudeCodigo() == castOther
						.getBairrosaudeCodigo()) || (this
						.getBairrosaudeCodigo() != null
						&& castOther.getBairrosaudeCodigo() != null && this
						.getBairrosaudeCodigo().equals(
								castOther.getBairrosaudeCodigo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHospitalCodigo() == null ? 0 : this.getHospitalCodigo()
						.hashCode());
		result = 37
				* result
				+ (getHospitalNome() == null ? 0 : this.getHospitalNome()
						.hashCode());
		result = 37
				* result
				+ (getBairrosaudeCodigo() == null ? 0 : this
						.getBairrosaudeCodigo().hashCode());
		return result;
	}

}
