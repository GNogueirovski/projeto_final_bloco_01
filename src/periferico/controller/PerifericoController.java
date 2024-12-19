package periferico.controller;

import java.util.ArrayList;

import periferico.model.Periferico;
import periferico.repository.PerifericoRepository;

public class PerifericoController implements PerifericoRepository {
	private ArrayList<Periferico> perifericos = new ArrayList<Periferico>();
	int numero = 0;

	@Override
	public void adicionarPeriferico(Periferico periferico) {
		perifericos.add(periferico);
		System.out.printf("O periférico de ID %d foi criado com sucesso", periferico.getIdproduto());

	}

	@Override
	public void removerPeriferico(int idproduto) {
		var procuraPeriferico = procurarNaCollection(idproduto);

		if (procuraPeriferico != null && perifericos.remove(procuraPeriferico) == true) {
				System.out.printf("Periférico de ID %d foi deletado!", idproduto);
			} else {
			System.out.printf("Periférico de ID %d não foi encontrado!", idproduto);
			}
	}

	@Override
	public void listarPerifericos() {
		for (var periferico : perifericos) {
			periferico.visualizar();
		}

	}

	@Override
	public void atualizarPeriferico(Periferico periferico) {

		var procuraPeriferico = procurarNaCollection(periferico.getIdproduto());

		if (procuraPeriferico != null) {
			perifericos.set(perifericos.indexOf(procuraPeriferico), periferico);
			System.out.printf("Periférico de ID %d foi atualizado!", periferico.getIdproduto());
		} else {
			System.out.printf("Periférico de ID %d não foi encontrado!", periferico.getIdproduto());
		}

	}

	@Override
	public void encontrarPorID(int idproduto) {
		var procuraPeriferico = procurarNaCollection(idproduto);
		
		if (procuraPeriferico != null)
			procuraPeriferico.visualizar();
		else {
			System.out.println("\n Periférico não encontrado");
		}
			

	}

	public int criarNumero() {
		return ++numero;
	}

	public Periferico procurarNaCollection(int number) {
		for (var periferico : perifericos) {
			if (periferico.getIdproduto() == number) {
				return periferico;
			}
		}
		return null;
	}

	public String getListaPerifericos() {
		return null;
	}

}
