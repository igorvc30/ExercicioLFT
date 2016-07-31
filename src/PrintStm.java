
public class PrintStm extends Stm {
	public ExpList exps;
	
	public PrintStm(ExpList es) { exps = es; }

	@Override
	public Object accept(SLVisitor visitor) {
		return visitor.visitPrintStm(this);
	}
}