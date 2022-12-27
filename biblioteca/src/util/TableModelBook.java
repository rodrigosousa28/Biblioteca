package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entities.Book;

public class TableModelBook extends AbstractTableModel{

	private static final long serialVersionUID = 7601531852533368103L;

private List<Book> books;
	
	private String[] columns = {"Nome", "Autor", "Gênero 1", "Gênero 2", "Páginas", "Estoque"};
	
	public TableModelBook(List<Book> books) {
		this.books = books;
	}

	@Override
	public int getRowCount() {
		return books.size();
	}

	
	@Override
	public int getColumnCount() {
		return columns.length;
	}

	
	@Override
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex){
		return String.class;
	}
	

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Book book = books.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			book.setName(aValue.toString());
		case 1:
			book.setAuthor(aValue.toString());
		case 2:
			book.setGenreOne(aValue.toString());
		case 3:
			book.setGenreTwo(aValue.toString());
		case 4:
			book.setPages(Integer.parseInt((String) aValue));
		case 5:
			book.setStockQuantity(Integer.parseInt((String) aValue));
		}
	}
	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Book selectedBook = books.get(rowIndex);
		Object valueObject = null;
		
		switch(columnIndex) {
		case 0:
			valueObject = selectedBook.getName();
			break;
		case 1:
			valueObject = selectedBook.getAuthor();
			break;
		case 2:
			valueObject = selectedBook.getGenreOne();
			break;
		case 3:
			valueObject = selectedBook.getGenreTwo();
			break;
                case 4:
                        valueObject = selectedBook.getNumberOfPages();
                        break;
                case 5:
                        valueObject = selectedBook.getStockQuantity();
                    
		}
		
		return valueObject;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	public Object getSelected(int rowIndex) {
		return books.get(rowIndex);
	}
	
	public void refreshData(List<Book> newBooks) {
		this.books = newBooks;
		fireTableDataChanged();
	}
	
	public boolean isEmpty() {
		return books.isEmpty();
	}
}