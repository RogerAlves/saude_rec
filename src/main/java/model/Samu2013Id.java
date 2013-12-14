package model;

// Generated 14/12/2013 01:12:12 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Samu2013Id generated by hbm2java
 */
@Embeddable
public class Samu2013Id implements java.io.Serializable {

	private Integer solicitacaoNumero;
	private String solicitacaoData;
	private Integer bairrosaudeCodigo;
	private Integer origemchamadoCodigo;
	private String origemchamadoDescricao;
	private Integer situacaosolicitacaoCodigo;
	private String situacaosolicitacaoDescricao;

	public Samu2013Id() {
	}

	public Samu2013Id(Integer solicitacaoNumero, String solicitacaoData,
			Integer bairrosaudeCodigo, Integer origemchamadoCodigo,
			String origemchamadoDescricao, Integer situacaosolicitacaoCodigo,
			String situacaosolicitacaoDescricao) {
		this.solicitacaoNumero = solicitacaoNumero;
		this.solicitacaoData = solicitacaoData;
		this.bairrosaudeCodigo = bairrosaudeCodigo;
		this.origemchamadoCodigo = origemchamadoCodigo;
		this.origemchamadoDescricao = origemchamadoDescricao;
		this.situacaosolicitacaoCodigo = situacaosolicitacaoCodigo;
		this.situacaosolicitacaoDescricao = situacaosolicitacaoDescricao;
	}

	@Column(name = "SOLICITACAO_NUMERO")
	public Integer getSolicitacaoNumero() {
		return this.solicitacaoNumero;
	}

	public void setSolicitacaoNumero(Integer solicitacaoNumero) {
		this.solicitacaoNumero = solicitacaoNumero;
	}

	@Column(name = "SOLICITACAO_DATA", length = 10)
	public String getSolicitacaoData() {
		return this.solicitacaoData;
	}

	public void setSolicitacaoData(String solicitacaoData) {
		this.solicitacaoData = solicitacaoData;
	}

	@Column(name = "BAIRROSAUDE_CODIGO")
	public Integer getBairrosaudeCodigo() {
		return this.bairrosaudeCodigo;
	}

	public void setBairrosaudeCodigo(Integer bairrosaudeCodigo) {
		this.bairrosaudeCodigo = bairrosaudeCodigo;
	}

	@Column(name = "ORIGEMCHAMADO_CODIGO")
	public Integer getOrigemchamadoCodigo() {
		return this.origemchamadoCodigo;
	}

	public void setOrigemchamadoCodigo(Integer origemchamadoCodigo) {
		this.origemchamadoCodigo = origemchamadoCodigo;
	}

	@Column(name = "ORIGEMCHAMADO_DESCRICAO", length = 16)
	public String getOrigemchamadoDescricao() {
		return this.origemchamadoDescricao;
	}

	public void setOrigemchamadoDescricao(String origemchamadoDescricao) {
		this.origemchamadoDescricao = origemchamadoDescricao;
	}

	@Column(name = "SITUACAOSOLICITACAO_CODIGO")
	public Integer getSituacaosolicitacaoCodigo() {
		return this.situacaosolicitacaoCodigo;
	}

	public void setSituacaosolicitacaoCodigo(Integer situacaosolicitacaoCodigo) {
		this.situacaosolicitacaoCodigo = situacaosolicitacaoCodigo;
	}

	@Column(name = "SITUACAOSOLICITACAO_DESCRICAO", length = 22)
	public String getSituacaosolicitacaoDescricao() {
		return this.situacaosolicitacaoDescricao;
	}

	public void setSituacaosolicitacaoDescricao(
			String situacaosolicitacaoDescricao) {
		this.situacaosolicitacaoDescricao = situacaosolicitacaoDescricao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Samu2013Id))
			return false;
		Samu2013Id castOther = (Samu2013Id) other;

		return ((this.getSolicitacaoNumero() == castOther
				.getSolicitacaoNumero()) || (this.getSolicitacaoNumero() != null
				&& castOther.getSolicitacaoNumero() != null && this
				.getSolicitacaoNumero()
				.equals(castOther.getSolicitacaoNumero())))
				&& ((this.getSolicitacaoData() == castOther
						.getSolicitacaoData()) || (this.getSolicitacaoData() != null
						&& castOther.getSolicitacaoData() != null && this
						.getSolicitacaoData().equals(
								castOther.getSolicitacaoData())))
				&& ((this.getBairrosaudeCodigo() == castOther
						.getBairrosaudeCodigo()) || (this
						.getBairrosaudeCodigo() != null
						&& castOther.getBairrosaudeCodigo() != null && this
						.getBairrosaudeCodigo().equals(
								castOther.getBairrosaudeCodigo())))
				&& ((this.getOrigemchamadoCodigo() == castOther
						.getOrigemchamadoCodigo()) || (this
						.getOrigemchamadoCodigo() != null
						&& castOther.getOrigemchamadoCodigo() != null && this
						.getOrigemchamadoCodigo().equals(
								castOther.getOrigemchamadoCodigo())))
				&& ((this.getOrigemchamadoDescricao() == castOther
						.getOrigemchamadoDescricao()) || (this
						.getOrigemchamadoDescricao() != null
						&& castOther.getOrigemchamadoDescricao() != null && this
						.getOrigemchamadoDescricao().equals(
								castOther.getOrigemchamadoDescricao())))
				&& ((this.getSituacaosolicitacaoCodigo() == castOther
						.getSituacaosolicitacaoCodigo()) || (this
						.getSituacaosolicitacaoCodigo() != null
						&& castOther.getSituacaosolicitacaoCodigo() != null && this
						.getSituacaosolicitacaoCodigo().equals(
								castOther.getSituacaosolicitacaoCodigo())))
				&& ((this.getSituacaosolicitacaoDescricao() == castOther
						.getSituacaosolicitacaoDescricao()) || (this
						.getSituacaosolicitacaoDescricao() != null
						&& castOther.getSituacaosolicitacaoDescricao() != null && this
						.getSituacaosolicitacaoDescricao().equals(
								castOther.getSituacaosolicitacaoDescricao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSolicitacaoNumero() == null ? 0 : this
						.getSolicitacaoNumero().hashCode());
		result = 37
				* result
				+ (getSolicitacaoData() == null ? 0 : this.getSolicitacaoData()
						.hashCode());
		result = 37
				* result
				+ (getBairrosaudeCodigo() == null ? 0 : this
						.getBairrosaudeCodigo().hashCode());
		result = 37
				* result
				+ (getOrigemchamadoCodigo() == null ? 0 : this
						.getOrigemchamadoCodigo().hashCode());
		result = 37
				* result
				+ (getOrigemchamadoDescricao() == null ? 0 : this
						.getOrigemchamadoDescricao().hashCode());
		result = 37
				* result
				+ (getSituacaosolicitacaoCodigo() == null ? 0 : this
						.getSituacaosolicitacaoCodigo().hashCode());
		result = 37
				* result
				+ (getSituacaosolicitacaoDescricao() == null ? 0 : this
						.getSituacaosolicitacaoDescricao().hashCode());
		return result;
	}

}