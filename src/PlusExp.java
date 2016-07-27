public class PlusExp extends Exp{
	public Exp left, right;
	public PlusExp(Exp l, Exp r){
		left = l; right = r;}
	@Override
	public String print() {
		return "(" + left.print() + "+" + right.print() + ")";
	}
	public int evaluate(Memory m) {
		return left.evaluate(m)+right.evaluate(m) ;
	}
}
