package sistema_notificacoes;

public class TestaNotificacoes {

	public static void criarNotificacao(String tipo, String destinatario, String mensagem) {

		try {

			Notificacao notificacao;

			switch (tipo.toUpperCase()) {

			case "EMAIL":
				notificacao = new NotificacaoEmail(destinatario);
				break;

			case "SMS":
				notificacao = new NotificacaoSMS(destinatario);
				break;

			default:
				throw new IllegalArgumentException("Tipo de notificação inexistente!");

			}

			notificacao.enviar(mensagem);

		} catch (IllegalArgumentException e) {

			System.out.println("Erro: " + e.getMessage());

		}

	}

	public static void testeEmailValido() {

		criarNotificacao("Email", "ana@email.com", "Bem-vindo ao sistema!");

	}

	public static void testeSMSValido() {

		criarNotificacao("SMS", "11988887777", "Seu código é 1234");

	}

	public static void testeMensagemVazia() {

		criarNotificacao("Email", "ana@email.com", "");

	}

	public static void testeDestinatarioVazio() {

		criarNotificacao("SMS", "", "Olá!");

	}

	public static void testeTipoInvalido() {

		criarNotificacao("WhatsApp", "11988887777", "Olá!");

	}

	public static void main(String[] args) {

		System.out.println("\n>>> Caso 1: E-mail válido");
		testeEmailValido();

		System.out.println("n>>> Caso 2: SMS válido");
		testeSMSValido();

		System.out.println("\n>>> Caso 3: Mensagem vazia");
		testeMensagemVazia();

		System.out.println("\n>>> Caso 4: Destinatário vazio");
		testeDestinatarioVazio();

		System.out.println("\n>>> Caso 5: Tipo inválido");
		testeTipoInvalido();

	}

}