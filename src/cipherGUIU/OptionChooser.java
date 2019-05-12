package cipherGUIU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import cipherGUIU.*;

public class OptionChooser {
     ChiperSwingComponents csc = new ChiperSwingComponents();
     InputText inputTxt = new InputText() ;
	
     void optionChooser() throws Exception{
	    String[] a = {"Encrypt Text","Decrypt Text","Decrypt File" ,"encrypt File"};
    	csc.frame("Option Chooser");
        csc.dropdown(a,  20, 50, 200, 40);
        csc.frame.add(csc.dropdown);
        csc.button("Select", 230, 50, 200, 40);
        csc.frame.add(csc.button);
    	
        csc.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s =(String) csc.dropdown.getItemAt(csc.dropdown.getSelectedIndex());
				 switch(s) {
				 case "Encrypt Text": inputTxt.method();
					 break;
				 case "Decrypt Text": new DecyptText().method();
					 break;
				 case "Decrypt File":new DecryptFile().method();
					 break;
				 case "encrypt File":  try {
						new EncryptFile().method();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 break; 
				 }
			}
		});
        
        
        
        
        
        
		
	}
	public static void main(String[] args) throws Exception{
		
		new OptionChooser().optionChooser();
	}
}
