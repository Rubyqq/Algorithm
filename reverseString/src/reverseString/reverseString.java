package reverseString;

public class reverseString {
	
	public static void main(String...args){
		String string = reverseString("hello");
		System.out.print(string);
	}

    public static String reverseString(String s) {
        
        int temp = s.length()-1;
        StringBuilder sb = new StringBuilder();
        String [] string = new String[s.length()];
        
        for(int i = 0; i < string.length; i++){
            
            string[i] = Character.toString(s.charAt(temp));
            temp--;
        }
        
        String answer = String.join("", string);
        
        return answer;
    }
}