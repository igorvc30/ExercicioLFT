
public class main {

	public static void main(String[] args) {

		//Stm teste = new AssignStm("a", new PlusExp(new NumExp(5),new NumExp(3)));
		//Stm teste = new PrintStm(new SingleExpList(new IdExp("b")));
//		Stm teste = new AssignStm("b", new ESeqExp(new PrintStm(new PairExpList(new IdExp("a"), new SingleExpList(new MinusExp(new IdExp("a", new NumExp(1))) , new TimesExp( new NumExp(10), new IdExp("a"))	
		//Stm teste = new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1)))));
		
		Stm teste = new CompoundStm( new AssignStm("a", new PlusExp(new NumExp(5),new NumExp(3))),
				new CompoundStm(new AssignStm("b",
						new ESeqExp(
							new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1))))),
							new TimesExp(new NumExp(10), new IdExp("a")))),
					new PrintStm(new SingleExpList(new IdExp("b")))));
	
		System.out.println(teste.print());
	}

}
