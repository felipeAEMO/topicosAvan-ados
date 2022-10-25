package br.ucsal.b.tap.domain;

public class Artista {

	protected String nomeDoArtista;

	public Artista(String nomeDoArtista) {
		super();
		this.nomeDoArtista = nomeDoArtista;
	}

	public String getNomeDoArtista() {
		return nomeDoArtista;
	}

	public void setNomeDoArtista(String nomeDoArtista) {
		this.nomeDoArtista = nomeDoArtista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDoArtista == null) ? 0 : nomeDoArtista.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (nomeDoArtista == null) {
			if (other.nomeDoArtista != null)
				return false;
		} else if (!nomeDoArtista.equals(other.nomeDoArtista))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artista [Nome Do Artista = " + nomeDoArtista + "]";
	}

}
