package br.ucsal.b.tap.persistence;

import java.util.ArrayList;

import br.ucsal.b.tap.enums.GeneroMusicalEnum;
import br.ucsal.b.tap.tui.MusicaImpressaoTUI;

import java.util.List;
import br.ucsal.b.tap.domain.Musica;

public class MusicaDAO {

	static List<Musica> musicas = new ArrayList<>();

	public static void adicionarMusicas(Musica musica) {
		musicas.add(musica);
	}

	public static void listarMusicas(ArrayList<Musica> musicas) {
		MusicaImpressaoTUI.listarMusicas(musicas);
	}

	public static void listarMusicasAnoEspecifico(Integer ano, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getAnoDeLancamento() == ano) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}

	}

	public static void listarMusicasPeriodoDeAnos(Integer ano1, Integer ano2, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getAnoDeLancamento() >= ano1 && musica.getAnoDeLancamento() <= ano2) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}

	}

	public static void listarMusicasArtista(String nomeArtista, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getNomeDoArtista().equals(nomeArtista)) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}

	}

	public static void listarMusicasGenero(GeneroMusicalEnum generoMusical, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getGeneroMusical().equals(generoMusical)) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}
	}

	public static void listarMusicasAPartirNota(Integer nota, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getNota() >= nota) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}
	}

	public static void listarMusicasNotaEspecifica(Integer nota, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getNota() == nota) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}
	}

	public static void listarMusicasAlbum(String album, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (musica.getNomeDoAlbum().equals(album)) {
				MusicaImpressaoTUI.imprimirMusica(musica);
			}
		}
	}

	public static void buscarMusica(Musica musica) {
		for (Musica musica1 : musicas) {
			if (musica.getNomeDaMusica().equals(musica.getNomeDaMusica())
					&& musica.getNomeDoArtista().equals(musica.getNomeDoArtista())) {
				MusicaImpressaoTUI.imprimirMusica(musica1);
			}
		}
	}

	public static void excluirMusica(String nomeMusica, String nomeArtista, ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			if (nomeMusica.equals(musica.getNomeDaMusica()) && nomeArtista.equals(musica.getNomeDoArtista())) {
				MusicaImpressaoTUI.imprimirMusica(musica);
				musicas.remove(musica);
				MusicaImpressaoTUI.imprimirFrase(musica.getNomeDaMusica() + " foi removida.");
			}
		}
	}

}
