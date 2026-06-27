package sistema_usuarios;

public class Usuario {
	public Usuario(String nome, String email) {
		
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		
		this.nome = nome;
		this.email = email;
	}
	private String nome;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome);
		System.out.println("E-mail: "+email);
	}
}




