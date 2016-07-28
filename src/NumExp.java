
public class NumExp extends Exp{
	public int num;
	public NumExp(int n){num = n;}
	
	@Override
	public String print() {
		return String.valueOf(num);
	}
	
	public int evaluate(Memory m) {
		return num;
	}
}