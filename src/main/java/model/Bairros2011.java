package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bairros2011 generated by hbm2java
 */
@Entity
@Table(name = "bairros_2011", catalog = "saude_rec")
public class Bairros2011 implements java.io.Serializable {

	private int codigoBairro;
	private String descricao;
	private Integer codigoDistritoSanitario;

	public Bairros2011() {
	}

	public Bairros2011(int codigoBairro) {
		this.codigoBairro = codigoBairro;
	}

	public Bairros2011(int codigoBairro, String descricao,
			Integer codigoDistritoSanitario) {
		this.codigoBairro = codigoBairro;
		this.descricao = descricao;
		this.codigoDistritoSanitario = codigoDistritoSanitario;
	}

	@Id
	@Column(name = "codigo_bairro", unique = true, nullable = false)
	public int getCodigoBairro() {
		return this.codigoBairro;
	}

	public void setCodigoBairro(int codigoBairro) {
		this.codigoBairro = codigoBairro;
	}

	@Column(name = "descricao")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "codigo_distrito_sanitario")
	public Integer getCodigoDistritoSanitario() {
		return this.codigoDistritoSanitario;
	}

	public void setCodigoDistritoSanitario(Integer codigoDistritoSanitario) {
		this.codigoDistritoSanitario = codigoDistritoSanitario;
	}

}
