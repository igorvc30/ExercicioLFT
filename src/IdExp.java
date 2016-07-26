public class IdExp extends Exp{
	public String id;
	public IdExp(String i){id = i;}
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return id.toString();
	}
}