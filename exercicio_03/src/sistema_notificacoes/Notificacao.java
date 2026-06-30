package sistema_notificacoes;

public class Notificacao {
	String destinatario;

	public Notificacao(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}
	
	public void enviar(String mensagem) {
		System.out.println("Mensagem: "+mensagem);
	} 
}
