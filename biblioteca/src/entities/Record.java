package entities;

public class Record {

	private Book book;
	private User user;
	private String beginDate;
	private String endDate;
	private Double debt;
	
	private String nameUser;
	private String nameBook;
	
	public Record(Book book, User user, String beginDate) {
		this.book = book;
		this.user = user;
		this.beginDate = beginDate;
	}
	
	public Double getDebt() {
		return debt;
	}
	
	public void setDebt(Double debt) {
		this.debt = debt;
	}
	
	public Record(String nameUser, String nameBook, String beginDate) {
		setNameUser(nameUser);
		setNameBook(nameBook);
		this.beginDate = beginDate;
	}
	
	public Record(User user, Book book, String beginDate, String endDate) {
		this.book = book;
		this.user = user;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public Record(String nameUser, String nameBook, String beginDate, String endDate) {
		this.nameUser = nameUser;
		this.nameBook = nameBook;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Book getBook() {
		return book;
	}

	public User getUser() {
		return user;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	
	
	
	
}
