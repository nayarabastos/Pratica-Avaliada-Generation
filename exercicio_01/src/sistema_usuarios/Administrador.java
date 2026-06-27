package sistema_usuarios;

public class Administrador extends Usuario {
	private String nivelDeAcesso;

	public Administrador(String nome, String email, String nivelDeAcesso) {
		super(nome, email);
		this.nivelDeAcesso = nivelDeAcesso;
		
	}
	
	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de Acesso: "+nivelDeAcesso);
	}
	
	
}
