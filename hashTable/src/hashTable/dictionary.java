package hashTable;

public class dictionary {
	Definition [] Definition = new Definition[hashCodeGiven.Word];
	
	public void insetDefinition(hashCodeGiven hash, Definition d){
		Definition[hash.hashCode()] = d;
	}
	
	public Definition findDefine(hashCodeGiven hcg){
		return Definition[hcg.hashCode()];
	}
}
