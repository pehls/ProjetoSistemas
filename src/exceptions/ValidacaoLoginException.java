package exceptions;

public class ValidacaoLoginException extends Exception {
	public ValidacaoLoginException() {
		super("Usuário e/ou senha incorreto!");
	}
}
