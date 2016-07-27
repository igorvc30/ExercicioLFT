
public class PrintStm extends Stm {
	public ExpList exps;
	
	public PrintStm(ExpList es) { exps = es; }
	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "print("+ exps.print() + ")";
	}
	@Override
	public void evaluate(Memory m) {
		// TODO Auto-generated method stub
		System.out.println("print("+ exps.evaluate(m) + ")");
	}
}