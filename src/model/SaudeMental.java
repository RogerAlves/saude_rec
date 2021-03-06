package model;

// Generated 08/12/2013 19:30:13 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SaudeMental generated by hbm2java
 */
@Entity
@Table(name = "saude_mental", catalog = "saude_rec")
public class SaudeMental implements java.io.Serializable {

	private SaudeMentalId id;

	public SaudeMental() {
	}

	public SaudeMental(SaudeMentalId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rpa", column = @Column(name = "RPA")),
			@AttributeOverride(name = "microRegiao", column = @Column(name = "MICRO_REGIAO")),
			@AttributeOverride(name = "cnes", column = @Column(name = "CNES")),
			@AttributeOverride(name = "unidade", column = @Column(name = "UNIDADE", length = 100)),
			@AttributeOverride(name = "endereco", column = @Column(name = "ENDERECO", length = 100)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 100)),
			@AttributeOverride(name = "fone", column = @Column(name = "FONE", length = 100)),
			@AttributeOverride(name = "latitude", column = @Column(name = "LATITUDE", length = 100)),
			@AttributeOverride(name = "longitude", column = @Column(name = "LONGITUDE", length = 100)) })
	public SaudeMentalId getId() {
		return this.id;
	}

	public void setId(SaudeMentalId id) {
		this.id = id;
	}

}
