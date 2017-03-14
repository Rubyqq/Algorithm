package hashTable;

public class hashCodeGiven {
	
	public static final int LETTERS = 26;
	public static int Word = LETTERS*LETTERS; 
	private String word;
	
	public hashCodeGiven(String word){
		this.word = word;
	}

	public int hashCode(){
		int hashcode = LETTERS*(word.charAt(0) - 'a') + (word.charAt(0) - 'a');
		return (hashcode);
	}
	

}
