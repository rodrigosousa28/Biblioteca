package exceptions;

public class EmptyFieldException extends RuntimeException{

	private static final long serialVersionUID = 8101036937806616334L;

	public String getMessage() {
		return "N�o pode haver nenhum campo vazio";
	}
}
