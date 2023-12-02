package aoc_1_1;

import java.io.*;
import java.util.Scanner;
import java.lang.Character;
import java.lang.Integer;

public class aoc_1_1 {
	static final String fileLocation = "C:\\Users\\gak5c\\eclipse-workspace\\aoc_1_1\\aoc_files\\";
	static final String file = "aoc_day1.txt";

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
        File aoc1_1File= new File(fileLocation + file);
        		
        try{
            Scanner inputStream= new Scanner(aoc1_1File);
            int sum = 0;
            
            while(inputStream.hasNext()){
            	String str = inputStream.next();
            	String strRev = new StringBuilder(str).reverse().toString();
            	String strValue = "";
            	
            	for (int i = 0; i < str.length(); i++) {
            		if(Character.isDigit(str.charAt(i))) {
            			strValue += str.charAt(i);
            			break;
            		}
            	}
            	
            	for (int i = 0; i < strRev.length(); i++) {
            		if(Character.isDigit(strRev.charAt(i))) {
            			strValue += strRev.charAt(i);
            			break;
            		}
            	}            	
            	
            	sum += Integer.parseInt(strValue);

            }
            inputStream.close();            
            System.out.println("sum: " + sum);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("runtime: " + (System.currentTimeMillis() - startTime));
	}
}
	
