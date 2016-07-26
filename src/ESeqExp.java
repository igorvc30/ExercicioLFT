public class ESeqExp extends Exp {
	public Stm stm;
	public Exp exp;
	public ESeqExp(Stm s, Exp e) {
		stm = s; exp = e; }
	public String print(){
		return "(" + stm.print() + "," + exp.print() + ")";
	}
}
