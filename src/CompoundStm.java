public class CompoundStm extends Stm {
	public Stm stm1,stm2;
	
	public CompoundStm(Stm s1, Stm s2) { stm1=s1; stm2=s2; }
	@Override
	public String print() {
		return stm1.print() + ";" + stm2.print();
	}
	@Override
	public void evaluate(Memory m) {
		stm1.evaluate(m);
		stm2.evaluate(m);
	}
}