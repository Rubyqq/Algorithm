package hammingDistance;

public class hammingDistance {
	
	public static void main(String...args){
//		hammingDistance(4 , 1);
		int a = findComplement(1);
		System.out.print(a);
	}

	
//	public static int hammingDistance(int x, int y) {
//        int count = 0;
//        int a = x ^ y;
////        System.out.println(a);
//        for(int i = 0; i < 32; i++){
//            if(((a >> i) & 1) == 1){
////            	System.out.print((a >> i) & 1);
//                count++;
//            };
//            
//        }
//        
//        return count;
//    }
	
	public static int findComplement(int num) {
        int temp = num;
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((temp >> i | 0) == 1){
                count = i;
            }
        }
        
        count = count + 1;
        int a = 1;
        for(int j = 0; j < count; j++){
        	num = num ^ (a << j);
        }
        
        return num;
        
        //Better solution
        
//        return ((Integer.highestOneBit(num) << 1) - 1) ^ num;
    }
}
