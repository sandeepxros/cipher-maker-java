package cipherGUIU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import newProjecct.Chiper;

public class DecyptText {
	ChiperSwingComponents csc = new ChiperSwingComponents();
	String text;
	int KeyG;
	String Cipher;
	Chiper cipher = new Chiper();
	void  method() {
		csc.frame("Decrypt Text");
		csc.lable("Input Text: ",20,20,500,20);
		csc.textField(50, 50, 200, 30);
		csc.button("Ok", 250,50, 100, 30);
		csc.frame.add(csc.lable);
		csc.frame.add(csc.textField);
		csc.frame.add(csc.button);
		csc.lable1("Input Key:",20,100,500,20);
		csc.frame.add(csc.lable1);
		csc.password(50,150,200, 30);
		csc.frame.add(csc.password);
		csc.button2("Ok",250,150,100,30);
		csc.frame.add(csc.button2);
		
		//action listners
		
		csc.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			 text  = csc.textField.getText();
				
			}
		});
		
		
		csc.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
					  KeyG = Integer.parseInt(new String(csc.password.getPassword()));
					  Cipher = cipher.decrypt(text, KeyG);
					 JOptionPane.showMessageDialog(csc.frame,"text Decrypted");
					 
					   new SaveFile().method(Cipher);
			
			}
		});

		
		
		
	}

}
