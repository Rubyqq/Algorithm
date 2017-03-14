package hashTable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashCodeGiven ab = new hashCodeGiven("ab");
		Definition abDefinition = new Definition("This the a letter 'a' with a letter 'b'");
		dictionary dic = new dictionary();
		dic.insetDefinition(ab, abDefinition);
		dic.findDefine(ab);
		System.out.print("Compile!");
	
	}

}
