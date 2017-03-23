package ReverseStringII;

public class ReverseStringII {
	
	static char temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reverseStr("abcdefg", 2);
		System.out.print(reverseStr("abcdefg", 2));
	}
	
	public static String reverseStr(String s, int k) {
        
        char [] charS = s.toCharArray();
        
        int rest = (s.length())%(2*k) ;
//        System.out.print(rest);
        
        int i = 1;
        while(i <= s.length()-rest){ 
        	reverse(charS, i-1, i-1+k-1);
            i = i+2*k;
        }
        if(k <= rest && rest < 2*k){
        	reverse(charS, s.length()-rest, s.length()-rest+k-1);
        }else if(k > rest){
        	reverse(charS, s.length()-rest, s.length()-1);
        }
        
        String str = String.valueOf(charS);   
        return str;
    }
	
	public static void reverse(char [] charS1, int begin1, int end1){
		while(end1 > begin1){
            temp = charS1[begin1];
            charS1[begin1]=charS1[end1];
            charS1[end1] = temp;
            end1--;
            begin1++;
		}
	}

}
