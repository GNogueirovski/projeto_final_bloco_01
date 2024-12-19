package periferico.model;

import periferico.util.Colors;

public abstract class Periferico {
	private int idproduto;
	private int tipo;
	private String marcaproduto;
	private String nomeproduto;
	private float preco;
	private int estoque;

	public Periferico(int idproduto, int tipo, String marcaproduto, String nomeproduto, float preco, int estoque) {
		this.idproduto = idproduto;
		this.tipo = tipo;
		this.marcaproduto = marcaproduto;
		this.nomeproduto = nomeproduto;
		this.preco = preco;
		this.estoque = estoque;
	}
	

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getMarcaproduto() {
		return marcaproduto;
	}

	public void setMarcaproduto(String marcaproduto) {
		this.marcaproduto = marcaproduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public void visualizar() {
		String tipo = "";
		// switch para trocar a conta corrente de acordo com o 1 ou 2 do type
		switch (this.tipo) {
		case 1:
			tipo = "Teclado";
			break;

		case 2:
			tipo = "Mouse";
			break;
		}
		// print dos detalhes da conta

		System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND);
		System.out.println("\n*****************************************");
		System.out.println("Dados do periférico                      ");
		System.out.println("*****************************************");
		System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_RED_BACKGROUND);
		System.out.printf("ID do produto: %d\n", this.idproduto);
		System.out.printf("Tipo de periférico: %s\n", tipo);
		System.out.printf("Marca do %s: %s\n", tipo, this.marcaproduto);
		System.out.printf("Nome do %s: %s\n", tipo, this.nomeproduto);
		System.out.printf("Preço: R$ %.2f\n", this.preco);
		System.out.printf("Estoque atual: %d\n", this.estoque);
	}

}
