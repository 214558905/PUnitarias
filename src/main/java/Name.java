
public class Name {
	
	private String name;

	public Name(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLeght() {
		
		int stringLenght  = this.name.length();
		
		return  stringLenght;
	}
	

}
