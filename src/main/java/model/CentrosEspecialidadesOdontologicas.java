package model;

// Generated 11/12/2013 01:39:05 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CentrosEspecialidadesOdontologicas generated by hbm2java
 */
@Entity
@Table(name = "centros_especialidades_odontologicas", catalog = "saude_rec")
public class CentrosEspecialidadesOdontologicas implements java.io.Serializable {

	private Integer idCeo;
	private Integer rpa;
	private Integer microRegiao;
	private Integer cnes;
	private String nomeCentro;
	private String endereco;
	private String nomeBairro;
	private String especialidade;
	private String fone;
	private Double latitude;
	private Double longitude;

	public CentrosEspecialidadesOdontologicas() {
	}

	public CentrosEspecialidadesOdontologicas(Integer rpa, Integer microRegiao,
			Integer cnes, String nomeCentro, String endereco,
			String nomeBairro, String especialidade, String fone,
			Double latitude, Double longitude) {
		this.rpa = rpa;
		this.microRegiao = microRegiao;
		this.cnes = cnes;
		this.nomeCentro = nomeCentro;
		this.endereco = endereco;
		this.nomeBairro = nomeBairro;
		this.especialidade = especialidade;
		this.fone = fone;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_ceo", unique = true, nullable = false)
	public Integer getIdCeo() {
		return this.idCeo;
	}

	public void setIdCeo(Integer idCeo) {
		this.idCeo = idCeo;
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

	@Column(name = "nome_centro")
	public String getNomeCentro() {
		return this.nomeCentro;
	}

	public void setNomeCentro(String nomeCentro) {
		this.nomeCentro = nomeCentro;
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

	@Column(name = "especialidade")
	public String getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Column(name = "fone")
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
