package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Distritos2012 generated by hbm2java
 */
@Entity
@Table(name = "distritos_2012", catalog = "saude_rec")
public class Distritos2012 implements java.io.Serializable {

	private Distritos2012Id id;

	public Distritos2012() {
	}

	public Distritos2012(Distritos2012Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "distritosanitarioCodigo", column = @Column(name = "DISTRITOSANITARIO_CODIGO")),
			@AttributeOverride(name = "distritosanitarioDescricao", column = @Column(name = "DISTRITOSANITARIO_DESCRICAO", length = 30)),
			@AttributeOverride(name = "municipioCodigo", column = @Column(name = "MUNICIPIO_CODIGO")),
			@AttributeOverride(name = "municipioDescricao", column = @Column(name = "MUNICIPIO_DESCRICAO", length = 25)),
			@AttributeOverride(name = "regiao", column = @Column(name = "REGIAO")) })
	public Distritos2012Id getId() {
		return this.id;
	}

	public void setId(Distritos2012Id id) {
		this.id = id;
	}

}
