package cipherGUIU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import newProjecct.Chiper;

public class InputText {
	boolean f = false;
	String text;
	File file;
	int KeyG;
	String Cipher;
	String Converted;
	Chiper cipher = new Chiper();
	ChiperSwingComponents csc = new ChiperSwingComponents();
	
	public void method() {
		// TODO Auto-generated constructor stub
	csc.frame("Encrypt Text");
	csc.lable("Input text : ",20,20,500,20);
	csc.textField(50, 50, 500, 30);
	csc.button("ok", 550,50, 100, 30);
	csc.frame.add(csc.lable);
	csc.frame.add(csc.textField);
	csc.frame.add(csc.button);
	csc.lable1("Encrypted , Your Key:",20,100,500,20);
	csc.frame.add(csc.lable1);
	//csc.text(50,150,200, 30);
	///csc.frame.add(csc.password);
	csc.button2("Confirm",250,150,100,30);
	csc.frame.add(csc.button2);

	//Encrypt Text 
	
	csc.button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
		 text  = csc.textField.getText();
			
		}
	});
	
	
	csc.button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
				  KeyG = cipher.key;
				 Cipher = cipher.encrypt(text);
				 JOptionPane.showMessageDialog(csc.frame,"text Encrypted,"
				 		+ "Key : "+KeyG);
				 
				   new SaveFile().method(Cipher);
		
		}
	});

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
	
}
