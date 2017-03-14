package triangleNumbers;

public class triangleNumbers {
	private int width;
	
	public triangleNumbers (int aWidth){
		width = aWidth;
	}
	
	public int getArea(){
		if(width <= 0){return 0;}
		else{
			triangleNumbers smallerTriangle = new triangleNumbers(width-1);
			//int smallerArea = smallerTriangle.getArea();
			return smallerTriangle.getArea() + width + (10 - width);
		}
	}
}
