public class main {

	public static void main(String[] args) {

//		Stm ta = new AssignStm("a", new PlusExp(new NumExp(5),new NumExp(3)));
//		Stm tb = new AssignStm("b", new DivExp(new IdExp("a"), new NumExp(2)));
//		Stm ta2 = new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1)))));
//		Stm ja1 = new CompoundStm(ta, tb);
//		Stm teste1 = new PrintStm(new SingleExpList(new ESeqExp(new PrintStm(new SingleExpList(new IdExp("a"))),new TimesExp( new NumExp(10), new IdExp("a")))));
//		Stm s1 = new PrintStm(new SingleExpList(new NumExp(5)));		
//		Stm t1 = new AssignStm("b", new ESeqExp(new PrintStm(new PairExpList(new IdExp("a"), new SingleExpList(new MinusExp(new IdExp("a", new NumExp(1))) , new TimesExp( new NumExp(10), new IdExp("a")));	
//		Stm t2 = new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1)))));
//		Stm juntos = new CompoundStm(ja1,t2);
//		Stm testeAB = new CompoundStm(new AssignStm("b", new DivExp(new IdExp("b"),new NumExp(2))), new AssignStm("a", new MinusExp(new IdExp("b"),new IdExp("a"))));
//		Stm tt = new CompoundStm(ta, teste1);
		/** EXEMPLO DO SLIDE ***/
		
		Stm exp = new CompoundStm( new AssignStm("a", new PlusExp(new NumExp(5),new NumExp(3))),
				new CompoundStm(new AssignStm("b",
						new ESeqExp(
							new PrintStm (new PairExpList(new IdExp("a") ,new SingleExpList(new MinusExp(new IdExp("a"), new NumExp(1))))),
							new TimesExp(new NumExp(10), new IdExp("a")))),
					new PrintStm(new SingleExpList(new IdExp("b")))));
		Stm adp = exp;			
		
		SLPrinter printer = new SLPrinter();
		SLInterpreter interpreter = new SLInterpreter();
		//exp.evaluate(m);
		System.out.println(adp.accept(printer));
		adp.accept(interpreter);
		System.out.println(interpreter);
	}
}
