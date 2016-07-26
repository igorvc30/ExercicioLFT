
public class PrintStm extends Stm {
	public ExpList exps;
	public PrintStm(ExpList es) { exps = es; }
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "print("+ exps.print() + ")";
	}
}