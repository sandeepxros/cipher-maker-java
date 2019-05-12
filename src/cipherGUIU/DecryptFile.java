package cipherGUIU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import newProjecct.Chiper;

public class DecryptFile {
	boolean f = false;
	String fileName;
	File file;
	int KeyG;
	String Cipher;
	String Converted;
	Chiper cipher = new Chiper();
    
	
	ChiperSwingComponents csc = new ChiperSwingComponents();
	void method() {
		csc.frame("Decrypt File");
		csc.lable("Input File Path: ",20,20,500,20);
		csc.textField(50, 50, 200, 30);
		csc.button("Check", 250,50, 100, 30);
		csc.frame.add(csc.lable);
		csc.frame.add(csc.textField);
		csc.frame.add(csc.button);
		csc.lable1("Input Key:",20,100,500,20);
		csc.frame.add(csc.lable1);
		csc.password(50,150,200, 30);
		csc.frame.add(csc.password);
		csc.button2("Ok",250,150,100,30);
		csc.frame.add(csc.button2);
		
		//Action Listners 
		
        csc.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			     }
				
			}
		});
		
		
		csc.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(f) {
					
			        char[] pswd = csc.password.getPassword();
					KeyG  = Integer.parseInt(new String(pswd));
				
					try {
						
						Converted = cipher.copyFile(file);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					 Cipher = cipher.decrypt(Converted, KeyG);
				//Don't need it//	 JOptionPane.showMessageDialog(csc.frame, Cipher);
					 JOptionPane.showMessageDialog(csc.frame,"File Decrypted");
					 
					   new SaveFile().method(Cipher);
					 
				}else JOptionPane.showMessageDialog(csc.frame,"File not Found \n retry");
				
			}
		});

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
    }
	
}
