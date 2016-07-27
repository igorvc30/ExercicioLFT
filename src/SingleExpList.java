public class SingleExpList extends ExpList {
	public Exp exp;
	
	public SingleExpList(Exp e) { exp = e; }
	public String print(){
		return exp.print();
	}

	@Override
	public int evaluate(Memory m) {
		// TODO Auto-generated method stub
		return exp.evaluate(m);
	}
}