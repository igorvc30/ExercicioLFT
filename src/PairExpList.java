
public class PairExpList extends ExpList {
	public Exp head;
	public ExpList tail;
	
	public PairExpList(Exp e, ExpList l) { head=e; tail = l; }
	
	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitPairExpList(this);
	}


}