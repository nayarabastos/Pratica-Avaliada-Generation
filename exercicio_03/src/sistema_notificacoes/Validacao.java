package sistema_notificacoes;

public class Validacao {

    public static void validarMensagem(String mensagem) {

        if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("A mensagem não pode ser vazia!");
        }

    }

    public static void validarDestinatario(String destinatario) {

        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("O destinatário não pode ser vazio!");
        }

        if (!(destinatario.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$")
                || destinatario.matches("^\\d{10,11}$"))) {

            throw new IllegalArgumentException("Digite um destinatário válido!");
        }

    }

}