package exceptions;

public class InvalidCpfException extends Exception{

	private static final long serialVersionUID = -8107675296483447728L;
	
	public String getMessage() {
		return "CPF Inválido";
	}

}
