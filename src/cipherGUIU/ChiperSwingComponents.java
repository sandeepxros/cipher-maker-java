package cipherGUIU;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ChiperSwingComponents {
	JFrame frame;
	JComboBox dropdown;
	JButton button;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JLabel lable ;
	JLabel lable1 ;
	JLabel lable2 ;
	JLabel lable3 ;
	JLabel lable4 ;
	JLabel lable5 ;
	JLabel lable6 ;
	JLabel lable7;
	JLabel lable8 ;
	JLabel lable9 ;
	JLabel lable10;
	JTextField textField;
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JTextField textField4;
	JTextField textField5;
	JTextField textField6;
	JTextField textField7;
	JTextField textField8;
	JTextField textField9;
	JTextField textField10;
	JTextField textField11;
	JPasswordField password;
	JTextArea text ;
	
	
	void text(String t,int x , int y , int w , int h  ) {
		  text = new JTextArea(t);
		  text.setBounds(x, y, w, h);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	void password(int x , int y ,int w ,  int h) {
		
		password = new JPasswordField();
		password.setBounds(x, y, w, h);
		
	}

	void lable(String lableName, int x , int y ,int w ,  int h) {
	    lable = new JLabel(lableName);
	    lable.setBounds(x, y, w, h);
	}
	void lable1(String lableName, int x , int y ,int w ,  int h) {
	    lable1= new JLabel(lableName);
	    lable1.setBounds(x, y, w, h);
	}
	void lable2(String lableName, int x , int y ,int w ,  int h) {
	    lable2= new JLabel(lableName);
	    lable2.setBounds(x, y, w, h);
	}
	void lable3(String lableName, int x , int y ,int w ,  int h) {
	    lable3= new JLabel(lableName);
	    lable3.setBounds(x, y, w, h);
	}
	void lable4(String lableName, int x , int y ,int w ,  int h) {
	    lable4= new JLabel(lableName);
	    lable4.setBounds(x, y, w, h);
	}
	void lable5(String lableName, int x , int y ,int w ,  int h) {
	    lable5= new JLabel(lableName);
	    lable5.setBounds(x, y, w, h);
	}
	void lable6(String lableName, int x , int y ,int w ,  int h) {
	    lable6= new JLabel(lableName);
	    lable6.setBounds(x, y, w, h);
	}
	void lable7(String lableName, int x , int y ,int w ,  int h) {
	    lable7= new JLabel(lableName);
	    lable7.setBounds(x, y, w, h);
	}
	void lable8(String lableName, int x , int y ,int w ,  int h) {
	    lable8= new JLabel(lableName);
	    lable8.setBounds(x, y, w, h);
	}
	void lable9(String lableName, int x , int y ,int w ,  int h) {
	    lable9= new JLabel(lableName);
	    lable9.setBounds(x, y, w, h);
	}
	void lable10(String lableName, int x , int y ,int w ,  int h) {
	    lable10= new JLabel(lableName);
	    lable10.setBounds(x, y, w, h);
	}
	void frame(String frameName) {
    	frame = new JFrame(frameName);
    	frame.setLayout(null);
    	frame.setSize(500, 500);
    	frame.setVisible(true);
    	
    }
    void button(String buttonName,int x , int y , int w , int h) {
		
    	 button = new JButton(buttonName);
    	button.setBounds(x, y, w, h);
    	
    	 
    }
    void button2(String buttonName,int x , int y , int w , int h) {
		
   	 button2 = new JButton(buttonName);
   	button2.setBounds(x, y, w, h);
   	
   	 
   }
    void button3(String buttonName,int x , int y , int w , int h) {
		
   	 button3 = new JButton(buttonName);
   	button3.setBounds(x, y, w, h);
   	
   	 
   }
    void button4(String buttonName,int x , int y , int w , int h) {
		
   	 button4 = new JButton(buttonName);
   	button4.setBounds(x, y, w, h);
   	
   	 
   }
    void button5(String buttonName,int x , int y , int w , int h) {
		
   	 button5 = new JButton(buttonName);
   	button5.setBounds(x, y, w, h);
   	
   	 
   }
    void button6(String buttonName,int x , int y , int w , int h) {
		
   	 button6 = new JButton(buttonName);
   	button6.setBounds(x, y, w, h);
   	
   	 
   }
    void button7(String buttonName,int x , int y , int w , int h) {
		
   	 button7 = new JButton(buttonName);
   	button7.setBounds(x, y, w, h);
   	
   	 
   }
    void button8(String buttonName,int x , int y , int w , int h) {
		
   	 button8 = new JButton(buttonName);
   	button8.setBounds(x, y, w, h);
   	
   	 
   }
    
    void dropdown(String[] menu, int x , int y , int w , int h) {
    	 
    	dropdown = new JComboBox(menu);
    	dropdown.setBounds(x, y, w, h);
	  	
    }
    void textField3(int x , int y , int w , int h) {
    	textField3= new JTextField();
    	textField3.setBounds(x,y,w,h);
    }
    void textField11(int x , int y , int w , int h) {
    	textField11= new JTextField();
    	textField11.setBounds(x,y,w,h);
    }
    void textField4(int x , int y , int w , int h) {
    	textField4= new JTextField();
    	textField4.setBounds(x,y,w,h);
    }
    void textField5(int x , int y , int w , int h) {
    	textField5= new JTextField();
    	textField5.setBounds(x,y,w,h);
    }
    void textField6(int x , int y , int w , int h) {
    	textField6= new JTextField();
    	textField6.setBounds(x,y,w,h);
    }
    void textField7(int x , int y , int w , int h) {
    	textField7 = new JTextField();
    	textField7.setBounds(x,y,w,h);
    }
    void textField8(int x , int y , int w , int h) {
    	textField8 = new JTextField();
    	textField8.setBounds(x,y,w,h);
    }
    void textField9(int x , int y , int w , int h) {
    	textField9= new JTextField();
    	textField9.setBounds(x,y,w,h);
    }
    void textField10(int x , int y , int w , int h) {
    	textField10 = new JTextField();
    	textField10.setBounds(x,y,w,h);
    }
    void textField1(int x , int y , int w , int h) {
    	textField1= new JTextField();
    	textField1.setBounds(x,y,w,h);
    }
    void textField2(int x , int y , int w , int h) {
    	textField2= new JTextField();
    	textField2.setBounds(x,y,w,h);
    }
    void textField(int x , int y , int w , int h) {
    	textField = new JTextField();
    	textField.setBounds(x,y,w,h);
    }

	
	
	
	
}
