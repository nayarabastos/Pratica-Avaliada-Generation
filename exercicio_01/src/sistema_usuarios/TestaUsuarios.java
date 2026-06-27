package sistema_usuarios;

public class TestaUsuarios {

	public static void main(String[] args) {
		
		usuarioValido();
		administradorValido();
		nomeVazio();
		emailInvalido();

	}
	
	static void usuarioValido() {
		System.out.println(">>>Caso 1: Usuário válido");
		try {		
			Usuario u = new Usuario("Nayara","nay@gmail.com");
			u.visualizar();
		}catch(Exception e) {
			System.err.println("Erro: "+e.getMessage());
		}
	}
	
	static void administradorValido() {
		System.out.println("\n>>>Caso 2: Administrador válido");
		try {		
			Administrador a = new Administrador("Nayara","nay@gmail.com","total");
			a.visualizar();
		}catch(Exception e) {
			System.err.println("Erro: "+e.getMessage());
		}
	}
	
	static void nomeVazio() {
		System.out.println("\n>>> Caso 3: Nome vazio");
		try {
			new Administrador("","nay@email.com","total");
		}catch(IllegalArgumentException e) {
			System.err.println("Erro: "+e.getMessage());
		}
	}
	
	static void emailInvalido() {
		System.out.println("\n>>> Caso 3: Email inválido");
		try {
			new Administrador("Nayara", "emailinvalido", "total"); // email inválido: sem @
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
