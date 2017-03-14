package licenseKeyFormatting;


public class licenseKeyFormatting{
	public static void main(String...args){
		licenseKeyFormatting("---", 3);
	}
    public static void licenseKeyFormatting(String S, int K) {
    	
    	String result = S.toUpperCase();
    	StringBuilder sb = new StringBuilder();
    	int count = 0;

        for(int i = result.length()-1; i >= 0; i--){
        	
        	if(result.charAt(i) != '-') {
        		sb.append(result.charAt(i));
        		count++;
        		if(count == K){
        			sb.append('-');
        			count = 0;
        		}
    		}
        	
        } 
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '-'){
    		sb.deleteCharAt(sb.length()-1);
    	}
        System.out.print(sb.reverse().toString());
    }
}