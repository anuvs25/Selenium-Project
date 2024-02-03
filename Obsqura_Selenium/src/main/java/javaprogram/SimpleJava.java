package javaprogram;

public class SimpleJava {
	int num;
	public boolean IsNumberTwoDigit(int num) {
		this.num=num;
		boolean result;
		result = num>9 && num<100;
		return result; 
	}
	
	public static void main(String[] args) {
		SimpleJava ob = new SimpleJava();
		System.out.println("The number is two digit....");
		System.out.println(ob.IsNumberTwoDigit(150));
	}

}
