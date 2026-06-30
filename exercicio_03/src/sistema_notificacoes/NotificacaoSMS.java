package sistema_notificacoes;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String telefone) {
		super(telefone);
	}

	@Override
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		String numero = getDestinatario();

		if (numero.length() == 11) {
			numero = "(" + numero.substring(0, 2) + ") " + numero.substring(2, 7) + "-" + numero.substring(7);
		}

		System.out.println("Enviando SMS para " + numero + " - Mensagem: " + mensagem);

	}

}