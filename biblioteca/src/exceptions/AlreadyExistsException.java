package exceptions;

import entities.*;

public class AlreadyExistsException extends Exception{
	
	private static final long serialVersionUID = 5333845520776677524L;
	
	Object object;
	
	public AlreadyExistsException(Object object) {
		this.object = object;
	}
	
	public String getMessage() {
		if(object instanceof Book) {
			Book b = (Book) object;
			return "O livro " + b.getName() +" já existe";
		}
		if(object instanceof User) {
			User u = (User) object;
			return "O usuário "+ u.getUsername() + "existe";
		}
		return null;
	}
	
}
