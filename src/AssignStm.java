public class AssignStm extends Stm {
	public String id;
	public Exp exp;
	
	public AssignStm(String i, Exp e) { id = i; exp = e; }
	public String print() {
		return id + ":=" + exp.print();
	}
	@Override
	public void evaluate(Memory m) {
		m.update(id, exp.evaluate(m));
	}
	
}