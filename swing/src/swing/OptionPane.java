package swing;

import javax.swing.JOptionPane;

public class OptionPane {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane meinJPane = new JOptionPane();
		meinJPane.showOptionDialog(null, "Dies ist ein Optiondialog","Optionsdialog", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
				new String [] {"A", "B", "C"}, "B");
		meinJPane.setSize(450, 500);
		meinJPane.setVisible(true);

	}

}
