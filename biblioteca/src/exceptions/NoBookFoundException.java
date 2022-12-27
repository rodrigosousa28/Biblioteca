package exceptions;

public class NoBookFoundException extends RuntimeException{

	private static final long serialVersionUID = 7481715613616341605L;
	
	public String getMessage() {
		return "Você não tem nenhum livro no momento";
	}

}
