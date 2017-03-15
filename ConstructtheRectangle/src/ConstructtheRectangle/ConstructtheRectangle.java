package ConstructtheRectangle;

public class ConstructtheRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructRectangle(5);
	}
	
	 public static int[] constructRectangle(int area) {
	        
        int [] array = new int[2];
        
        if(Math.sqrt(area) == 0) {
            
            array[0] = (int)Math.sqrt(area);
            array[1] = (int)Math.sqrt(area);
            
            return array;
            
        }
        
        else{
            
            int complement = 0;
            int value = 0;
            int max = 0;
            
            int sqArea = (int)Math.sqrt(area) + 1;
            for(int i = 1; i < sqArea; i++){
                if(area % i == 0){
                    value = i;
                }
                
                max = Math.max(max, value);
            }
            
            complement = area/max;
            
            array[0] = complement;
            array[1] = max;
            
            return array;
        }
    }

}
