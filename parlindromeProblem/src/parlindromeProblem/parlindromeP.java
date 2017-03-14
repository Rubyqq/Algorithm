package parlindromeProblem;

public class parlindromeP {
	public static void main(String [] args){
		parlindromeP test = new parlindromeP();
		boolean a = test.parlindromeP("adam, I'm Ada");
		System.out.println(a);
	}
	
	public boolean parlindromeP(String text){
		
		int length = text.length();
		if (length <= 1){return true;}
		else{
			char first = Character.toLowerCase(text.charAt(0));
			char last = Character.toLowerCase(text.charAt(length-1));
			if(Character.isLetter(first) && Character.isLetter(last)){
				if(first == last){
					String shorter = text.substring(1, length-1);
					return parlindromeP(shorter);
				}
				else{
					return false;
				}
			}
			
			else if(!Character.isLetter(first)){
				String shorter = text.substring(1,length);
				return parlindromeP(shorter);
			}
			
			else if(!Character.isLetter(last)){
				String shorter = text.substring(0,length-1);
				return parlindromeP(shorter);
			}
		}
		return false;
	}
	
	
}
