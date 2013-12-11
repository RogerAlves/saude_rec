package model;

// Generated 11/12/2013 01:39:05 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Remocoes2013 generated by hbm2java
 */
@Entity
@Table(name = "remocoes_2013", catalog = "saude_rec")
public class Remocoes2013 implements java.io.Serializable {

	private Remocoes2013Id id;

	public Remocoes2013() {
	}

	public Remocoes2013(Remocoes2013Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "solicitacaoNumero", column = @Column(name = "SOLICITACAO_NUMERO")),
			@AttributeOverride(name = "remocaoSequencial", column = @Column(name = "REMOCAO_SEQUENCIAL")),
			@AttributeOverride(name = "hospitalCodigo", column = @Column(name = "HOSPITAL_CODIGO")),
			@AttributeOverride(name = "remocaoDatahora", column = @Column(name = "REMOCAO_DATAHORA", length = 20)),
			@AttributeOverride(name = "remocaoAceitacao", column = @Column(name = "REMOCAO_ACEITACAO", length = 3)) })
	public Remocoes2013Id getId() {
		return this.id;
	}

	public void setId(Remocoes2013Id id) {
		this.id = id;
	}

}
