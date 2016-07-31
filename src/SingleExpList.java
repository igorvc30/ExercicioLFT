public class SingleExpList extends ExpList {
	public Exp exp;
	
	public SingleExpList(Exp e) { exp = e; }

	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitSingleExpList(this);
	}
}