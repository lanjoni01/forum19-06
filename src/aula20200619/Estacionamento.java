package aula20200619;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public void addveiculos(Veiculo v) {
		veiculos.add(v);
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	
}