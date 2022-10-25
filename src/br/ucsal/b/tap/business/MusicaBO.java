package br.ucsal.b.tap.business;

import java.util.ArrayList;

import java.util.Comparator;

import br.ucsal.b.tap.enums.GeneroMusicalEnum;
import br.ucsal.b.tap.exceptions.ArtistaException;
import br.ucsal.b.tap.exceptions.MusicaException;
import br.ucsal.b.tap.exceptions.NotaException;
import br.ucsal.b.tap.persistence.MusicaDAO;

import java.util.List;
import br.ucsal.b.tap.domain.Musica;

public class MusicaBO {

	private static List<Musica> musicas = new ArrayList<>();

	public static void adicionarMusica(Musica musica) throws MusicaException {
		MusicaDAO.adicionarMusicas(musica);

		throw new MusicaException("Não foi possível incluir a música.");
	}

	public static void listarMusicas() throws MusicaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicas((ArrayList<Musica>) musicasOrdenadas);
		throw new MusicaException("Não há músicas para serem listadas.");
	}

	public static void listarMusicasAnoEspecifico(Integer ano) throws MusicaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getAnoDeLancamento).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasAnoEspecifico(ano, (ArrayList<Musica>) musicasOrdenadas);
		throw new MusicaException("Não há músicas neste ano.");
	}

	public static void listarMusicasPeriodoAno(Integer ano1, Integer ano2) throws MusicaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getAnoDeLancamento).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasPeriodoDeAnos(ano1, ano2, (ArrayList<Musica>) musicasOrdenadas);
		throw new MusicaException("Não há músicas neste período de anos.");
	}

	public static void listarMusicasArtista(String nomeArtista) throws ArtistaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getNomeDoArtista).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasArtista(nomeArtista, (ArrayList<Musica>) musicasOrdenadas);
		throw new ArtistaException("Não há músicas neste artista.");
	}

	public static void listarMusicasGenero(GeneroMusicalEnum generoMusical) throws MusicaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getGeneroMusical).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasGenero(generoMusical, (ArrayList<Musica>) musicasOrdenadas);
		throw new MusicaException("Não há músicas neste gênero musical.");
	}

	public static void listarMusicasAPartirNota(Integer nota) throws NotaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getNota).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasAPartirNota(nota, (ArrayList<Musica>) musicasOrdenadas);
		throw new NotaException("Não há músicas presentes neste período de notas.");
	}

	public static void listarMusicasNotaEspecifica(Integer nota) throws MusicaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getNota).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasNotaEspecifica(nota, (ArrayList<Musica>) musicasOrdenadas);
		throw new MusicaException("Não há músicas presentes com esta nota atribuída.");
	}

	public static void listarMusicasAlbum(String album) throws MusicaException {
		List<Musica> musicasOrdenadas = musicas;
		musicasOrdenadas.sort(Comparator.comparing(Musica::getNomeDoAlbum).thenComparing(Musica::getNomeDaMusica));
		MusicaDAO.listarMusicasAlbum(album, (ArrayList<Musica>) musicasOrdenadas);
		throw new MusicaException("Não há músicas neste álbum.");
	}

	public static Musica buscarMusica(String nomeMusica, String nomeArtista) throws MusicaException {
		for (Musica musica : musicas) {
			if (musica.getNomeDaMusica().equals(nomeMusica) && musica.getNomeDoArtista().equals(nomeArtista)) {
				MusicaDAO.buscarMusica(musica);
			}
		}
		throw new MusicaException("Música não encontrada.");
	}

	public static void excluirMusica(String nomeMusica, String nomeArtista) throws MusicaException {
		MusicaDAO.excluirMusica(nomeMusica, nomeArtista, (ArrayList<Musica>) musicas);
		throw new MusicaException("Não foi possível remover a música.");
	}
}
