public class MinusExp extends Exp{
	public Exp left, right;
	
	public MinusExp(Exp l, Exp r){
		left = l; right = r;}

	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitMinusExp(this);
	}
}
