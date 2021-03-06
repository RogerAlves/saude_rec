package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FarmaciasDaFamilia generated by hbm2java
 */
@Entity
@Table(name = "farmacias_da_familia", catalog = "saude_rec")
public class FarmaciasDaFamilia implements java.io.Serializable {

	private FarmaciasDaFamiliaId id;

	public FarmaciasDaFamilia() {
	}

	public FarmaciasDaFamilia(FarmaciasDaFamiliaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rpa", column = @Column(name = "RPA")),
			@AttributeOverride(name = "microRegiao", column = @Column(name = "MICRO_REGIAO")),
			@AttributeOverride(name = "cnes", column = @Column(name = "CNES")),
			@AttributeOverride(name = "unidade", column = @Column(name = "UNIDADE", length = 70)),
			@AttributeOverride(name = "endereco", column = @Column(name = "ENDERECO", length = 70)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 70)),
			@AttributeOverride(name = "fone", column = @Column(name = "FONE", length = 70)),
			@AttributeOverride(name = "latitude", column = @Column(name = "LATITUDE", length = 70)),
			@AttributeOverride(name = "longitude", column = @Column(name = "LONGITUDE", length = 70)) })
	public FarmaciasDaFamiliaId getId() {
		return this.id;
	}

	public void setId(FarmaciasDaFamiliaId id) {
		this.id = id;
	}

}
