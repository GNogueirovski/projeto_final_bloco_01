package periferico.model;

public class PerifericoMouse extends Periferico {
	private int dpimouse;
	
	
	public PerifericoMouse(int idproduto, int tipo, String marcaproduto, String nomeproduto, float preco, int estoque, int dpimouse) {
		super(idproduto, tipo, marcaproduto, nomeproduto, preco, estoque);
		this.dpimouse = dpimouse;

	}


	public int getDpimouse() {
		return dpimouse;
	}


	public void setDpimouse(int dpimouse) {
		this.dpimouse = dpimouse;
	}

	public void visualizar() {
		super.visualizar();
		System.out.printf("DPI do Mouse: %d DPI\n", this.dpimouse);
		

	}
	
}
