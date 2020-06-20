package aula20200619;

public class Bicicleta extends Veiculo {
	
	private String nome;
	private String cor;
	
	public Bicicleta(String nome, String cor) {
		super();
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}	
	

	public String getCor() {
		return cor;
	}
}