package br.ucsal.bes20192.poo.tui;

import java.util.Scanner;

import br.ucsal.bes20192.poo.enums.OpcoesMenuEnum;
import br.ucsal.bes20192.poo.exceptions.TUIException;

public class Executor {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		executor();
	}

	public static void executor() {
		Integer opcoesMenu = null;
		do {
			exibirOpcoes();
			try {
				opcoesMenu = obterOpcoes();
			} catch (Exception e) {
				System.out.println("Opção selecionada não é válida.");
			}

			executarOpcao(opcoesMenu);
		} while (!opcoesMenu.equals(12));
	}

	public static void exibirOpcoes() {
		for (OpcoesMenuEnum opcoesMenu : OpcoesMenuEnum.values()) {
			System.out.println(opcoesMenu.getCodigo() + " - " + opcoesMenu.getDescricao());
		}
	}

	public static Integer obterOpcoes() throws TUIException {
		Integer opcaoFinal;
		OpcoesMenuEnum opcoesMenu;
		System.out.println("Digite o número referente à opção desejada:");
		Integer aux = sc.nextInt();
		sc.nextLine();
		opcoesMenu = OpcoesMenuEnum.capturarCodigo(aux);
		opcaoFinal = opcoesMenu.getCodigo();
		if (opcaoFinal <= 0 || opcaoFinal > 12) {
			throw new TUIException("Não foi possível capturar a opção.");
		}
		return opcaoFinal;

	}

	public static void executarOpcao(Integer opcaoMenu) {
		switch (opcaoMenu) {
		case 1:
			MusicaTUI.incluir();
			break;
		case 2:
			MusicaTUI.listarMusicas();
			break;
		case 3:
			MusicaTUI.listarMusicasAno();
			break;
		case 4:
			MusicaTUI.listarMusicasPeriodoAnos();
			break;
		case 5:
			MusicaTUI.listarMusicasArtista();
			break;
		case 6:
			MusicaTUI.listarMusicasGenero();
			break;
		case 7:
			MusicaTUI.listarMusicasAPartirNota();
			break;
		case 8:
			MusicaTUI.listarMusicasNota();
			break;
		case 9:
			MusicaTUI.listarMusicasAlbum();
			break;
		case 10:
			MusicaTUI.buscarMusica();
			break;
		case 11:
			MusicaTUI.remover();
			break;
		default:
			System.out.println("Tchau :)");
			break;
		}
	}

}
