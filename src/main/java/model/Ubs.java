package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ubs generated by hbm2java
 */
@Entity
@Table(name = "ubs", catalog = "saude_rec")
public class Ubs implements java.io.Serializable {

	private Integer idubs;
	private Integer rpa;
	private Integer microRegiao;
	private Integer cnes;
	private String nomeUnidade;
	private String endereco;
	private String bairro;
	private String fone;
	private String especialidades;
	private Double latitude;
	private Double longitude;

	public Ubs() {
	}

	public Ubs(Integer rpa, Integer microRegiao, Integer cnes,
			String nomeUnidade, String endereco, String bairro, String fone,
			String especialidades, Double latitude, Double longitude) {
		this.rpa = rpa;
		this.microRegiao = microRegiao;
		this.cnes = cnes;
		this.nomeUnidade = nomeUnidade;
		this.endereco = endereco;
		this.bairro = bairro;
		this.fone = fone;
		this.especialidades = especialidades;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idubs", unique = true, nullable = false)
	public Integer getIdubs() {
		return this.idubs;
	}

	public void setIdubs(Integer idubs) {
		this.idubs = idubs;
	}

	@Column(name = "rpa")
	public Integer getRpa() {
		return this.rpa;
	}

	public void setRpa(Integer rpa) {
		this.rpa = rpa;
	}

	@Column(name = "micro_regiao")
	public Integer getMicroRegiao() {
		return this.microRegiao;
	}

	public void setMicroRegiao(Integer microRegiao) {
		this.microRegiao = microRegiao;
	}

	@Column(name = "cnes")
	public Integer getCnes() {
		return this.cnes;
	}

	public void setCnes(Integer cnes) {
		this.cnes = cnes;
	}

	@Column(name = "nome_unidade", length = 300)
	public String getNomeUnidade() {
		return this.nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	@Column(name = "endereco", length = 300)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "bairro", length = 300)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "fone", length = 45)
	public String getFone() {
		return this.fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	@Column(name = "especialidades", length = 300)
	public String getEspecialidades() {
		return this.especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	@Column(name = "latitude", precision = 22, scale = 0)
	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", precision = 22, scale = 0)
	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
