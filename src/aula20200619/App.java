package aula20200619;


public class App {

	public static void main(String[] args) {

		Estacionamento estacionamento1 = new Estacionamento();

		Carro camaro = new Carro("Camaro", "AOJ9877", "Vermelho");
		camaro.setMarca("Chevrolet");

		Bicicleta traill = new Bicicleta("GTA", "Branca");
		traill.setMarca("GTA");

		PatineteEletrico gtx10 = new PatineteEletrico("GTX10", 40);
		gtx10.setMarca("Foston");

		estacionamento1.addveiculos(camaro);
		estacionamento1.addveiculos(traill);
		estacionamento1.addveiculos(gtx10);

		mostrarTudo(estacionamento1);

	}

	public static void mostrarTudo(Estacionamento e) {
		System.out.println("\n==================VEICULOS ESTACIONADOS=================");
		for (int i = 0; i < e.getVeiculos().size(); i++) {
			System.out.println("Marca: " + e.getVeiculos().get(i).getMarca());
		}
	}
}