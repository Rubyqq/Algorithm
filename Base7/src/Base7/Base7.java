package Base7;

public class Base7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub;
	}
	
	public String convertToBase7(int num) {
        
        int num1 = 0;
        
        if(num < 0) num1 = -num;
        else num1 = num;
        
        String s = "";
        
        while(num1 >= 1){
            s = num1%7 + s;
            num1 = num1/7;
        }
        if(num < 0) return "-" + s;
        else if(num > 0) return s;
        else return "0";
    }

}
