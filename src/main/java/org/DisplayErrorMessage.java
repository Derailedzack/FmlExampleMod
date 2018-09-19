package org;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DisplayErrorMessage {
public static void DisplayErrorMessage(java.lang.Exception e,int w,int h) {
	StringWriter sb = new StringWriter();
	sb.append("Error: ");
	e.printStackTrace(new PrintWriter(sb));
	
	String Ioexecptionstring = sb.toString();
	JFrame frame = new JFrame("");
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(false);
	JTextArea text = new JTextArea(w,h);
	text.setEditable(false);
	text.setText(Ioexecptionstring);
	JScrollPane pane = new JScrollPane(text);
	
	JOptionPane.showMessageDialog(frame,pane,"Error", JOptionPane.ERROR_MESSAGE);
}
}
