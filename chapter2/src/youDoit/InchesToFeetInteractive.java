package youdoit;
import javax.swing.JOptionPane;
public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int feet;
		int inches;
		String job;
		job = JOptionPane.showInputDialog(null, "How many Inches?" , "Feet to inches" , JOptionPane.INFORMATION_MESSAGE);
		feet = Integer.parseInt(job)/12;
		inches =Integer.parseInt(job)%12;
		JOptionPane.showMessageDialog(null,  "it  is" + "feet + and" + inches + "inches");
		
	}

}
