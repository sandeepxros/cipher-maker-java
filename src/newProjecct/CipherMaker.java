package newProjecct;
import java.util.Scanner;

import javax.crypto.Cipher;

import newProjecct.Chiper;
class CipherMaker{
	Chiper chiper = new Chiper();
	static Scanner sc = new Scanner(System.in);
	
	
	protected void manage() throws Exception {
	
   	 System.out.println("welcome to command based text chiper maker!");
     System.out.print("what you want(Encrypt-1) or (Decrypt-2) : ");
     int ch = sc.nextInt();
     System.out.println(ch);
     if(ch ==1) { 
    	 encrypt();
     }
     if(ch==2) { 
    	 decryption();
     }
      
    }
	
	
	
	private void decryption() throws Exception {
	  System.out.print("what do you want to decrypt 1-file 2-text: ");
	  int i = sc.nextInt();
	  if(i == 1 ) {
		   chiper.inputFile();
		   String x =chiper.copyFile(chiper.file) ;
		   System.out.println("please input key : ");
		   int key =sc.nextInt();
		   String y = chiper.decrypt(x, key);
		   System.out.println("Decrypted....");
		   System.out.println("Show(1) or save file(2) or Quit(3):");
		   int j = sc.nextInt();
		   if(j == 1) System.out.println(y);
		   if(j==2) { 
			   chiper.creatFile();
			   chiper.writeFile(y, chiper.file2);
		   }
	  	  
	  }else if(i == 2) {
		  
		  System.out.println("input text you want to decrypt: ");
		  String text = chiper.sc.nextLine();
		  System.out.println("key: ");
		  int key = sc.nextInt();
		  System.out.println(chiper.decrypt(text, key));
		  text = chiper.decrypt(text, key);
		  System.out.println("want to save data in file? 1/2");
		  key = sc.nextInt();
		  if(key==1) { 
			  chiper.creatFile();
			  chiper.writeFile(text, chiper.file2);
		  }
		   
	  }else { 
		  System.out.println("Thank you");
		  System.exit(0);
	  }

	}
	
	
	
	private void encrypt() throws Exception {
		System.out.print("where is text 1-file , 2-text:");
		int k = sc.nextInt();
		if(k==1) {
			 chiper.inputFile();
			 String massage = chiper.copyFile(chiper.file);
			 String encm =  chiper.encrypt(massage);
			 System.out.println("encrypted..  with KEY :  "+chiper.key);
			 System.out.println("where to save your encrypted file : ");
			 chiper.creatFile();
			 chiper.writeFile(encm, chiper.file2);
		}
		if(k==2) { 
			System.out.println("input text : ");
			String massage = chiper.sc.nextLine();
			String encm = chiper.encrypt(massage);
			System.out.println("encrypted.. Massage with KEY :  "+chiper.key);
			System.out.println(encm);
		    System.out.println("want to save data in file? 1/2");
			int  key = sc.nextInt();
			  if(key==1) { 
				  chiper.creatFile();
				  chiper.writeFile(encm, chiper.file2);
			  }else System.exit(0);
			
		}
		
		
		
		
		
		
		
	}
}
	 
	
   	 
   