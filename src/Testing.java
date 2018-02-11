
public class Testing {
	
	public static void main(String[] args){
		Testing test = new Testing(4);
	}
	
	private final int value;
	
	public Testing(int value){
		this.value = value;
	}
	
	public int multy(int amount){
		return this.value * amount;
	}
	
	public int add(int a, int b){
		return a+b;
	}

}
