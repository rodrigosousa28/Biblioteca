package exceptions;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validate {
	
	private Validate() {}
	
	public static boolean cpf(String cpf) {
		
		if(cpf.length() != 11) {
			return false;
		}
		
		String startCpf = cpf.substring(0, 9);
		Integer[] startCpfNumbers = new Integer[11];
		
		//Verification of the first digit
		int multiplicator = 10;
		int total = 0;
		for(int i = 0; i < startCpf.length(); i++) {
			Character c = startCpf.charAt(i);
			startCpfNumbers[i] = Character.getNumericValue(c) * multiplicator;
			total += startCpfNumbers[i];
			multiplicator--;
		}
		
		int rest = total % 11;
		int verifyingDigit = 0;
		if(rest >= 2) {
			verifyingDigit = 11 - rest;			
		}
		startCpfNumbers[9] = verifyingDigit;
		startCpf += Integer.toString(verifyingDigit);
		
		//Verification of the second digit
		multiplicator = 11;
		total = 0;
		
		for(int i = 0; i < startCpf.length(); i++) {
			Character c = startCpf.charAt(i);
			startCpfNumbers[i] = Character.getNumericValue(c) * multiplicator;
			total += startCpfNumbers[i];
			multiplicator--;
		}
		
		rest = total % 11;
		verifyingDigit = 0;
		if(rest >= 2) {
			verifyingDigit = 11 - rest;			
		}
		startCpfNumbers[10] = verifyingDigit;
		startCpf += Integer.toString(verifyingDigit);

		if(startCpf.equals(cpf))
			return true;
		return false;
		
	}

	public static void filledField
	(JTextField txtName, JTextField txtRegistrationNumber,
	JTextField txtCPF, JTextField txtUsername, JPasswordField txtPassword) {
		
		boolean emptyFieldName = txtName.getText().equals("") || txtName.getText() == null;
		boolean emptyFieldRegNumber = txtRegistrationNumber.getText().equals("") || txtRegistrationNumber.getText() == null;
		boolean emptyFieldCPF = txtCPF.getText().equals("") || txtCPF.getText() == null;
		boolean emptyFieldUser = txtUsername.getText().equals("") || txtUsername.getText() == null;
		boolean emptyFieldPass = txtPassword.getPassword() == null;
		
		boolean existsEmptyField = emptyFieldName || emptyFieldRegNumber || emptyFieldCPF || emptyFieldUser || emptyFieldPass;
		
		if(existsEmptyField) {
			throw new EmptyFieldException();
		}
			
	}
}
