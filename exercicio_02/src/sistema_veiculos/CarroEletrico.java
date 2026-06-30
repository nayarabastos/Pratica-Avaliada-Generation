package sistema_veiculos;

public class CarroEletrico extends Carro {

	private int nivelBateria;
	public static final int CONSUMO_POR_ACELERACAO = 2;

	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		Validacao.validarBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		Validacao.validarBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	@Override
	public void acelerar(int valor) {

		Validacao.validarAceleracao(valor);

		int consumo = valor / CONSUMO_POR_ACELERACAO;

		Validacao.validarBateriaInsuficiente(nivelBateria, consumo);

		nivelBateria -= consumo;

		setVelocidade(getVelocidade() + valor);

	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível da bateria: " + nivelBateria);
	}
}
