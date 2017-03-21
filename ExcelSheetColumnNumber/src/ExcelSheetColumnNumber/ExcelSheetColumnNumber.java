package ExcelSheetColumnNumber;

/**
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 * For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

 * @author Mengyi
 *
 */

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		titleToNumber("AAA");
	}
	
	public static int titleToNumber(String s) {
        
        int res = 00;
        int count = s.length()-1;
        for(int i = 0; i < s.length(); i++){
           res += (s.charAt(i) - 64)*(int)Math.pow(26, count);
           count--;
        }
        return res;
    }

}
