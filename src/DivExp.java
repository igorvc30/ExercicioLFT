public class DivExp extends Exp{
	public Exp left, right;
	
	public DivExp(Exp l, Exp r){
		left = l; right = r;
	}
	
	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitDivExp(this);
	}
}
