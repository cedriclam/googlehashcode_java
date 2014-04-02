package com.google.hashcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Google Hash Code
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
			String input;
	 
			while((input=br.readLine())!=null){
				System.out.println(input);
			}
 
		}catch(IOException io){
			io.printStackTrace();
		}

        System.out.println( "Google Hash Code!" );
    }
}
