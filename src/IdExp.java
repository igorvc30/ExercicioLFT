public class IdExp extends Exp{
	public String id;
	public IdExp(String i){id = i;}
	
	@Override
	public String print() {
		return id.toString();
	}
	@Override
	public int evaluate(Memory m) {
		return m.lookup(id);
	}
}