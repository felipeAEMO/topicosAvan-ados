package br.ucsal.b.tap.domain;

import br.ucsal.b.tap.enums.GeneroMusicalEnum;
import br.ucsal.b.tap.enums.TipoDeArtistaEnum;

public class Musica extends Artista {

	private String nomeDaMusica;
	private String nomeDoAlbum;
	private Integer anoDeLancamento;
	private TipoDeArtistaEnum tipoDeArtista;
	private GeneroMusicalEnum generoMusical;
	private Integer nota; // 1-5 estrelas

	public Musica(String nomeDaMusica, String nomeDoArtista, String nomeDoAlbum, Integer anoDeLancamento,
			TipoDeArtistaEnum tipoDeArtista, GeneroMusicalEnum generoMusical, Integer nota) {
		super(nomeDoArtista);
		this.nomeDaMusica = nomeDaMusica;
		this.nomeDoAlbum = nomeDoAlbum;
		this.anoDeLancamento = anoDeLancamento;
		this.tipoDeArtista = tipoDeArtista;
		this.generoMusical = generoMusical;
		this.nota = nota;
	}

	public Musica(String nomeDaMusica, String nomeDoArtista, TipoDeArtistaEnum tipoDeArtista,
			GeneroMusicalEnum generoMusical, Integer nota2) {
		super(nomeDoArtista);
		this.nomeDaMusica = nomeDaMusica;
		this.tipoDeArtista = tipoDeArtista;
		this.generoMusical = generoMusical;
	}

	public String getNomeDaMusica() {
		return nomeDaMusica;
	}

	public void setNomeDaMusica(String nomeDaMusica) {
		this.nomeDaMusica = nomeDaMusica;
	}

	public String getNomeDoAlbum() {
		return nomeDoAlbum;
	}

	public void setNomeDoAlbum(String nomeDoAlbum) {
		this.nomeDoAlbum = nomeDoAlbum;
	}

	public Integer getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(Integer anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public TipoDeArtistaEnum getTipoDeArtista() {
		return tipoDeArtista;
	}

	public void setTipoDeArtista(TipoDeArtistaEnum tipoDeArtista) {
		this.tipoDeArtista = tipoDeArtista;
	}

	public GeneroMusicalEnum getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(GeneroMusicalEnum generoMusical) {
		this.generoMusical = generoMusical;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nomeDaMusica == null) ? 0 : nomeDaMusica.hashCode());
		result = prime * result + ((nomeDoAlbum == null) ? 0 : nomeDoAlbum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		if (nomeDaMusica == null) {
			if (other.nomeDaMusica != null)
				return false;
		} else if (!nomeDaMusica.equals(other.nomeDaMusica))
			return false;
		if (nomeDoAlbum == null) {
			if (other.nomeDoAlbum != null)
				return false;
		} else if (!nomeDoAlbum.equals(other.nomeDoAlbum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Musica [Nome da Msica = " + nomeDaMusica + ", \nNome Do Artista = " + nomeDoArtista
				+ ", \nNome do lbum = " + nomeDoAlbum + ", \nAno de Lanamento = " + anoDeLancamento
				+ ", \nTipo de Artista = " + tipoDeArtista + ", \nGnero Musical = " + generoMusical + ", \nNota = "
				+ nota + "]";
	}

}
