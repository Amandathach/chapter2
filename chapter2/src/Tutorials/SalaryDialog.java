package Tutorials;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wageString, dependentString;
		String hoursWorkedString;
		double wage, weeklyPay;
		int dependents;
		double wage, weeklyPay;
		 double HOURS_IN_WEEK ;
		 
		 hoursWorkedString = JOptionPane.showInputDialog(null, "How ,any hours did you work during the week?", "Hourly wage Dialog",JOptionPane.INFORMATION_MESSAGE);
		 HOURS_IN_WEEK = Double.parseDouble(hoursWorkedString);
				
			wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Slary dialog 1", JOptionPane.INFORMATION_MESSAGE);
			weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
				
			dependentString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
			dependents = Integer.parseInt(dependentString);
				
			JOptionPane.showMessageDialog(null, "weekly salary is $" + weeklyPay + "nDeductions will be made for" + dependents + "dependents" );
	}

}
