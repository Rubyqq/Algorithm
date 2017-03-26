package ConvertaNumbertoHexadecimal;

public class ConvertaNumbertoHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(toHex(-1));
	}
	
	public static String toHex(int num) {
        
		String s = "";
		String S = "";
		
		if(num == 0) return "0";
		
        while(num != 0){
	        int temp = num & 15;
	     
	       
	        num = num >>> 4;
        	S = Integer.toString(temp);
	        if(S.equals("10")){
	    		S = "a";
	        }else if(S.equals("11")){
	        	S = "b";
	        }else if(S.equals("12")){
	        	S = "c";
	        }else if(S.equals("13")){
	        	S = "d";
	        }else if(S.equals("14")){
	        	S = "e";
	        }else if(S.equals("15")){
	        	S = "f";
	        }
	        
        	s = S + s; 
        }
        return s;
	}

}
