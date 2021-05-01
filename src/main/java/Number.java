
public class Number {

	private int number1,number2;

	public Number(int number1, int number2) {
		
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int getAddition() {
			
		return this.number1+this.number2;
		
	}
	
	public int getSubtraction() {
		
		return this.number1-this.number2;
		
	}
	
	public int getMultiplication() {
		
		return this.number1*this.number2;
	}
	
	
	
	
	
	
}
