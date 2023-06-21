package mypack;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Opensoftware {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		String name = JOptionPane.showInputDialog("Enter the name of Software");
		
		r.exec(name);
	}

}
