
public class SLInterpreter implements SLVisitor{
	Memory m = new Memory();
	@Override
	public Object visitAssignStm(AssignStm stm) {
		 m.update(stm.id, (int)stm.exp.accept(this));
		return null;
	}

	@Override
	public Object visitCompoundStm(CompoundStm stm) {
		stm.stm1.accept(this);
		stm.stm2.accept(this);
		return null;
	}

	@Override
	public Object visitPrintStm(PrintStm stm) {
		System.out.println(stm.exps.accept(this));
		return null;
	}

	@Override
	public Object visitPlusExp(PlusExp exp) {
		return (int)exp.left.accept(this) + (int)exp.right.accept(this) ;
	}

	@Override
	public Object visitDivExp(DivExp exp) {
		return (int)exp.left.accept(this) / (int)exp.right.accept(this) ;
	}

	@Override
	public Object visitMinusExp(MinusExp exp) {
		return (int)exp.left.accept(this) - (int)exp.right.accept(this) ;
	}

	@Override
	public Object visitTimesExp(TimesExp exp) {
		return (int)exp.left.accept(this) * (int)exp.right.accept(this) ;
	}

	@Override
	public Object visitIdExp(IdExp exp) {
		return m.lookup(exp.id);
	}

	@Override
	public Object visitNumExp(NumExp exp) {
		return exp.num;
	}

	@Override
	public Object visitESeqExp(ESeqExp exp) {
		exp.stm.accept(this);
		return exp.exp.accept(this);
	}

	@Override
	public Object visitSingleExpList(SingleExpList expList) {
		return expList.exp.accept(this);
	}

	@Override
	public Object visitPairExpList(PairExpList expList) {
		return expList.head.accept(this) + " " + expList.tail.accept(this);
	}

	public String toString(){
		return m.toString();
	}
}
