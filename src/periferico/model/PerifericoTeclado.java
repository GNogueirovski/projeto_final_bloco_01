package periferico.model;

public class PerifericoTeclado extends Periferico {
	private String construcaoteclado;
	private String rgbteclado;

	public PerifericoTeclado(int idproduto, int tipo, String marcaproduto,String nomeproduto, float preco, int estoque, String construcaoteclado, String rgbteclado)
	{
		super(idproduto, tipo, marcaproduto, nomeproduto, preco, estoque);
		this.construcaoteclado = construcaoteclado;
		this.rgbteclado = rgbteclado;

	}


	public String isConstrucaoteclado() {
		return construcaoteclado;
	}

	public void setConstrucaoteclado(String construcaoteclado) {
		this.construcaoteclado = construcaoteclado;
	}

	public String getRgbteclado() {
		return rgbteclado;
	}

	public void setRgbteclado(String rgbteclado) {
		this.rgbteclado = rgbteclado;
	}

	public void visualizar() {
		super.visualizar();
		System.out.printf("Teclado é mecânico ou de membrana: %s\n", this.construcaoteclado);
		System.out.printf("Teclado com RGB: %s\n", this.rgbteclado);
		

	}
}
