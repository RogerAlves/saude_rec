package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Hospitais generated by hbm2java
 */
@Entity
@Table(name = "hospitais", catalog = "saude_rec")
public class Hospitais implements java.io.Serializable {

	private HospitaisId id;

	public Hospitais() {
	}

	public Hospitais(HospitaisId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "natureza", column = @Column(name = "NATUREZA", length = 80)),
			@AttributeOverride(name = "rpa", column = @Column(name = "RPA")),
			@AttributeOverride(name = "microRegiao", column = @Column(name = "MICRO_REGIAO")),
			@AttributeOverride(name = "cnes", column = @Column(name = "CNES")),
			@AttributeOverride(name = "unidade", column = @Column(name = "UNIDADE", length = 80)),
			@AttributeOverride(name = "endereco", column = @Column(name = "ENDERECO", length = 80)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 80)),
			@AttributeOverride(name = "telefone", column = @Column(name = "TELEFONE", length = 80)),
			@AttributeOverride(name = "especialidades", column = @Column(name = "ESPECIALIDADES", length = 80)),
			@AttributeOverride(name = "latitude", column = @Column(name = "LATITUDE", length = 80)),
			@AttributeOverride(name = "longitude", column = @Column(name = "LONGITUDE", length = 80)) })
	public HospitaisId getId() {
		return this.id;
	}

	public void setId(HospitaisId id) {
		this.id = id;
	}

}
