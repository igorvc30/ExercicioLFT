public class PlusExp extends Exp{
	public Exp left, right;
	
	public PlusExp(Exp l, Exp r){
		left = l; right = r;}

	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitPlusExp(this);
	}
}
