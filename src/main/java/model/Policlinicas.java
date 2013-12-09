package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Policlinicas generated by hbm2java
 */
@Entity
@Table(name = "policlinicas", catalog = "saude_rec")
public class Policlinicas implements java.io.Serializable {

	private PoliclinicasId id;

	public Policlinicas() {
	}

	public Policlinicas(PoliclinicasId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rpa", column = @Column(name = "RPA")),
			@AttributeOverride(name = "microRegiao", column = @Column(name = "MICRO_REGIAO")),
			@AttributeOverride(name = "cnes", column = @Column(name = "CNES")),
			@AttributeOverride(name = "unidade", column = @Column(name = "UNIDADE", length = 50)),
			@AttributeOverride(name = "endereco", column = @Column(name = "ENDERECO", length = 50)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 50)),
			@AttributeOverride(name = "fone", column = @Column(name = "FONE", length = 50)),
			@AttributeOverride(name = "especialidades", column = @Column(name = "ESPECIALIDADES", length = 350)),
			@AttributeOverride(name = "latitude", column = @Column(name = "LATITUDE", length = 50)),
			@AttributeOverride(name = "longitude", column = @Column(name = "LONGITUDE", length = 50)) })
	public PoliclinicasId getId() {
		return this.id;
	}

	public void setId(PoliclinicasId id) {
		this.id = id;
	}

}
