package model;

// Generated 14/12/2013 14:42:03 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AcademiasDaCidade generated by hbm2java
 */
@Entity
@Table(name = "academias_da_cidade", catalog = "saude_rec")
public class AcademiasDaCidade implements java.io.Serializable {

	private Integer idacademiasDaCidade;
	private Integer rpa;
	private Integer microRegiao;
	private Integer codigoDistritoSanitario;
	private String nome;
	private String endereco;
	private String nomeBairro;
	private String fone;
	private Double latitude;
	private Double longitude;
	private String horarioDeAulas;

	public AcademiasDaCidade() {
	}

	public AcademiasDaCidade(Integer rpa, Integer microRegiao,
			Integer codigoDistritoSanitario, String nome, String endereco,
			String nomeBairro, String fone, Double latitude, Double longitude,
			String horarioDeAulas) {
		this.rpa = rpa;
		this.microRegiao = microRegiao;
		this.codigoDistritoSanitario = codigoDistritoSanitario;
		this.nome = nome;
		this.endereco = endereco;
		this.nomeBairro = nomeBairro;
		this.fone = fone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.horarioDeAulas = horarioDeAulas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idacademias_da_cidade", unique = true, nullable = false)
	public Integer getIdacademiasDaCidade() {
		return this.idacademiasDaCidade;
	}

	public void setIdacademiasDaCidade(Integer idacademiasDaCidade) {
		this.idacademiasDaCidade = idacademiasDaCidade;
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

	@Column(name = "codigo_distrito_sanitario")
	public Integer getCodigoDistritoSanitario() {
		return this.codigoDistritoSanitario;
	}

	public void setCodigoDistritoSanitario(Integer codigoDistritoSanitario) {
		this.codigoDistritoSanitario = codigoDistritoSanitario;
	}

	@Column(name = "nome")
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Column(name = "horario_de_aulas", length = 45)
	public String getHorarioDeAulas() {
		return this.horarioDeAulas;
	}

	public void setHorarioDeAulas(String horarioDeAulas) {
		this.horarioDeAulas = horarioDeAulas;
	}

}
