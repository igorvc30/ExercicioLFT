
public class main {

	public static void main(String[] args) {

		Stm teste = new AssignStm("a", new PlusExp(new NumExp(5),new NumExp(3)));
		Stm teste2 = new AssignStm("b", new TimesExp(new NumExp(5),new NumExp(3)));//teste nao oficial
		Stm teste1 = new PrintStm(new SingleExpList(new IdExp("b")));
		Stm juntos1 = new CompoundStm(teste2,teste1);
		Stm juntos = new CompoundStm(teste, juntos1);
//		Stm teste = new AssignStm("b", new ESeqExp(new PrintStm(new PairExpList(new IdExp("a"), new SingleExpList(new MinusExp(new IdExp("a", new NumExp(1))) , new TimesExp( new NumExp(10), new IdExp("a"))	
		//Stm teste = new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1)))));
		/*
		Stm teste = new CompoundStm( new AssignStm("a", new PlusExp(new NumExp(5),new NumExp(3))),
				new CompoundStm(new AssignStm("b",
						new ESeqExp(
							new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1))))),
							new TimesExp(new NumExp(10), new IdExp("a")))),
					new PrintStm(new SingleExpList(new IdExp("b")))));
		System.out.println(teste.print());
		*/
		
		Memory m = new Memory();
		
		juntos.evaluate(m);
		System.out.println(m);
		
	}

}
