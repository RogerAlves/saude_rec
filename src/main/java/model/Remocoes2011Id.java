package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Remocoes2011Id generated by hbm2java
 */
@Embeddable
public class Remocoes2011Id implements java.io.Serializable {

	private Integer solicitacaoNumero;
	private Integer remocaoSequencial;
	private Integer hospitalCodigo;
	private String remocaoDatahora;
	private String remocaoAceitacao;

	public Remocoes2011Id() {
	}

	public Remocoes2011Id(Integer solicitacaoNumero, Integer remocaoSequencial,
			Integer hospitalCodigo, String remocaoDatahora,
			String remocaoAceitacao) {
		this.solicitacaoNumero = solicitacaoNumero;
		this.remocaoSequencial = remocaoSequencial;
		this.hospitalCodigo = hospitalCodigo;
		this.remocaoDatahora = remocaoDatahora;
		this.remocaoAceitacao = remocaoAceitacao;
	}

	@Column(name = "SOLICITACAO_NUMERO")
	public Integer getSolicitacaoNumero() {
		return this.solicitacaoNumero;
	}

	public void setSolicitacaoNumero(Integer solicitacaoNumero) {
		this.solicitacaoNumero = solicitacaoNumero;
	}

	@Column(name = "REMOCAO_SEQUENCIAL")
	public Integer getRemocaoSequencial() {
		return this.remocaoSequencial;
	}

	public void setRemocaoSequencial(Integer remocaoSequencial) {
		this.remocaoSequencial = remocaoSequencial;
	}

	@Column(name = "HOSPITAL_CODIGO")
	public Integer getHospitalCodigo() {
		return this.hospitalCodigo;
	}

	public void setHospitalCodigo(Integer hospitalCodigo) {
		this.hospitalCodigo = hospitalCodigo;
	}

	@Column(name = "REMOCAO_DATAHORA", length = 20)
	public String getRemocaoDatahora() {
		return this.remocaoDatahora;
	}

	public void setRemocaoDatahora(String remocaoDatahora) {
		this.remocaoDatahora = remocaoDatahora;
	}

	@Column(name = "REMOCAO_ACEITACAO", length = 3)
	public String getRemocaoAceitacao() {
		return this.remocaoAceitacao;
	}

	public void setRemocaoAceitacao(String remocaoAceitacao) {
		this.remocaoAceitacao = remocaoAceitacao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Remocoes2011Id))
			return false;
		Remocoes2011Id castOther = (Remocoes2011Id) other;

		return ((this.getSolicitacaoNumero() == castOther
				.getSolicitacaoNumero()) || (this.getSolicitacaoNumero() != null
				&& castOther.getSolicitacaoNumero() != null && this
				.getSolicitacaoNumero()
				.equals(castOther.getSolicitacaoNumero())))
				&& ((this.getRemocaoSequencial() == castOther
						.getRemocaoSequencial()) || (this
						.getRemocaoSequencial() != null
						&& castOther.getRemocaoSequencial() != null && this
						.getRemocaoSequencial().equals(
								castOther.getRemocaoSequencial())))
				&& ((this.getHospitalCodigo() == castOther.getHospitalCodigo()) || (this
						.getHospitalCodigo() != null
						&& castOther.getHospitalCodigo() != null && this
						.getHospitalCodigo().equals(
								castOther.getHospitalCodigo())))
				&& ((this.getRemocaoDatahora() == castOther
						.getRemocaoDatahora()) || (this.getRemocaoDatahora() != null
						&& castOther.getRemocaoDatahora() != null && this
						.getRemocaoDatahora().equals(
								castOther.getRemocaoDatahora())))
				&& ((this.getRemocaoAceitacao() == castOther
						.getRemocaoAceitacao()) || (this.getRemocaoAceitacao() != null
						&& castOther.getRemocaoAceitacao() != null && this
						.getRemocaoAceitacao().equals(
								castOther.getRemocaoAceitacao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSolicitacaoNumero() == null ? 0 : this
						.getSolicitacaoNumero().hashCode());
		result = 37
				* result
				+ (getRemocaoSequencial() == null ? 0 : this
						.getRemocaoSequencial().hashCode());
		result = 37
				* result
				+ (getHospitalCodigo() == null ? 0 : this.getHospitalCodigo()
						.hashCode());
		result = 37
				* result
				+ (getRemocaoDatahora() == null ? 0 : this.getRemocaoDatahora()
						.hashCode());
		result = 37
				* result
				+ (getRemocaoAceitacao() == null ? 0 : this
						.getRemocaoAceitacao().hashCode());
		return result;
	}

}
