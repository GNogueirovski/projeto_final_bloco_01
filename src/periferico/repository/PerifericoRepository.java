package periferico.repository;

import periferico.model.Periferico;

public interface PerifericoRepository {
	
	 public void adicionarPeriferico (Periferico periferico);
	 public void removerPeriferico (int idproduto);
	 public void listarPerifericos ();
	 public void atualizarPeriferico (Periferico periferico); 
	 public void encontrarPorID(int idproduto);
}
