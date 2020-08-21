package swing;

import java.awt.event.*;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class ColorChooser extends JFrame implements ActionListener {
	
	
	JButton b;
	JFrame f;
	JTextArea ta;
	
	JMenu menu, submenu;
	JMenuItem i1,i2,i3,i4,i5;
	
	ColorChooser(){
		f =new JFrame ("colorchooser");
		b= new JButton("color");
		b.setBounds(200, 250, 100, 30);
		b.addActionListener(this);
		JMenuBar mb= new JMenuBar();
		menu = new JMenu("Menu");
		submenu = new JMenu("Sub Menu");
		i1= new JMenuItem("Portfolio");
		i2 = new JMenuItem("Kontakt");
		i3 = new JMenuItem("Home");
		i4 = new JMenuItem("Bestellungen");
		i5 = new JMenuItem("Blog");
		menu.add(i1);menu.add(i2);menu.add(i3);
		submenu.add(i4); submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		ta = new JTextArea();
		ta.setBounds(10, 10, 300, 200);
		f.add(b);f.add(ta);
		f.setLayout(getLayout());
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorChooser();
		
		char posChar, negChar;
		short posShort = 33;
		short negShort = -1;
		/* explizite Typumwandlung von dem Datentyp short in den Datentyp char */
		posChar = (char) posShort;
		negChar = (char) negShort;
		 
		// Ausgabe der expliziten Typumwandlung von oben
		System.out.println("positiver Short " + posShort + " ist als Char " + posChar);
		System.out.println("negativer Short " + negShort + " ist als Char " + negChar);
		/* Ausgabe der erneuten expliziten Typumwandlung, diesmal von char nach int */
		System.out.println("positiver Short " + posShort +" ist als Char " + (int) posChar);
		System.out.println("negativer Short " + negShort + " ist als Char " + (int) negChar);
		
	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color initialcolor = Color.red;
		Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
		JOptionPane op = new JOptionPane("Confirm");
		int wahl = JOptionPane.showConfirmDialog(null, "Möchten Sie die Farbe wirklich in " +color + "ändern?"  );
		
		
		if (wahl == JOptionPane.OK_OPTION )
			ta.setBackground(color);
		else
			
			JOptionPane.showMessageDialog(null, "Weiter mit der alten Farbe");
			
			
			
		
	}

	

}
