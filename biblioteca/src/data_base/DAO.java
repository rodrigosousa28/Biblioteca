package data_base;

//Imports
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;

import entities.*;
import exceptions.AlreadyExistsException;
import menu.Functionalities;

//Data Access Object
public class DAO {
	
	private Connection connection;
	private ResultSet results;
	
	//Used to add a user to database
	public void insertUser(User user) throws SQLException, AlreadyExistsException {
		
		//Change to some specific Exception
		if(verifyIfExists(user)) {
			throw new AlreadyExistsException(user);
		}
		
		try {
			String query = "INSERT INTO users "
					+ "(full_name, cpf, registration_number, class, username, pass) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = getConnection().prepareStatement(query);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getCPF());
			stmt.setString(3, user.getRegistrationNumber());
			stmt.setString(4, user.getType());
			stmt.setString(5, user.getUsername());
			stmt.setString(6, user.getPassword());
			
			stmt.execute();
			
		} catch(SQLException e) {
			throw new RuntimeException();
		}
		
	}
	
	//Used to add a book to database
	public void insertBook(Book book) throws SQLException, AlreadyExistsException {
		
		//Change to some specific Exception
		if(verifyIfExists(book)) {
			throw new AlreadyExistsException(book);
		}
		
		try {
			String query = "INSERT INTO books "
					+ "(book_name, author, genre_one, genre_two, number_of_pages, stock_quantity, icon) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = getConnection().prepareStatement(query);
			stmt.setString(1, book.getName());
			stmt.setString(2, book.getAuthor());
			stmt.setString(3, book.getGenreOne());
			stmt.setString(4, book.getGenreTwo());
			stmt.setInt(5, book.getNumberOfPages());
			stmt.setInt(6, book.getStockQuantity());
			stmt.setBytes(7, book.getImage());
			
			stmt.execute();
			
		} catch(SQLException e) {
			throw new RuntimeException();
		}
		
	}
	
	//verify if an user exists on database
	private boolean verifyIfExists(User user) throws SQLException {
		
		String query = "SELECT * from `users` WHERE username = (?) AND registration_number = (?) AND cpf = (?);";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setString(1, user.getUsername());
		stmt.setString(2, user.getRegistrationNumber());
		stmt.setString(3, user.getCPF());
		
		ResultSet results = stmt.executeQuery();
		this.results = results;
		
		if(results.next())
			return true;
		
		return false;
	}
	
	public List<User> listAllUsers() throws SQLException{
		
		List<User> users = new ArrayList<>();
		
		String query = "SELECT * FROM `users`;";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			String login = results.getString("username");
			users.add(this.findUserByUsername(login));
		}
		
		return users;
	}
	
	//verify if a book exists on database
	private boolean verifyIfExists(Book book) throws SQLException {
		
		String query = "SELECT * from `books` WHERE book_name = (?);";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, book.getName());
		
		ResultSet results = stmt.executeQuery();
		this.results = results;
		
		if(results.next())
			return true;
		
		return false;
	}
	
	private void updateBook(Book book, String currentColumn, String newData) throws SQLException {
		String query = "UPDATE `books` SET "+currentColumn+" = ? WHERE book_name = ?;";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setString(1, newData);
		stmt.setString(2, book.getName());
		
		stmt.execute();
		stmt.close();
	}
	
	public void updateBookName(Book book, String newName) throws SQLException {
		updateBook(book, "book_name", newName);
	}
	
	public void updateBookAuthor(Book book, String author) throws SQLException {
		updateBook(book, "author", author);
	}
	
	public void updateBookPages(Book book, int newPages) throws SQLException {
		String query = "UPDATE `books` SET number_of_pages = ? WHERE book_name = ?;";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setInt(1, newPages);
		stmt.setString(2, book.getName());
		
		stmt.execute();
		stmt.close();
	}
	
	public void updateGenreOne(Book book, String newGenre) throws SQLException {
		updateBook(book, "genre_one", newGenre);
	}
	
	public void updateGenreTwo(Book book, String newGenre) throws SQLException {
		updateBook(book, "genre_two", newGenre);
	}
	
	public void deleteBook(Book book) throws SQLException {
		List<User> allUsers = this.listAllUsers();
		
		for(int i = 0; i < allUsers.size(); i++) {
			List<Book> booksByUser = this.findBooksByUser(allUsers.get(i));
			for(int j = 0; j < booksByUser.size(); j++) {
				if(booksByUser.get(j) != null) {
					if(booksByUser.get(j).equals(book)) {
						throw new SQLException();
					}					
				}
			}
		}
		
		
		String query = "UPDATE `books` SET enabled = 0 WHERE book_name = ?;";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setString(1, book.getName());
		stmt.execute();
		stmt.close();
		
	}
	
	public void updateBookStock(Book book, int newStock) throws SQLException {
		String query = "UPDATE `books` SET stock_quantity = ? WHERE book_name = ?;";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setInt(1, newStock);
		stmt.setString(2, book.getName());
		
		stmt.execute();
		stmt.close();
	}
	
	//Change a password of an user
	public void updatePassword(User user, String newPassword) throws SQLException {
		updateUser(user, "pass", newPassword);
	}

	//Change an username of an user
	public void updateUsername(User user, String newUsername) throws SQLException {
		updateUser(user, "username", newUsername);
	}
	
	//Change the registration number of an user
	public void updateRegistrationNumber(User user, String newRegistrationNumber) throws SQLException {
		updateUser(user, "registration_number", newRegistrationNumber);
	}
	
	public void updateName(User user, String newName) throws SQLException {
		updateUser(user, "full_name", newName);
	}

	//Used to help specifics updates
	private void updateUser(User user, String currentColumn, String newData) throws SQLException {
		String query = "UPDATE `users` SET "+currentColumn+" = ? WHERE cpf = ?;";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setString(1, newData);
		stmt.setString(2, user.getCPF());
		
		stmt.execute();
		stmt.close();
	}
	
	//Returns a list wich contains all books are current with an user
	public List<Book> findBooksByUser(User user) throws SQLException {
		List<Book> books = new ArrayList<>();
		
		if(verifyIfExists(user)) {
			String bookOneName = results.getString("current_book_one");
			String bookTwoName = results.getString("current_book_two");
			String bookThreeName = results.getString("current_book_three");
				
			Book bookOne = findBookByName(bookOneName);
			Book bookTwo = findBookByName(bookTwoName);
			Book bookThree = findBookByName(bookThreeName);
				
			
			books.add(bookOne);
			books.add(bookTwo);
			books.add(bookThree);

			user.setBooks(books);	
		}
		
		return books;
	}
	
	private Book findBookById(int idBook) throws SQLException {
		Book book = null;
		String query = "SELECT * FROM `books` WHERE code = (?);";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setInt(1, idBook);
		
		ResultSet results = stmt.executeQuery();
		
		if(results.next()) {
			String bookName = results.getString("book_name");
			book = this.findBookByName(bookName);
		}
		return book;
	}
	
	public int getBooksQuantity(List<Book> booksByUser) {
		int quantity = 0;
		
		for(Book book: booksByUser) {
			if(!(book == null)) 
				quantity++;
		}
		return quantity;
	}

	//Return a list of books with stock > 0
	public List<Book> availableBooks() throws SQLException{
		
		List<Book> availableBooks = new ArrayList<>();
		String query = "SELECT * FROM `books` WHERE stock_quantity > 0";
		
		PreparedStatement stmt = getConnection().prepareStatement(query);
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			String bookName = results.getString("book_name");
			String authorName = results.getString("author");
			String genreOne = results.getString("genre_one");
			String genreTwo = results.getString("genre_two");
			int numberOfPages = results.getInt("number_of_pages");
			int stockQuantity = results.getInt("stock_quantity");
			byte[] icon = results.getBytes("icon");
			Book book = new Book(bookName, authorName, genreOne, genreTwo, numberOfPages, stockQuantity, icon);
			
			availableBooks.add(book);
		}
		
		return availableBooks;
	}

	//Suggest a list of books, with same authors and/or genres
	public List<Book> suggestBooks(Book book) throws SQLException{
		//Books with same author
		String author = book.getAuthor();
		String genreOne = book.getGenreOne();
		String genreTwo = book.getGenreTwo();
		
		List<Book> booksByAuthor = findBooksByAuthor(author);
		
		//Books with same genres
		List<Book> booksByGenreOne = findBooksByGenre(genreOne);
		List<Book> booksByGenreTwo = findBooksByGenre(genreTwo);
		
		//Add all lists in one
		List<Book> booksPrimary = new ArrayList<>();
		
		booksPrimary.addAll(booksByAuthor);
		booksPrimary.addAll(booksByGenreOne);
		booksPrimary.addAll(booksByGenreTwo);
		
		//Remove duplicate books
		List<Book> booksFinal = new ArrayList<>();
		for(Book b: booksPrimary) {
			if(!booksFinal.contains(b)) {
				booksFinal.add(b);
			}
		}
		
		//Remove the book wich is the instance of this method
		booksFinal.remove(book);
		
		return booksFinal;
	}
	
	//Returns a list of books with the same genres
	public List<Book> findBooksByGenre(String genre) throws SQLException{
		List<Book> booksByGenre = new ArrayList<>();
		
		String query = "SELECT * FROM `books` WHERE genre_one = (?) OR genre_two = (?)";
		
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, genre);
		stmt.setString(2, genre);
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			String bookName = results.getString("book_name");
			String authorName = results.getString("author");
			String genreOne = results.getString("genre_one");
			String genreTwo = results.getString("genre_two");
			int numberOfPages = results.getInt("number_of_pages");
			int stockQuantity = results.getInt("stock_quantity");
			byte[] icon = results.getBytes("icon");
			Book book = new Book(bookName, authorName, genreOne, genreTwo, numberOfPages, stockQuantity, icon);
			byte enabled = results.getByte("enabled");
			book.setEnabled(enabled);
			
			booksByGenre.add(book);
		}
		return booksByGenre;
	}
	
	//Returns a list of books with the same author
	public List<Book> findBooksByAuthor(String author) throws SQLException{
		List<Book> booksByAuthor = new ArrayList<>();
		
		String query = "SELECT * FROM `books` WHERE author LIKE (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, "%"+author+"%");
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			String bookName = results.getString("book_name");
			String authorName = results.getString("author");
			String genreOne = results.getString("genre_one");
			String genreTwo = results.getString("genre_two");
			int numberOfPages = results.getInt("number_of_pages");
			int stockQuantity = results.getInt("stock_quantity");
			byte[] icon = results.getBytes("icon");
			Book book = new Book(bookName, authorName, genreOne, genreTwo, numberOfPages, stockQuantity, icon);
			byte enabled = results.getByte("enabled");
			book.setEnabled(enabled);
			
			booksByAuthor.add(book);
		}
		return booksByAuthor;
	}
	
	//Returns a book, if it's on database
	public Book findBookByName(String name) throws SQLException {
		
		Book book = null;
		String query = "SELECT * FROM `books` WHERE book_name = (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, name);
		ResultSet results = stmt.executeQuery();
		
		if(results.next()) {
			String bookName = results.getString("book_name");
			String author = results.getString("author");
			String genreOne = results.getString("genre_one");
			String genreTwo = results.getString("genre_two");
			int numberOfPages = results.getInt("number_of_pages");
			int stockQuantity = results.getInt("stock_quantity");
			byte[] icon = results.getBytes("icon");
			book = new Book(bookName, author, genreOne, genreTwo, numberOfPages, stockQuantity, icon);
			byte enabled = results.getByte("enabled");
			book.setEnabled(enabled);
		}
		
		stmt.close();
		return book;
	}

	//Used to find an user by its username on database
	public User findUserByUsername(String username) throws SQLException {
		
		User user = null;
		String query = "SELECT * FROM `users` WHERE username = (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, username);
		ResultSet results = stmt.executeQuery();
		
		if(results.next()) {
			String fullName = results.getString("full_name");
			String cpf = results.getString("cpf");
			String registrationNumber = results.getString("registration_number");
			String type = results.getString("class");
			String userName = results.getString("username");
			String pass = results.getString("pass");
			
			String currentBookOneName = results.getString("current_book_one");
			String currentBookTwoName = results.getString("current_book_two");
			String currentBookThreeName = results.getString("current_book_three");
			
			Book currentBookOne = findBookByName(currentBookOneName);
			Book currentBookTwo = findBookByName(currentBookTwoName);
			Book currentBookThree = findBookByName(currentBookThreeName);
			 	
			user = new User(fullName, cpf, registrationNumber, type, userName, pass);
			
			user.addBook(currentBookOne);
			user.addBook(currentBookTwo);
			user.addBook(currentBookThree);
		}
		
		return user;

	}
	
	//Used to find an user by its registrarion number on database
	public User findUserByRegistrationNumber(String registrationNumber) throws SQLException {
		User user = null;
		String query = "SELECT * FROM `users` WHERE registration_number = (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, registrationNumber);
		ResultSet results = stmt.executeQuery();
		
		if(results.next()) {
			String fullName = results.getString("full_name");
			String cpf = results.getString("cpf");
			String registNumber = results.getString("full_name");
			String type = results.getString("full_name");
			String userName = results.getString("full_name");
			String pass = results.getString("full_name");
			
			String currentBookOneName = results.getString("current_book_one");
			String currentBookTwoName = results.getString("current_book_two");
			String currentBookThreeName = results.getString("current_book_three");
			
			Book currentBookOne = findBookByName(currentBookOneName);
			Book currentBookTwo = findBookByName(currentBookTwoName);
			Book currentBookThree = findBookByName(currentBookThreeName);
			
			user = new User(fullName, cpf, registNumber, type, userName, pass);
			
			user.addBook(currentBookOne);
			user.addBook(currentBookTwo);
			user.addBook(currentBookThree);
		}
		return user;
	}
	
	//Used to reduce stock quantity of an specific book on database
	private boolean reduceStock(Book book) throws SQLException {
		
		if(availableToReduce(book)) {
			book.setStockQuantity(-1);
			String query = "UPDATE `books` SET stock_quantity = stock_quantity-1 WHERE book_name = (?);";
			PreparedStatement stmt = getConnection().prepareStatement(query);
			stmt.setString(1, book.getName());
			stmt.execute();
			stmt.close();
			return true;
		}
		return false;
	}
	
	//Used to verify if stock can me reduced
	private boolean availableToReduce(Book book) throws SQLException {
		Book bookTest = findBookByName(book.getName());
		
		if(bookTest != null && bookTest.getStockQuantity() > 0) {
			return true;
		}
		return false;
	}
	
	//Used to increase stock quantity of an specific book on database
	public void increaseStock(Book book) throws SQLException {
		Book bookTest = findBookByName(book.getName());
		
		if(bookTest != null) {
			String query = "UPDATE `books` SET stock_quantity = stock_quantity+1 WHERE book_name = (?);";
			book.setStockQuantity(1);
			PreparedStatement stmt = getConnection().prepareStatement(query);
			stmt.setString(1, book.getName());
			stmt.execute();
			stmt.close();			
		}
	}
	
	//Returns true if book can be lended to the user
	public boolean lendBook(Book book, User user, String ftfDate) throws SQLException, ParseException {
		boolean userExists = verifyIfExists(user);
		boolean bookExists = verifyIfExists(book);
		
		ArrayList<Book> books = (ArrayList<Book>) findBooksByUser(user);
		int qtd = 0;
		for(Book b: books) {
			if(b != null)
				qtd++;
		}
		
		if(userExists && bookExists && availableToReduce(book)) {
			
			if(qtd < allowedQuantity(user)) {
				user.addBook(book);
				String complemento = "";
				
				for(int i = 0; i < books.size(); i++) {
					
					if(books.get(i) == null) {
						if(i == 0) {
							complemento = "one";
						}else if(i == 1) {
							complemento = "two";
						}else if(i == 2) {
							complemento = "three";
						}
						break;
					}
				}
				
				String query = "UPDATE `users` SET current_book_".concat(complemento)+" = (?) "
						+ "WHERE registration_number = (?)";
				
				PreparedStatement stmt = getConnection().prepareStatement(query);
				stmt.setString(1, book.getName());
				stmt.setString(2, user.getRegistrationNumber());
				stmt.execute();
				stmt.close();
				
				reduceStock(book);
				insertRecord(user, book, ftfDate);
				return true;
			}
			return false;
		}
		return false;
	}
	
	//Returns a book to the library
	public void returnBook(Book book, User user, String ftfDate) throws SQLException, ParseException {
		boolean userExists = verifyIfExists(user);
		boolean bookExists = verifyIfExists(book);
		
		List<Book> books = findBooksByUser(user);
		boolean userIsWithBook = books.contains(book);
		
		if(userExists && bookExists && userIsWithBook) {
			String query = "SELECT * FROM `users` WHERE username = (?)";
			PreparedStatement stmt = getConnection().prepareStatement(query);
			
			stmt.setString(1, user.getUsername());
			
			ResultSet results = stmt.executeQuery();
			
			String lastQuery = "";
			
			if(results.next()) {
				String bookOne = results.getString("current_book_one");
				String bookTwo = results.getString("current_book_two");
				String bookThree = results.getString("current_book_three");
				
				
				if(bookOne != null) {
					if(bookOne.equals(book.getName())) {
						lastQuery = "UPDATE `users` SET current_book_one = NULL WHERE username = (?) AND registration_number = (?)";
					}
				}
				
				if(bookTwo != null) {
					if(bookTwo.equals(book.getName())) {
						lastQuery = "UPDATE `users` SET current_book_two = NULL WHERE username = (?) AND registration_number = (?)";
					}
				}
				if(bookThree != null) {
					if(bookThree.equals(book.getName())) {
						lastQuery = "UPDATE `users` SET current_book_three = NULL WHERE username = (?) AND registration_number = (?)";					
					}	
				}
				
				
				PreparedStatement prepStmt = getConnection().prepareStatement(lastQuery);
				prepStmt.setString(1, user.getUsername());
				prepStmt.setString(2, user.getRegistrationNumber());
				
				prepStmt.execute();
				
				increaseStock(book);
				finishRecord(user, book, ftfDate);
				
				prepStmt.close();
				stmt.close();
			}
		}
	}
	
	//Returns how many books a type of user is allowed to get
	private int allowedQuantity(User user) throws SQLException {
		String type = user.getType();
		int qtd = 0;
		
		switch(type) {
		case "Administrator":
			qtd = 3;
			break;
		case "Professor":
			qtd = 3;
			break;
		case "Student":
			qtd = 2;
			break;
		}
		
		return qtd;
	}

	//Used to support method lendBook 
	private void insertRecord(User user, Book book, String ftfDate) throws SQLException, ParseException {

		int userID = findId(user);
		int bookID = findId(book);
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date beginDate = formatDate.parse(ftfDate);
		
		String query = "INSERT INTO `records` (user_id, book_id, begin_date) VALUES (?, ?, ?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setInt(1, userID);
		stmt.setInt(2, bookID);
		stmt.setDate(3, new java.sql.Date(beginDate.getTime()));
		
		stmt.execute();
		stmt.close();
		
	}
	
	void insertDebtAtRecord(entities.Record record) throws SQLException, ParseException {
		String query = "UPDATE `records` SET debt = (?) WHERE book_id = (?) AND user_id = (?) AND begin_date = (?)";
		Book book = record.getBook();
		User user = record.getUser();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date initDate = formatDate.parse(record.getBeginDate());
		int bookID = this.findId(book);
		int userID = this.findId(user);
		
		Double debt = Functionalities.calculateTaxe(record);
		
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setDouble(1, debt);
		stmt.setDouble(2, bookID);
		stmt.setDouble(3, userID);
		stmt.setDate(4, new java.sql.Date(initDate.getTime()));
		
		stmt.execute();
	}
	
	public double totalDebtByUser(User user, boolean currentDebt) throws SQLException {
		double debt = 0.0;
		List<entities.Record> records = this.findRecordsByItem(user, currentDebt);
		for(int i = 0; i < records.size(); i++) {
			debt += records.get(i).getDebt();
		}
		
		return debt;
	}
	
	public List<Book> listAllBooks(boolean onlyAvailable) throws SQLException{
		String query = "SELECT * FROM `books` WHERE enabled = 1";
		
		if(onlyAvailable) {
			query = query.concat(" AND stock_quantity > 0");
		}
		
		List<Book> availableBooks = new ArrayList<>();
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			String name = results.getString("book_name");
			Book book = this.findBookByName(name);
			
			availableBooks.add(book);
		}
		
		return availableBooks;
	}
	
	public List<Book> listBooksByName(String name) throws SQLException{
		String query = "SELECT * FROM `books` WHERE book_name LIKE (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, "%"+name+"%");
		List<Book> books = new ArrayList<>();
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			String nameBook = results.getString("book_name");
			Book book = this.findBookByName(nameBook);
			byte enabled = results.getByte("enabled");
			book.setEnabled(enabled);
			if(book.getEnabled() != 0)
				books.add(book);
		}

		return books;
	}
	
	/*public List<User> listAllUsersWithoutDebt() throws SQLException{
		List<User> users = this.listAllUsers();
		
		List<User> usersNoDebt = new ArrayList<>();
		
		for(int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			User userFinal = this.findUserByUsername(user.getUsername());
			
			List<Book> books = this.findBooksByUser(userFinal);
			double debt = 0;
			for(int j = 0; j < books.size(); j++) {
				if(books.get(j) != null)
					debt += Functionalities.calculateTaxe(userFinal, books.get(j));
			}
			
			if(!(debt > 0)) {
				usersNoDebt.add(userFinal);
			}
			
		}
		
		return usersNoDebt;
	}*/
	
	public List<User> listAllUsersWithoutDebt() throws SQLException{
		List<User> usersNoDebt = new ArrayList<>();
		String query = "SELECT * FROM `users` WHERE current_debt = 0";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		ResultSet results = stmt.executeQuery();
		while(results.next()) {
			String username = results.getString("username");
			usersNoDebt.add(this.findUserByUsername(username));
		}
		return usersNoDebt;
	}
		
	public void cleanDebt(User user, Book book) throws SQLException{
		String query = "UPDATE `records` SET debt = 0 WHERE user_id = (?) AND book_id = (?) AND end_date IS NULL";
		
		int userID = this.findId(user);
		int bookID = this.findId(book);
		
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setInt(1, userID);
		stmt.setInt(2, bookID);
		
		stmt.execute();
		stmt.close();
		
	}
	
	public User findUserByName(String name) throws SQLException{
		String query = "SELECT full_name, registration_number, class, username FROM `users` WHERE full_name LIKE (?)";
		User user = null;
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, "%"+name+"%");
		
		ResultSet results = stmt.executeQuery();
		
		//First of this list
		if(results.next()) {
			String nameUser = results.getString("full_name");
			String regNumber = results.getString("registration_number");
			String type =  results.getString("class");
			String login =  results.getString("username");
			
			user = new User(nameUser, regNumber, type, login);
		}

		return user;
	}
	
	//Returns the quantity of days an user got an specific book
	public int daysLate(entities.Record record) throws SQLException, ParseException {
		Book book = record.getBook();
		User user = record.getUser();
		String beginDateTxt = record.getBeginDate();
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date initDate = formatDate.parse(beginDateTxt);
		
		int bookID = findId(book);
		int userID = findId(user);
		
		String query = "SELECT * FROM `records` WHERE book_id = (?) AND user_id = (?) AND begin_date = (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setInt(1, bookID);
		stmt.setInt(2, userID);
		stmt.setDate(3, new java.sql.Date(initDate.getTime()));
		
		ResultSet results = stmt.executeQuery();
		java.sql.Date beginDateSql = null;
		java.sql.Date endDateSql = null;
		
		int daysLate = 0;
		
		if(results.next()) {
			beginDateSql = results.getDate("begin_date");
			Integer beginYear = Integer.parseInt(beginDateSql.toString().substring(0, 4));
			Integer beginMonth = Integer.parseInt(beginDateSql.toString().substring(5, 7));
			Integer beginDay = Integer.parseInt(beginDateSql.toString().substring(8, 10));
			
			DateTimeZone beginTimeZone = DateTimeZone.forID("GMT");
	        DateTime beginDate = new DateTime(beginYear, beginMonth, beginDay, 0, 0, beginTimeZone);
	        DateTime currentDate = new DateTime();
	        
	        endDateSql = results.getDate("end_date");
	        if(endDateSql != null) {
	        	Integer endYear = Integer.parseInt(endDateSql.toString().substring(0, 4));
	        	Integer endMonth = Integer.parseInt(endDateSql.toString().substring(5, 7));
	        	Integer endDay = Integer.parseInt(endDateSql.toString().substring(8, 10));
	        	
	        	DateTimeZone endTimeZone = DateTimeZone.forID("GMT");
	        	DateTime endDate = new DateTime(endYear, endMonth, endDay, 0, 0, endTimeZone);
	        	
	        	daysLate = Days.daysBetween(beginDate, endDate).getDays();
	        	
	        } else {
	        	daysLate = Days.daysBetween(beginDate, currentDate).getDays() - 1;	        	
	        }	        
	        
		}
		
		stmt.close();
		return daysLate;
	}
	
	public List<entities.Record> findRecordsByItem(Object object, boolean current) throws SQLException{
		int id = 0;
		
		List<entities.Record> records = new ArrayList<>();
		String query = null;

		if(object instanceof Book) {
			id = findId((Book) object);
			query = "SELECT * FROM `records` WHERE book_id = (?)";
		}
		
		else if(object instanceof User) {
			id = findId((User) object);
			query = "SELECT * FROM `records` WHERE user_id = (?)";
		}
		
		if(current) {
			query = query.concat(" AND end_date IS NULL;");
		}
		
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setInt(1, id);
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			
			int bookIdRecord = results.getInt("book_id");
			int userIdRecord = results.getInt("user_id");
			
			Book book = this.findBookById(bookIdRecord);
			User user = this.findUserById(userIdRecord);
			
			java.sql.Date beginDateSql = results.getDate("begin_date");
			Integer year = Integer.parseInt(beginDateSql.toString().substring(0, 4));
			Integer month = Integer.parseInt(beginDateSql.toString().substring(5, 7));
			Integer day = Integer.parseInt(beginDateSql.toString().substring(8, 10));
			
			String beginDateTxt = 
					Integer.toString(day)
					.concat("/")
					.concat(Integer.toString(month)
					.concat("/")
					.concat(Integer.toString(year)));
			
			java.sql.Date endDateSql = results.getDate("end_date");
			String endDateTxt;
			
			if(endDateSql != null) {
				Integer endYear = Integer.parseInt(endDateSql.toString().substring(0, 4));
				Integer endMonth = Integer.parseInt(endDateSql.toString().substring(5, 7));
				Integer endDay = Integer.parseInt(endDateSql.toString().substring(8, 10));
				
				endDateTxt = 
						Integer.toString(endDay)
						.concat("/")
						.concat(Integer.toString(endMonth)
								.concat("/")
								.concat(Integer.toString(endYear)));
			}else {
				endDateTxt = "Ainda não devolvido";
			}
			
			entities.Record record = new entities.Record(user, book, beginDateTxt, endDateTxt);
			record.setNameUser(user.getName());
			record.setNameBook(book.getName());
			double debt = Functionalities.calculateTaxe(record);
			record.setDebt(debt);
			records.add(record);
		}
		
		return records;
	}

	
	public List<entities.Record> findAllRecords() throws SQLException{
		String query = "SELECT * FROM `records`";
		List<entities.Record> records = new ArrayList<>();
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			int bookID = results.getInt("book_id");
			int userID = results.getInt("user_id");
			
			Book book = this.findBookById(bookID);
			User user = this.findUserById(userID);
			
			
			java.sql.Date beginDateSql = results.getDate("begin_date");
			
			Integer beginYear = Integer.parseInt(beginDateSql.toString().substring(0, 4));
			Integer beginMonth = Integer.parseInt(beginDateSql.toString().substring(5, 7));
			Integer beginDay = Integer.parseInt(beginDateSql.toString().substring(8, 10));
			
			String beginDateTxt = 
					Integer.toString(beginDay)
					.concat("/")
					.concat(Integer.toString(beginMonth)
					.concat("/")
					.concat(Integer.toString(beginYear)));
			
			java.sql.Date endDateSql = results.getDate("end_date");
			String endDateTxt;
			
			if(endDateSql != null) {
				Integer endYear = Integer.parseInt(endDateSql.toString().substring(0, 4));
				Integer endMonth = Integer.parseInt(endDateSql.toString().substring(5, 7));
				Integer endDay = Integer.parseInt(endDateSql.toString().substring(8, 10));
				
				endDateTxt = 
						Integer.toString(endDay)
						.concat("/")
						.concat(Integer.toString(endMonth)
								.concat("/")
								.concat(Integer.toString(endYear)));
			}else {
				endDateTxt = "Ainda não devolvido";
			}
			
			entities.Record record = new entities.Record(user, book, beginDateTxt, endDateTxt);
			record.setNameUser(user.getName());
			record.setNameBook(book.getName());
			double debt = Functionalities.calculateTaxe(record);
			record.setDebt(debt);
			records.add(record);
		}
		
		return records;
	}
	
	public User findUserByCPF(String cpf) throws SQLException {
		User user = null;
		String query = "SELECT * FROM `users` WHERE cpf = (?);";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setString(1, cpf);
		ResultSet results = stmt.executeQuery();
		
		if(results.next()) {
			String username = results.getString("username");
			user = this.findUserByUsername(username);
		}
		
		return user;
	}

	public User findUserById(int idUser) throws SQLException {
		User user = null;
		String query = "SELECT * FROM `users` WHERE code = (?);";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setInt(1, idUser);
		
		ResultSet results = stmt.executeQuery();
		
		if(results.next()) {
			String username = results.getString("username");
			user = this.findUserByUsername(username);
		}
		
		return user;
	}
	
	//Used to support method returnBook
	private void finishRecord(User user, Book book, String ftfDate) throws SQLException, ParseException {
		int userID = findId(user);
		int bookID = findId(book);
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date endDate = formatDate.parse(ftfDate);
		
		String query = "UPDATE `records` SET end_date = (?) WHERE book_id = (?) AND user_id = (?) AND end_date IS NULL";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		
		stmt.setDate(1, new java.sql.Date(endDate.getTime()));
		stmt.setInt(2, bookID);
		stmt.setInt(3, userID);
		
		stmt.execute();
		stmt.close();
	}
	
	//Used to find an user ID on database
	private int findId(User user) throws SQLException {
		String query = "SELECT * FROM `users` WHERE registration_number = (?) AND cpf = (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, user.getRegistrationNumber());
		stmt.setString(2, user.getCPF());
		
		ResultSet results = stmt.executeQuery();
		
		int id = 0;
		if(results.next()) {
			id = results.getInt("code");
		}
		
		return id;
	}
	
	//Used to find a book ID on database
	private int findId(Book book) throws SQLException {
		String query = "SELECT * FROM `books` WHERE book_name = (?)";
		PreparedStatement stmt = getConnection().prepareStatement(query);
		stmt.setString(1, book.getName());
		
		ResultSet results = stmt.executeQuery();
		
		int id = 0;
		if(results.next()) {
			id = results.getInt("code");
		}
		
		return id;
	}
	
	//Used to close connection with database
	public void close() {
		try {
			getConnection().close();
		} catch(SQLException e) {
			
		} finally {
			connection = null;
		}
	}
	
	//Starts a new connection with database
	private Connection getConnection() {
		try {
			if(connection != null && !connection.isClosed()) {
				return connection;
			}
		} catch (SQLException e) {
			
		}
		
		connection = DataBase.getConexao();
		return connection;
	}
}
