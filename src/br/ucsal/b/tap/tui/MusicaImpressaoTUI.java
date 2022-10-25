package br.ucsal.b.tap.tui;

import java.util.ArrayList;

import br.ucsal.b.tap.domain.Musica;

public class MusicaImpressaoTUI {

	public static void imprimirMusica(Musica musica) {
		System.out.println(musica);
	}

	public static void listarMusicas(ArrayList<Musica> musicas) {
		for (Musica musica : musicas) {
			System.out.println(musica);
		}
	}

	public static void imprimirFrase(String frase) {
		System.out.println(frase);
	}

}
