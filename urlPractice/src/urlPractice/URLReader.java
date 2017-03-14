package urlPractice;

import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
    	System.out.print("Please input your company name: ");
    	BufferedReader webpage = new BufferedReader(new InputStreamReader(System.in));
    	String i = webpage.readLine();
    	System.out.println("http://www." + i + ".com/");
    	
    	URL url = new URL("http://www." + i + ".com/");
    	BufferedReader in = new BufferedReader(
	    new InputStreamReader(url.openStream()));
    	
    	int j = 0;
    	String [] webArray = new String[5];
	    String inputLine;
	    while ((inputLine = in.readLine()) != null && j < webArray.length){
	    	webArray[j] = inputLine;
	    	j++;
	    }
	        
	   for(int a = webArray.length-1; a >= 0; a--){
		   System.out.println(webArray[a]);
	   }
    }
}
