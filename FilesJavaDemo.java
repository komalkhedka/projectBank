package javabase;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilesJavaDemo {

	public static void main(String[] args) throws IOException {
    File f1=new File("C:\\Users\\cc\\Documents\\filesjavad1.txt");  //loction
    
    try {
    	FileInputStream fis=new FileInputStream(f1);           //fis=f1 object creation
    	BufferedInputStream bis=new BufferedInputStream(fis);    //bis=fis
    	int a;
    	while ((a=bis.read())!=-1) {              
    		
    		System.out.print((char)a);
    	}
    	
    	//System.out.println("success");
    		
      } catch(FileNotFoundException b) {
    	  
    	  b.printStackTrace();
      }
    }
}
