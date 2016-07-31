public class AssignStm extends Stm {
	public AssignStm(String id, Exp exp) {
		super();
		this.id = id;
		this.exp = exp;
	}

	public String id;
	public Exp exp;

	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitAssignStm(this);
	}
	
}