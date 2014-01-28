package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UnidadesEspecializadas generated by hbm2java
 */
@Entity
@Table(name = "unidades_especializadas", catalog = "saude_rec")
public class UnidadesEspecializadas implements java.io.Serializable {

	private Integer idunidadesEspecializadas;
	private Integer rpa;
	private Integer microRegiao;
	private Integer cnes;
	private String nomeUnidade;
	private String endereco;
	private String nomeBairro;
	private String fone;
	private Double latitude;
	private Double longitude;

	public UnidadesEspecializadas() {
	}

	public UnidadesEspecializadas(Integer rpa, Integer microRegiao,
			Integer cnes, String nomeUnidade, String endereco,
			String nomeBairro, String fone, Double latitude, Double longitude) {
		this.rpa = rpa;
		this.microRegiao = microRegiao;
		this.cnes = cnes;
		this.nomeUnidade = nomeUnidade;
		this.endereco = endereco;
		this.nomeBairro = nomeBairro;
		this.fone = fone;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idunidades_especializadas", unique = true, nullable = false)
	public Integer getIdunidadesEspecializadas() {
		return this.idunidadesEspecializadas;
	}

	public void setIdunidadesEspecializadas(Integer idunidadesEspecializadas) {
		this.idunidadesEspecializadas = idunidadesEspecializadas;
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

	@Column(name = "nome_unidade", length = 150)
	public String getNomeUnidade() {
		return this.nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	@Column(name = "endereco", length = 150)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "nome_bairro", length = 150)
	public String getNomeBairro() {
		return this.nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	@Column(name = "fone", length = 45)
	public String getFone() {
		return this.fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
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
