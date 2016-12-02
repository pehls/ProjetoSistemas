package exceptions;

public class ValidacaoLoginException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -986996863469234614L;

	public ValidacaoLoginException() {
		super("Usuário e/ou senha incorreto!");
	}
}
