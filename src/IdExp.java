public class IdExp extends Exp{
	public String id;
	public IdExp(String i){id = i;}
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return id.toString();
	}
	@Override
	public int evaluate(Memory m) {
		// TODO Auto-generated method stub
		return m.lookup(id);
	}
}