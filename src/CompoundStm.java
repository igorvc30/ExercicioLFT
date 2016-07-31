public class CompoundStm extends Stm {
	public Stm stm1,stm2;
	
	public CompoundStm(Stm s1, Stm s2) { stm1=s1; stm2=s2; }
	
	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitCompoundStm(this);
	}
}