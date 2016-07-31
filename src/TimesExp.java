public class TimesExp extends Exp{
	public Exp left, right;
	
	public TimesExp(Exp l, Exp r){
		left = l; right = r;}

	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitTimesExp(this);
	}
}
