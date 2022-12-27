package entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String cpf;
	private String registrationNumber;
	private String type;
	private String username;
	private String password;
	private List<Book> books;
	
	public User(String name, String cpf, String registrationNumber, String type, String login, String password) {
		this.name = name;
		this.cpf = cpf;
		this.registrationNumber = registrationNumber;
		this.type = type;
		this.username = login;
		this.password = password;
		this.books = new ArrayList<>();
	}
	
	//Used only to show informations
	public User(String name, String registrationNumber, String type, String login) {
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.type = type;
		this.username = login;
	}
	
	public String toString() {
		return name;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCPF() {
		return cpf;
	}

	//Returns the user's type, wich may be: Student, Professor or Administrator
	public String getType() {
		return type;
	}

	//This method can be used to change the user's type
	public void setType(String type) {
		this.type = type;
	}

	//This method will be used to make queries at databases
	public String getUsername() {
		return username;
	}

	//Only user(Professor or Student) can change it, never the Administrator
	public void setUsername(String username) {
		this.username = username;
	}
	
	//This method will be used to make queries at databases
	public String getPassword() {
		return password;
	}

	//Only user(Professor or Student) can change it, never the Administrator
	public void setPassword(String password) {
		this.password = password;
	}

	//This method will be used to make queries at databases
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
		
}
