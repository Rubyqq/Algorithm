package BinaryWatch;

import java.util.ArrayList;

public class BinaryWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	public static ArrayList<String> readBinaryWatch(int num) {
        
        ArrayList <String> arraylist = new ArrayList<String>();
        
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                if(Integer.bitCount(i*64 + j) == num) {
                    arraylist.add(String.format("%d:%02d", i , j));
                }
            }
        }
        
        return arraylist;
    }

}
