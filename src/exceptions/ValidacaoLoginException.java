package exceptions;

public class ValidacaoLoginException extends Exception {
	public ValidacaoLoginException() {
		super("Usu�rio e/ou senha incorreto!");
	}
}
