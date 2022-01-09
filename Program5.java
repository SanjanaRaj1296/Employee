package com.te.excep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program5 {
	
	 public void checkFileNotFound()
	    {
	        try
	        {
	            FileInputStream in = new FileInputStream("C:\\Users\\admin\\Desktop\\Test1.txt");
	            System.out.println("File found!!!");
	        } 
	        catch (FileNotFoundException e)
	        {
	        	System.out.println("File not found!!!!!");
	            //e.printStackTrace();
	        }
	    }
	    public static void main(String[] args)
	    {
	        Program5 prog = new Program5();
	        prog.checkFileNotFound();
	    }
	}



