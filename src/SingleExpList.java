public class SingleExpList extends ExpList {
	public Exp exp;
	public SingleExpList(Exp e) { exp = e; }
	
	public String print(){
		return exp.print();
	}
}