package model;

// Generated 27/01/2014 15:23:40 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Solicitacoes2011 generated by hbm2java
 */
@Entity
@Table(name = "solicitacoes_2011", catalog = "saude_rec")
public class Solicitacoes2011 implements java.io.Serializable {

	private Solicitacoes2011Id id;

	public Solicitacoes2011() {
	}

	public Solicitacoes2011(Solicitacoes2011Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "solicitacaoNumero", column = @Column(name = "SOLICITACAO_NUMERO")),
			@AttributeOverride(name = "solicitacaoData", column = @Column(name = "SOLICITACAO_DATA", length = 10)),
			@AttributeOverride(name = "pacienteSexo", column = @Column(name = "PACIENTE_SEXO", length = 8)),
			@AttributeOverride(name = "pacienteIdadeanos", column = @Column(name = "PACIENTE_IDADEANOS")),
			@AttributeOverride(name = "pacienteIdademeses", column = @Column(name = "PACIENTE_IDADEMESES")),
			@AttributeOverride(name = "bairrosaudeCodigo", column = @Column(name = "BAIRROSAUDE_CODIGO")),
			@AttributeOverride(name = "origemchamadoCodigo", column = @Column(name = "ORIGEMCHAMADO_CODIGO")),
			@AttributeOverride(name = "origemchamadoDescricao", column = @Column(name = "ORIGEMCHAMADO_DESCRICAO", length = 20)),
			@AttributeOverride(name = "situacaosolicitacaoCodigo", column = @Column(name = "SITUACAOSOLICITACAO_CODIGO")),
			@AttributeOverride(name = "situacaosolicitacaoDescricao", column = @Column(name = "SITUACAOSOLICITACAO_DESCRICAO", length = 25)),
			@AttributeOverride(name = "sistemasaudeCodigo", column = @Column(name = "SISTEMASAUDE_CODIGO")),
			@AttributeOverride(name = "sistemasaudeDescricao", column = @Column(name = "SISTEMASAUDE_DESCRICAO", length = 25)),
			@AttributeOverride(name = "motivodescarteCodigo", column = @Column(name = "MOTIVODESCARTE_CODIGO")),
			@AttributeOverride(name = "motivodescarteDescricao", column = @Column(name = "MOTIVODESCARTE_DESCRICAO", length = 50)),
			@AttributeOverride(name = "acompanhamentoMedico", column = @Column(name = "ACOMPANHAMENTO_MEDICO", length = 3)),
			@AttributeOverride(name = "dataAcionamento", column = @Column(name = "DATA_ACIONAMENTO", length = 20)),
			@AttributeOverride(name = "dataChegada", column = @Column(name = "DATA_CHEGADA", length = 20)),
			@AttributeOverride(name = "dataConclusao", column = @Column(name = "DATA_CONCLUSAO", length = 20)),
			@AttributeOverride(name = "dataRemocao", column = @Column(name = "DATA_REMOCAO", length = 20)),
			@AttributeOverride(name = "tipoocorrenciaCodigo", column = @Column(name = "TIPOOCORRENCIA_CODIGO")),
			@AttributeOverride(name = "tipoocorrenciaDescricao", column = @Column(name = "TIPOOCORRENCIA_DESCRICAO", length = 10)) })
	public Solicitacoes2011Id getId() {
		return this.id;
	}

	public void setId(Solicitacoes2011Id id) {
		this.id = id;
	}

}
