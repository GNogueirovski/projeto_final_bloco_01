package periferico.model;

public class PerifericoTeclado extends Periferico {
	private boolean construcaoteclado;
	private boolean rgbteclado;

	public PerifericoTeclado(int idproduto, int tipo, String nomeproduto,String marcaproduto, float preco, int estoque, boolean construcaoteclado, boolean rgbteclado)
	{
		super(idproduto, tipo, marcaproduto, nomeproduto, preco, estoque);
		this.construcaoteclado = construcaoteclado;
		this.rgbteclado = rgbteclado;

	}


	public boolean isConstrucaoteclado() {
		return construcaoteclado;
	}

	public void setConstrucaoteclado(boolean construcaoteclado) {
		this.construcaoteclado = construcaoteclado;
	}

	public boolean getRgbteclado() {
		return rgbteclado;
	}

	public void setRgbteclado(boolean rgbteclado) {
		this.rgbteclado = rgbteclado;
	}

	public void visualizar() {
		super.visualizar();
		String rgbtexto;
		String construcao;
		if (rgbteclado = true) {
			rgbtexto = "Sim";
		} else {
			rgbtexto = "Não";
		}
		if (construcaoteclado = true) {
			construcao = "Mecânico";
		} else {
			construcao = "Membrana";
		}

		System.out.printf("Teclado é mecânico ou de membrana: %s\n", construcao);
		System.out.printf("Teclado com RGB: %s possui\n", rgbtexto);
		

	}
}
