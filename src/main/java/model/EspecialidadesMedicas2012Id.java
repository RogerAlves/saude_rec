package model;

// Generated 14/12/2013 14:42:03 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EspecialidadesMedicas2012Id generated by hbm2java
 */
@Embeddable
public class EspecialidadesMedicas2012Id implements java.io.Serializable {

	private Integer hospitalCodigo;
	private Integer especialidadeCodigo;
	private String especialidadeDescricao;

	public EspecialidadesMedicas2012Id() {
	}

	public EspecialidadesMedicas2012Id(Integer hospitalCodigo,
			Integer especialidadeCodigo, String especialidadeDescricao) {
		this.hospitalCodigo = hospitalCodigo;
		this.especialidadeCodigo = especialidadeCodigo;
		this.especialidadeDescricao = especialidadeDescricao;
	}

	@Column(name = "HOSPITAL_CODIGO")
	public Integer getHospitalCodigo() {
		return this.hospitalCodigo;
	}

	public void setHospitalCodigo(Integer hospitalCodigo) {
		this.hospitalCodigo = hospitalCodigo;
	}

	@Column(name = "ESPECIALIDADE_CODIGO")
	public Integer getEspecialidadeCodigo() {
		return this.especialidadeCodigo;
	}

	public void setEspecialidadeCodigo(Integer especialidadeCodigo) {
		this.especialidadeCodigo = especialidadeCodigo;
	}

	@Column(name = "ESPECIALIDADE_DESCRICAO", length = 20)
	public String getEspecialidadeDescricao() {
		return this.especialidadeDescricao;
	}

	public void setEspecialidadeDescricao(String especialidadeDescricao) {
		this.especialidadeDescricao = especialidadeDescricao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EspecialidadesMedicas2012Id))
			return false;
		EspecialidadesMedicas2012Id castOther = (EspecialidadesMedicas2012Id) other;

		return ((this.getHospitalCodigo() == castOther.getHospitalCodigo()) || (this
				.getHospitalCodigo() != null
				&& castOther.getHospitalCodigo() != null && this
				.getHospitalCodigo().equals(castOther.getHospitalCodigo())))
				&& ((this.getEspecialidadeCodigo() == castOther
						.getEspecialidadeCodigo()) || (this
						.getEspecialidadeCodigo() != null
						&& castOther.getEspecialidadeCodigo() != null && this
						.getEspecialidadeCodigo().equals(
								castOther.getEspecialidadeCodigo())))
				&& ((this.getEspecialidadeDescricao() == castOther
						.getEspecialidadeDescricao()) || (this
						.getEspecialidadeDescricao() != null
						&& castOther.getEspecialidadeDescricao() != null && this
						.getEspecialidadeDescricao().equals(
								castOther.getEspecialidadeDescricao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHospitalCodigo() == null ? 0 : this.getHospitalCodigo()
						.hashCode());
		result = 37
				* result
				+ (getEspecialidadeCodigo() == null ? 0 : this
						.getEspecialidadeCodigo().hashCode());
		result = 37
				* result
				+ (getEspecialidadeDescricao() == null ? 0 : this
						.getEspecialidadeDescricao().hashCode());
		return result;
	}

}
