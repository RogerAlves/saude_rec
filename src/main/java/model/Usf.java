package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usf generated by hbm2java
 */
@Entity
@Table(name = "usf", catalog = "saude_rec")
public class Usf implements java.io.Serializable {

	private Integer idusf;
	private Integer rpa;
	private Integer microRegiao;
	private Integer cnes;
	private String nomeUnidade;
	private String endereco;
	private String nomeBairro;
	private String fone;
	private Integer equipesSaudeFamilia;
	private Integer equipesSaudeBucal;
	private Double latitude;
	private Double longitude;

	public Usf() {
	}

	public Usf(Integer rpa, Integer microRegiao, Integer cnes,
			String nomeUnidade, String endereco, String nomeBairro,
			String fone, Integer equipesSaudeFamilia,
			Integer equipesSaudeBucal, Double latitude, Double longitude) {
		this.rpa = rpa;
		this.microRegiao = microRegiao;
		this.cnes = cnes;
		this.nomeUnidade = nomeUnidade;
		this.endereco = endereco;
		this.nomeBairro = nomeBairro;
		this.fone = fone;
		this.equipesSaudeFamilia = equipesSaudeFamilia;
		this.equipesSaudeBucal = equipesSaudeBucal;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idusf", unique = true, nullable = false)
	public Integer getIdusf() {
		return this.idusf;
	}

	public void setIdusf(Integer idusf) {
		this.idusf = idusf;
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

	@Column(name = "nome_unidade")
	public String getNomeUnidade() {
		return this.nomeUnidade;
	}

	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}

	@Column(name = "endereco")
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "nome_bairro")
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

	@Column(name = "equipes_saude_familia")
	public Integer getEquipesSaudeFamilia() {
		return this.equipesSaudeFamilia;
	}

	public void setEquipesSaudeFamilia(Integer equipesSaudeFamilia) {
		this.equipesSaudeFamilia = equipesSaudeFamilia;
	}

	@Column(name = "equipes_saude_bucal")
	public Integer getEquipesSaudeBucal() {
		return this.equipesSaudeBucal;
	}

	public void setEquipesSaudeBucal(Integer equipesSaudeBucal) {
		this.equipesSaudeBucal = equipesSaudeBucal;
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
