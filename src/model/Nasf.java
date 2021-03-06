package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Nasf generated by hbm2java
 */
@Entity
@Table(name = "nasf", catalog = "saude_rec")
public class Nasf implements java.io.Serializable {

	private Integer idnasf;
	private Integer codigoDistritoSanitario;
	private Integer cnes;
	private String equipe;
	private String pontoDeApoio;
	private String nomeNucleo;
	private String area;
	private String telefone;

	public Nasf() {
	}

	public Nasf(Integer codigoDistritoSanitario, Integer cnes, String equipe,
			String pontoDeApoio, String nomeNucleo, String area, String telefone) {
		this.codigoDistritoSanitario = codigoDistritoSanitario;
		this.cnes = cnes;
		this.equipe = equipe;
		this.pontoDeApoio = pontoDeApoio;
		this.nomeNucleo = nomeNucleo;
		this.area = area;
		this.telefone = telefone;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idnasf", unique = true, nullable = false)
	public Integer getIdnasf() {
		return this.idnasf;
	}

	public void setIdnasf(Integer idnasf) {
		this.idnasf = idnasf;
	}

	@Column(name = "codigo_distrito_sanitario")
	public Integer getCodigoDistritoSanitario() {
		return this.codigoDistritoSanitario;
	}

	public void setCodigoDistritoSanitario(Integer codigoDistritoSanitario) {
		this.codigoDistritoSanitario = codigoDistritoSanitario;
	}

	@Column(name = "cnes")
	public Integer getCnes() {
		return this.cnes;
	}

	public void setCnes(Integer cnes) {
		this.cnes = cnes;
	}

	@Column(name = "equipe", length = 45)
	public String getEquipe() {
		return this.equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	@Column(name = "ponto_de_apoio", length = 100)
	public String getPontoDeApoio() {
		return this.pontoDeApoio;
	}

	public void setPontoDeApoio(String pontoDeApoio) {
		this.pontoDeApoio = pontoDeApoio;
	}

	@Column(name = "nome_nucleo", length = 100)
	public String getNomeNucleo() {
		return this.nomeNucleo;
	}

	public void setNomeNucleo(String nomeNucleo) {
		this.nomeNucleo = nomeNucleo;
	}

	@Column(name = "area", length = 100)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "telefone", length = 45)
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
