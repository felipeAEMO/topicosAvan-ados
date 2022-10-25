package br.ucsal.b.tap.tui;

import java.util.Scanner;

import br.ucsal.b.tap.business.MusicaBO;
import br.ucsal.b.tap.domain.Musica;
import br.ucsal.b.tap.enums.GeneroMusicalEnum;
import br.ucsal.b.tap.enums.TipoDeArtistaEnum;
import br.ucsal.b.tap.exceptions.ArtistaException;
import br.ucsal.b.tap.exceptions.MusicaException;
import br.ucsal.b.tap.exceptions.NotaException;

public class MusicaTUI {

	static Scanner sc = new Scanner(System.in);

	public static void incluir() {
		System.out.println("INCLUIR MÚSICA: ");
		notasDeObservacao();
		System.out.println("Insira os dados da música:");
		System.out.println("* Nome da música:");
		String nomeMusica = sc.nextLine();
		System.out.println("* Nome artista:");
		String nomeArtista = sc.nextLine();
		System.out.println("Nome do álbum:");
		String nomeAlbum = sc.nextLine();
		if (nomeAlbum.equals("0")) {
			nomeAlbum = null;
		}
		System.out.println("Ano de lançamento:");
		Integer ano = sc.nextInt();
		sc.nextLine();
		if (ano == 0) {
			ano = null;
		}
		System.out.println("* Tipo de artista: (Solo, Banda)");
		String tipoDeArtista = sc.nextLine();
		TipoDeArtistaEnum tipoDeArtistaEnum = null;
		tipoDeArtistaEnum = TipoDeArtistaEnum.valueOf(tipoDeArtista.toUpperCase());
		System.out.println("* Gênero musical: (Insira o número equivalente ao gênero desejado)");
		imprimirGeneroMusical();
		Integer genero = sc.nextInt();
		GeneroMusicalEnum generoMusical = GeneroMusicalEnum.capturarCodigo(genero);
		generoMusical = GeneroMusicalEnum.capturarCodigo(genero);
		System.out.println("Nota: (1 - 5)");
		Integer nota = sc.nextInt();

		Musica musica = new Musica(nomeMusica, nomeArtista, nomeAlbum, ano, tipoDeArtistaEnum, generoMusical, nota);

		try {
			MusicaBO.adicionarMusica(musica);
			MusicaImpressaoTUI.imprimirFrase(musica.getNomeDaMusica() + " foi adicionada.");

		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

	public static void listarMusicas() {
		System.out.println("LISTAR MÚSICAS:");
		try {
			MusicaBO.listarMusicas();
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void listarMusicasAno() {
		System.out.println("LISTAR MÚSICAS POR ANO:");
		System.out.println("Insira o ano qual deseja listar as músicas:");
		Integer ano = sc.nextInt();
		try {
			MusicaBO.listarMusicasAnoEspecifico(ano);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void listarMusicasPeriodoAnos() {
		System.out.println("LISTAR MÚSICAS POR PERÍODO DE ANOS:");
		System.out.println("Insira os anos qual deseja listar as músicas:");
		System.out.println("Ano 1:");
		Integer ano1 = sc.nextInt();
		System.out.println("Ano 2:");
		Integer ano2 = sc.nextInt();
		try {
			MusicaBO.listarMusicasPeriodoAno(ano1, ano2);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public static void listarMusicasArtista() {
		System.out.println("LISTAR MÚSICAS POR ARTISTA:");
		System.out.println("Insira o nome do artista:");
		String nomeArtista = sc.nextLine();
		try {
			MusicaBO.listarMusicasArtista(nomeArtista);
		} catch (ArtistaException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	public static void listarMusicasGenero() {
		System.out.println("LISTAR MÚSICAS POR GÊNERO:");
		System.out.println("Insira o gênero musical:");
		System.out.println("Precisa acessar a lista? (1) Sim (2) Não");
		Integer listaAcesso = sc.nextInt();
		sc.nextLine();
		if (listaAcesso == 1) {
			imprimirGeneroMusical();
		}
		Integer genero = sc.nextInt();
		GeneroMusicalEnum generoMusical = GeneroMusicalEnum.capturarCodigo(genero);
		generoMusical = GeneroMusicalEnum.capturarCodigo(genero);
		try {
			MusicaBO.listarMusicasGenero(generoMusical);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	public static void listarMusicasAPartirNota() {
		System.out.println("LISTAR MÚSICAS A PARTIR DE UMA NOTA:");
		System.out.println("Insira a nota para a listagem de músicas:");
		Integer nota = sc.nextInt();
		try {
			MusicaBO.listarMusicasAPartirNota(nota);
		} catch (NotaException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	public static void listarMusicasNota() {
		System.out.println("LISTAR MÚSICAS COM UMA NOTA ESPECÍFICA:");
		System.out.println("Insira a nota para a listagem de músicas:");
		Integer nota = sc.nextInt();
		try {
			MusicaBO.listarMusicasNotaEspecifica(nota);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	public static void listarMusicasAlbum() {
		System.out.println("LISTAR MÚSICAS POR ÁLBUM:");
		System.out.println("Insira o nome do álbum:");
		String album = sc.nextLine();
		try {
			MusicaBO.listarMusicasAlbum(album);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	public static void buscarMusica() {
		System.out.println("BUSCAR MÚSICA:");
		System.out.println("Insira o nome da música:");
		String nomeMusica = sc.nextLine();
		System.out.println("Insira o nome do artista:");
		String nomeArtista = sc.nextLine();
		try {
			MusicaBO.buscarMusica(nomeMusica, nomeArtista);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());

		}
	}

	public static void remover() {
		System.out.println("REMOVER MÚSICA:");
		System.out.println("Insira o nome da música:");
		String nomeMusica = sc.nextLine();
		System.out.println("Insira o nome do artista:");
		String nomeArtista = sc.nextLine();
		try {
			MusicaBO.excluirMusica(nomeMusica, nomeArtista);
		} catch (MusicaException e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

	private static void notasDeObservacao() {
		System.out
				.println("\n'*' - Campo obrigatório.\n" + "'0' - Colocar caso não preencher campo não obrigatório.\n");
	}

	private static void imprimirGeneroMusical() {
		for (GeneroMusicalEnum generos : GeneroMusicalEnum.values()) {
			System.out.println(generos.getCodigo() + " - " + generos.getDescricao());
		}
	}

}
