package javabase;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class filejavad3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\cc\\Documents\\filejava3.txt");
		
		FileInputStream b=new FileInputStream(f);
		
       BufferedInputStream bis=new BufferedInputStream(b);
       
       int a;
       while((a=bis.read())!=-1){
    	   
    	   System.out.print((char)a);
//    	   {
//    		   System.out.print("ok");
//    	   }
    	   
       }
	}
}
