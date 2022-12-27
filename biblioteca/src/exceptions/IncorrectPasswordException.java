package exceptions;

public class IncorrectPasswordException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Senha incorreta";
	}

}
