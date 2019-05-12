package cipherGUIU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;


import newProjecct.Chiper;

public class EncryptFile {
	boolean f = false;
	String fileName;
	File file;
	int KeyG;
	String Cipher;
	String Converted;
	Chiper cipher = new Chiper();
       ChiperSwingComponents csc = new ChiperSwingComponents();
	void method() throws Exception {
		csc.frame("Encrypt File");
		csc.lable("Input File Path: ",20,20,500,20);
		csc.textField(50, 50, 200, 30);
		csc.button("Check", 250,50, 100, 30);
		csc.frame.add(csc.lable);
		csc.frame.add(csc.textField);
		csc.frame.add(csc.button);
		csc.lable1("Encrypted , Your Key:",20,100,500,20);
		csc.frame.add(csc.lable1);
		//csc.text(50,150,200, 30);
		///csc.frame.add(csc.password);
		csc.button2("Confirm",250,150,100,30);
		csc.frame.add(csc.button2);
	  
		
		
		csc.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			 fileName  = csc.textField.getText();
			  file = new File(fileName);
			 if(file.exists()) {
			   JOptionPane.showMessageDialog(csc.frame, "fileFound");
			    f = true;
			 }
			     else {
			    	 JOptionPane.showMessageDialog(csc.frame, "file Not Found");
			      try {
					new OptionChooser().optionChooser();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			     }
				
			}
		});
		
		
		csc.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(f) {
					try {
						Converted = cipher.copyFile(file);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 KeyG = cipher.key;
					 Cipher = cipher.encrypt(Converted);
				//Don't need it//	 JOptionPane.showMessageDialog(csc.frame, Cipher);
					 JOptionPane.showMessageDialog(csc.frame,"File Encrypted,"
					 		+ "Key : "+KeyG);
					 
					   new SaveFile().method(Cipher);
					 
				}else JOptionPane.showMessageDialog(csc.frame,"File not Found \n retry");
				
			}
		});

	}
	
}
