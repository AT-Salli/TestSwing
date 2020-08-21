package swing;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Filechooser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilter filter = new FileNameExtensionFilter("Bilder", "gif", "png", "jpg");
		JFileChooser chooser = new JFileChooser("/Users/msalli/Pictures");
		chooser.addChoosableFileFilter(filter);
		JFrame meinFrame = new JFrame("Dateiauswahl");
		meinFrame.setSize(450,300);
		meinFrame.getContentPane().add(chooser);
		meinFrame.setVisible(true);
		
		
	}

}
