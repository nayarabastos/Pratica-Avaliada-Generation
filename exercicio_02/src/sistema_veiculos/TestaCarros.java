package sistema_veiculos;

public class TestaCarros {

	public static void criarCarroEletrico(String modelo, int velocidade, int bateria, int aceleracao) {

		try {

			CarroEletrico carro = new CarroEletrico(modelo, velocidade, bateria);
			carro.acelerar(aceleracao);
			carro.visualizar();

		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());

		}

	}

	public static void testeCriacao() {
		criarCarroEletrico("Tesla Model 3", 0, 20, 30);

	}

	public static void testeAceleracaoInvalida() {
		criarCarroEletrico("Tesla", 0, 50, -10);

	}

	public static void testeBateriaInsuficiente() {
		criarCarroEletrico("BYD Dolphin", 0, 10, 30);

	}

	public static void testeBateriaNegativa() {
		criarCarroEletrico("Volvo EX30", 0, -5, 10);

	}

	public static void testeBateriaAcima100() {

		criarCarroEletrico("BMW i4", 0, 120, 10);

	}

	public static void main(String[] args) {

		System.out.println(">>> Caso 1: Carro Elétrico");
		testeCriacao();

		System.out.println("\n>>> Caso 2: Aceleração inválida");
		testeAceleracaoInvalida();

		System.out.println("\n>>> Caso 3: Bateria insulficiente");
		testeBateriaInsuficiente();

		System.out.println("\n>>> Caso 4: Nível de bateria negativo");
		testeBateriaNegativa();

		System.out.println("\n>>> Caso 5: Nível de bateria acima de 100%");
		testeBateriaAcima100();

	}

}