package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entities.User;

public class TableModelUser extends AbstractTableModel{

	private static final long serialVersionUID = 7601531852533368103L;

	private List<User> users;
	
	private String[] columns = {"Nome", "Matrícula", "Tipo", "Login"};
	
	public TableModelUser(List<User> users) {
		this.users = users;
	}

	@Override
	public int getRowCount() {
		return users.size();
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
	
	
	//FAZER PARA O LIVRO
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		User user = users.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			user.setName(aValue.toString());
		case 1:
			user.setRegistrationNumber(aValue.toString());
		case 2:
			user.setType(aValue.toString());
		case 3:
			user.setUsername(aValue.toString());
		}
	}
	
	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		User selectedUser = users.get(rowIndex);
		Object valueObject = null;
		
		switch(columnIndex) {
		case 0:
			valueObject = selectedUser.getName();
			break;
		case 1:
			valueObject = selectedUser.getRegistrationNumber();
			break;
		case 2:
			valueObject = selectedUser.getType();
			break;
		case 3:
			valueObject = selectedUser.getUsername();
			break;
		}
		
		return valueObject;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	public Object getSelected(int rowIndex) {
		return users.get(rowIndex);
	}
	
	public void refreshData(List<User> newUsers) {
		this.users = newUsers;
		fireTableDataChanged();
	}
	
	public boolean isEmpty() {
		return users.isEmpty();
	}
}












