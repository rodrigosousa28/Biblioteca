package exceptions;

public class NoBookFoundException extends RuntimeException{

	private static final long serialVersionUID = 7481715613616341605L;
	
	public String getMessage() {
		return "Voc� n�o tem nenhum livro no momento";
	}

}
