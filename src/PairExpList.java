
public class PairExpList extends ExpList {
	public Exp head;
	public ExpList tail;
	
	public PairExpList(Exp e, ExpList l) { head=e; tail = l; }
	
	public String print(){
		return head.print() + "," + tail.print();
	}

	@Override
	public String evaluate(Memory m) {
		return head.evaluate(m) + " " + tail.evaluate(m);
	}
}