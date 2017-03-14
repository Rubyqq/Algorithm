package triangleNumbers;

public class testTriangle {
	public static void main(String [] args){
		triangleNumbers T = new triangleNumbers(10);
		int area = T.getArea();
		System.out.println("Area" + area);
		System.out.println("Expected 55");
	}
}
