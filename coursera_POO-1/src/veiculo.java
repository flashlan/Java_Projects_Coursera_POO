
public class veiculo {
	private int anoDeFabricacao;
	private String marca;
	private String modelo;

	//contructor
	veiculo(int adf, String m, String model) {
		anoDeFabricacao = adf;
		marca = m;
		modelo = model;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	
}
