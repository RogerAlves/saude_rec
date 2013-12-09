package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Distritos2012Id generated by hbm2java
 */
@Embeddable
public class Distritos2012Id implements java.io.Serializable {

	private Integer distritosanitarioCodigo;
	private String distritosanitarioDescricao;
	private Integer municipioCodigo;
	private String municipioDescricao;
	private Integer regiao;

	public Distritos2012Id() {
	}

	public Distritos2012Id(Integer distritosanitarioCodigo,
			String distritosanitarioDescricao, Integer municipioCodigo,
			String municipioDescricao, Integer regiao) {
		this.distritosanitarioCodigo = distritosanitarioCodigo;
		this.distritosanitarioDescricao = distritosanitarioDescricao;
		this.municipioCodigo = municipioCodigo;
		this.municipioDescricao = municipioDescricao;
		this.regiao = regiao;
	}

	@Column(name = "DISTRITOSANITARIO_CODIGO")
	public Integer getDistritosanitarioCodigo() {
		return this.distritosanitarioCodigo;
	}

	public void setDistritosanitarioCodigo(Integer distritosanitarioCodigo) {
		this.distritosanitarioCodigo = distritosanitarioCodigo;
	}

	@Column(name = "DISTRITOSANITARIO_DESCRICAO", length = 30)
	public String getDistritosanitarioDescricao() {
		return this.distritosanitarioDescricao;
	}

	public void setDistritosanitarioDescricao(String distritosanitarioDescricao) {
		this.distritosanitarioDescricao = distritosanitarioDescricao;
	}

	@Column(name = "MUNICIPIO_CODIGO")
	public Integer getMunicipioCodigo() {
		return this.municipioCodigo;
	}

	public void setMunicipioCodigo(Integer municipioCodigo) {
		this.municipioCodigo = municipioCodigo;
	}

	@Column(name = "MUNICIPIO_DESCRICAO", length = 25)
	public String getMunicipioDescricao() {
		return this.municipioDescricao;
	}

	public void setMunicipioDescricao(String municipioDescricao) {
		this.municipioDescricao = municipioDescricao;
	}

	@Column(name = "REGIAO")
	public Integer getRegiao() {
		return this.regiao;
	}

	public void setRegiao(Integer regiao) {
		this.regiao = regiao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Distritos2012Id))
			return false;
		Distritos2012Id castOther = (Distritos2012Id) other;

		return ((this.getDistritosanitarioCodigo() == castOther
				.getDistritosanitarioCodigo()) || (this
				.getDistritosanitarioCodigo() != null
				&& castOther.getDistritosanitarioCodigo() != null && this
				.getDistritosanitarioCodigo().equals(
						castOther.getDistritosanitarioCodigo())))
				&& ((this.getDistritosanitarioDescricao() == castOther
						.getDistritosanitarioDescricao()) || (this
						.getDistritosanitarioDescricao() != null
						&& castOther.getDistritosanitarioDescricao() != null && this
						.getDistritosanitarioDescricao().equals(
								castOther.getDistritosanitarioDescricao())))
				&& ((this.getMunicipioCodigo() == castOther
						.getMunicipioCodigo()) || (this.getMunicipioCodigo() != null
						&& castOther.getMunicipioCodigo() != null && this
						.getMunicipioCodigo().equals(
								castOther.getMunicipioCodigo())))
				&& ((this.getMunicipioDescricao() == castOther
						.getMunicipioDescricao()) || (this
						.getMunicipioDescricao() != null
						&& castOther.getMunicipioDescricao() != null && this
						.getMunicipioDescricao().equals(
								castOther.getMunicipioDescricao())))
				&& ((this.getRegiao() == castOther.getRegiao()) || (this
						.getRegiao() != null && castOther.getRegiao() != null && this
						.getRegiao().equals(castOther.getRegiao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDistritosanitarioCodigo() == null ? 0 : this
						.getDistritosanitarioCodigo().hashCode());
		result = 37
				* result
				+ (getDistritosanitarioDescricao() == null ? 0 : this
						.getDistritosanitarioDescricao().hashCode());
		result = 37
				* result
				+ (getMunicipioCodigo() == null ? 0 : this.getMunicipioCodigo()
						.hashCode());
		result = 37
				* result
				+ (getMunicipioDescricao() == null ? 0 : this
						.getMunicipioDescricao().hashCode());
		result = 37 * result
				+ (getRegiao() == null ? 0 : this.getRegiao().hashCode());
		return result;
	}

}
