package model;

// Generated 14/12/2013 14:42:03 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Sadt generated by hbm2java
 */
@Entity
@Table(name = "sadt", catalog = "saude_rec")
public class Sadt implements java.io.Serializable {

	private SadtId id;

	public Sadt() {
	}

	public Sadt(SadtId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rpa", column = @Column(name = "RPA")),
			@AttributeOverride(name = "microRegiao", column = @Column(name = "MICRO_REGIAO")),
			@AttributeOverride(name = "unidade", column = @Column(name = "UNIDADE", length = 80)),
			@AttributeOverride(name = "endereco", column = @Column(name = "ENDERECO", length = 80)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 80)),
			@AttributeOverride(name = "fone", column = @Column(name = "FONE", length = 80)),
			@AttributeOverride(name = "especialidade", column = @Column(name = "ESPECIALIDADE", length = 80)),
			@AttributeOverride(name = "tipoUnidade", column = @Column(name = "TIPO_UNIDADE", length = 80)) })
	public SadtId getId() {
		return this.id;
	}

	public void setId(SadtId id) {
		this.id = id;
	}

}
