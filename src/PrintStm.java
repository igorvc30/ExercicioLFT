
public class PrintStm extends Stm {
	public ExpList exps;
	
	public PrintStm(ExpList es) { exps = es; }
	@Override
	public String print() {
		return "print("+ exps.print() + ")";
	}
	@Override
	public void evaluate(Memory m) {
		System.out.println(exps.evaluate(m));
	}
}