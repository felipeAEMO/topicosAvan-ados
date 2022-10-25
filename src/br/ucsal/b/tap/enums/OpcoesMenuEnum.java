package br.ucsal.b.tap.enums;

public enum OpcoesMenuEnum {
	
	ADICIONAR (1,"Adicionar"),
	LISTAR_MUSICAS (2, "Listar músicas"),
	LISTAR_MUISCAS_ANO (3, "Listar músicas por ano"),
	LISTAR_MUSICAS_PERIODO_ANOS (4, "Listar músicas por período de anos"),
	LISTAR_MUISCAS_ARTISTA (5, "Listar músicas por artista"),
	LISTAR_MUSICAS_GENERO (6, "Listar músicas por gênero"),
	LISTAR_MUSICAS_A_PARTIR_NOTA (7, "Listar músicas a partir de uma nota"),
	LISTAR_MUSICAS_NOTA (8, "Listar músicas por nota"),
	LISTAR_MUSICAS_ALBUM (9, "Listar músicas por álbum"),
	BUSCAR_MUSICA (10, "Buscar música"),
	EXCLUIR_MUSICA (11, "Excluir música"),
	SAIR (12, "Sair");
	
	Integer codigo;
	String descricao;
	
	private OpcoesMenuEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static OpcoesMenuEnum capturarCodigo(Integer cod){
		if (cod == null)
			return null;
		for (OpcoesMenuEnum e : OpcoesMenuEnum.values()){
			if (e.codigo.equals(cod))
				return e;
		}
		return null;
	}
	
}