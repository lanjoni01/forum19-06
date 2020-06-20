package aula20200619;

public class PatineteEletrico extends Veiculo {
	
	private String nome;
	private int potenciaMotorEletrico;
	
	
	public PatineteEletrico(String nome, int potenciaMotorEletrico) {
		super();
		this.nome = nome;
		this.potenciaMotorEletrico = potenciaMotorEletrico;
	}


	public String getNome() {
		return nome;
	}


	public int getPotenciaMotorEletrico() {
		return potenciaMotorEletrico;
	}

}
