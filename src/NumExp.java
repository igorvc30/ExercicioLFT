
public class NumExp extends Exp{
	public int num;
	public NumExp(int n){num = n;}
	
	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitNumExp(this);
	}
}