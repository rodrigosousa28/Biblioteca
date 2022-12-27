package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModelRecord extends AbstractTableModel{

	private static final long serialVersionUID = 7601531852533368103L;

	private List<entities.Record> records;
	
	private String[] columns = {"Usuário", "Livro", "Data de empréstimo"};
	
	public TableModelRecord(List<entities.Record> records) {
		this.records = records;
	}

	@Override
	public int getRowCount() {
		return records.size();
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
        @Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		entities.Record record = records.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			record.setNameUser(aValue.toString());
		case 1:
			record.setNameBook(aValue.toString());
		case 2:
			record.setBeginDate(aValue.toString());
		}
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		entities.Record selectedRecord = records.get(rowIndex);
		Object valueObject = null;
		
		switch(columnIndex) {
		case 0:
			valueObject = selectedRecord.getNameUser();
			break;
		case 1:
			valueObject = selectedRecord.getNameBook();
			break;
		case 2:
			valueObject = selectedRecord.getBeginDate();
			break;
		}
		
		return valueObject;
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	public Object getSelected(int rowIndex) {
		return records.get(rowIndex);
	}
	
	public void refreshData(List<entities.Record> newRecords) {
		this.records = newRecords;
		fireTableDataChanged();
	}
	
	public boolean isEmpty() {
		return records.isEmpty();
	}
}