package cipherGUIU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import newProjecct.*;

import javax.swing.JOptionPane;

public class SaveFile {
	File file ;
	Chiper cipher = new Chiper();
	String CipherTxt ; //= new EncryptFile().Cipher;
    ChiperSwingComponents csc = new ChiperSwingComponents();
    //String ChiperTxt;
    
	void method(String Text){
		csc.frame("Save File");
		csc.lable("Do You want to save File : ",20,20,500,20);
		csc.button("Yes",50, 50, 100, 30);
		csc.button2("No",150,50, 100, 30);
		csc.frame.add(csc.lable);
		csc.frame.add(csc.button);
		csc.frame.add(csc.button2);
		this.CipherTxt = Text;
	
		csc.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = JOptionPane.showInputDialog("Input file name : ");
				file = new File(s);
				if(!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				try {
					cipher.writeFile(CipherTxt, file);
				    JOptionPane.showMessageDialog(csc.frame, "File Written");
				    JOptionPane.showMessageDialog(csc.frame, CipherTxt);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} }
		});
		
		csc.button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(csc.frame,CipherTxt);
				
			}
		});
		
		
		
		
	}
	
	
	
}
