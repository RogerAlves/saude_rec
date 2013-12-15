package model;

// Generated 14/12/2013 14:42:03 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Samu2011 generated by hbm2java
 */
@Entity
@Table(name = "samu2011", catalog = "saude_rec")
public class Samu2011 implements java.io.Serializable {

	private Samu2011Id id;

	public Samu2011() {
	}

	public Samu2011(Samu2011Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "solicitacaoNumero", column = @Column(name = "SOLICITACAO_NUMERO")),
			@AttributeOverride(name = "solicitacaoData", column = @Column(name = "SOLICITACAO_DATA", length = 10)),
			@AttributeOverride(name = "bairrosaudeCodigo", column = @Column(name = "BAIRROSAUDE_CODIGO")),
			@AttributeOverride(name = "origemchamadoCodigo", column = @Column(name = "ORIGEMCHAMADO_CODIGO")),
			@AttributeOverride(name = "origemchamadoDescricao", column = @Column(name = "ORIGEMCHAMADO_DESCRICAO", length = 16)),
			@AttributeOverride(name = "situacaosolicitacaoCodigo", column = @Column(name = "SITUACAOSOLICITACAO_CODIGO")),
			@AttributeOverride(name = "situacaosolicitacaoDescricao", column = @Column(name = "SITUACAOSOLICITACAO_DESCRICAO", length = 22)) })
	public Samu2011Id getId() {
		return this.id;
	}

	public void setId(Samu2011Id id) {
		this.id = id;
	}

}