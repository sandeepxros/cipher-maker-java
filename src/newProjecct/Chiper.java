package newProjecct;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

 public class Chiper {
	 
	 
     FileInputStream fis = null ;
     FileOutputStream fos = null;
     File file = null ; 
     File file2 = null;
     Scanner sc = new Scanner(System.in);
     public final int key = key() ;
     
     
     //create new file store in file2
	 void creatFile() throws Exception {
		 Chiper c = new Chiper();
		
		 System.out.println("input file name followed by path :");
		 String path = sc.nextLine();
	
			 file2 = new File(path);
			 if(!file2.exists()) {
			     file2.createNewFile();
			     System.out.println("file created!");
			 }
			 else { System.out.println("file exist");
			 System.out.println("input 1 for new file or proceed?(1/2)");
			  int ch = sc.nextInt();
			  if(ch==1) 
			  c.creatFile();}
			 
		
	}
	
	 //input file store in file 
	public void inputFile() {
		
		System.out.println("input file name followed by path :");
		 String path = sc.nextLine();
		 try {
			 file = new File(path);
			 if(!file.exists()) {
			     System.out.println("file not found :)");
			     System.exit(0);
			 }else System.out.println("file found : "+file.getAbsolutePath());
		 }
		 catch (Exception e) {
			  System.out.println("Err: "+e);
			  System.out.println("retry-");
			  inputFile();
		 }
		 
	}
	
	//generate key return key 
	public int key() {
		  int key = new Random().nextInt(25)+1;
		  return key;
	}

	//encryption start by ceaser's algorithm and return String
	 public String encrypt(String massage) {
		    char [] c = massage.toCharArray();
		    char[] temp = new char[c.length];
		    for(int i = 0 ; i<c.length;i++) {
	    		temp[i] =  (char)((int)c[i]+key);
	    	}
		    
		    return new String(temp);
	}
	
	 //ceaser algorithm for decrypt file 
	public String decrypt(String massage, int key) {
		char[] b = massage.toCharArray();
    	char[] temp = new char[b.length];
        for(int i = 0; i<b.length; i++) {
        	 temp[i] = (char)((int)b[i]-key);
        }
        return new String(temp);
	}
	
	//copy file text into string
	 public String copyFile(File file) throws Exception{
	       Scanner scanner = new Scanner( file , "UTF-8" );
	       String text = scanner.useDelimiter("\\A").next();
	       scanner.close();
	   	return text;
		 
	}
	

	 //write files
	
	 public void writeFile(String m, File f2) throws Exception {
	              fos = new FileOutputStream(f2);
	              fos.write(new String(m).getBytes());
	              System.out.println("file written SuccessFully!");
	}
	 
	 //close streams
void close() throws IOException {
		 fis.close();
		 fos.close();
	}
	
}



