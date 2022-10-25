package br.ucsal.b.tap.enums;

public enum GeneroMusicalEnum {

	ALTERNATIVO(1,"Alternativo"),
	AXE (2,"Axé"),
	BLUES (3,"Blues"),
	BOSSANOVA (4,"BossaNova"),
	BREGA (5,"Brega"),
	CLASSICO (6,"Clássico"),
	COUNTRY (7,"Country"),
	CUARTETO (8,"Cuarteto"),
	CUMBIA (9,"Cumbia"),
	DANCE(10,"Dance"),
	DISCO(11,"Disco"),
	ELETRONICA(12,"Eletrônica"),
	EMOCORE(13,"Emocore"),
	FADO(14,"Fado"),
	FOLK(15,"Folk"),
	FORRO(16,"Forro"),
	FUNK(17,"Funk"),
	GOSPEL(18,"Gospel"),
	GOTICO(19,"Gótico"),
	GRUNGE(20,"Grunge"),
	GUARANIA(21,"Guarania"),
	HARDROCK(22,"HardRock"),
	HARDCORE(23,"HardCore"),
	HEAVYMETAL(24,"HeavyMetal"),
	HIPHOP(25,"HipHop"),
	RAP(26,"Rap"),
	HOUSE(27,"House"),
	INDIE(28,"Indie"),
	INDUSTRIAL(29,"Industrial"),
	INFANTIL(30,"Infantil"),
	INSTRUMENTAL(31,"Instrumental"),
	JPOP(32,"JPop"),
	JROCK(33,"JRock"),
	JAZZ(34,"Jazz"),
	KPOP(35,"KPop"),
	KROCK(36,"KRock"),
	MAMBO(37,"Mambo"),
	HINOS(38,"Hinos"),
	MARIACHI(39,"Mariachi"),
	MERENGUE(40,"Merengue"),
	MPB(41,"MPB"),
	ANDINA(42,"Andina"),
	NEWAGE(43,"NewAge"),
	NEWWAVE(44,"NewWave"),
	PAGODE(45,"Pagode"),
	POP(46,"Pop"),
	POPROCK(47,"PopRock"),
	POSTROCK(48,"PostRock"),
	POWERPOP(49,"PowerPop"),
	PSICODELIA(50,"Psicodélia"),
	PUNKROCK(51,"PunkRock"),
	RANDB(52,"Randb"),
	RANCHERA(53,"Ranchera"),
	REGGAE(54,"Reggae"),
	REGGAETON(55,"Reggaeton"),
	REGIONAL(56,"Regional"),
	ROCK(57,"Rock"),
	ROMANTIC(58,"Romantic"),
	SALSA(59,"Salsa"),
	SAMBA(60,"Samba"),
	SERTANEJO(61,"Sertanejo"),
	SKA(62,"Ska"),
	SOFTROCK(63,"SoftRock"),
	SOUL(64,"Soul"),
	TANGO(65,"Tango"),
	TECNOPOP(66,"TecnoPop"),
	SURFMUSIC(67,"SurfMusic"),
	TROVA(68,"Trova"),
	WORLDMUSIC(69,"WorldMusic"),
	ZAMBA(70,"Zamba"),
	ZOUK(71,"Zouk");

	Integer codigo;
	String descricao;

	private GeneroMusicalEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public static GeneroMusicalEnum capturarCodigo(Integer cod){
		if (cod == null)
			return null;
		for (GeneroMusicalEnum e : GeneroMusicalEnum.values()){
			if (e.codigo.equals(cod))
				return e;
		}
		return null;
	}

}
