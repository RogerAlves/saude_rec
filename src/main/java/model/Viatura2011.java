package model;

// Generated 14/12/2013 14:42:03 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Viatura2011 generated by hbm2java
 */
@Entity
@Table(name = "viatura2011", catalog = "saude_rec")
public class Viatura2011 implements java.io.Serializable {

	private Viatura2011Id id;

	public Viatura2011() {
	}

	public Viatura2011(Viatura2011Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "viaturaCodigo", column = @Column(name = "VIATURA_CODIGO")),
			@AttributeOverride(name = "viaturaDescricao", column = @Column(name = "VIATURA_DESCRICAO", length = 30)),
			@AttributeOverride(name = "distritosanitarioCodigo", column = @Column(name = "DISTRITOSANITARIO_CODIGO")),
			@AttributeOverride(name = "tipoviaturaCodigo", column = @Column(name = "TIPOVIATURA_CODIGO")),
			@AttributeOverride(name = "tipoviaturaDescricao", column = @Column(name = "TIPOVIATURA_DESCRICAO", length = 30)) })
	public Viatura2011Id getId() {
		return this.id;
	}

	public void setId(Viatura2011Id id) {
		this.id = id;
	}

}
