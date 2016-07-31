public class ESeqExp extends Exp {
	public Stm stm;
	public Exp exp;
	
	public ESeqExp(Stm s, Exp e) {
		stm = s; exp = e; 
	}
	
	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitESeqExp(this);
	}
}
