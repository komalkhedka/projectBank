package javabase;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class filesjava2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kk=new File("C:\\Users\\cc\\Documents\\filesjavademo2.txt");
		
		FileInputStream fis=new FileInputStream(kk);
		
		BufferedInputStream bis= new BufferedInputStream(fis);
		
		int a;
		while((a=bis.read())!=-1) {
			System.out.print((char) a);
			}
		System.out.println("done");
		}
	}
