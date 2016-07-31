
public class SLPrinter implements SLVisitor{

	@Override
	public Object visitAssignStm(AssignStm stm) {
		return stm.id + ":=" + stm.exp.accept(this);
	}

	@Override
	public Object visitCompoundStm(CompoundStm stm) {
		return stm.stm1.accept(this) + ";" + stm.stm2.accept(this);
	}

	@Override
	public Object visitPrintStm(PrintStm stm) {
		return "print("+ stm.exps.accept(this) + ")";
	}

	@Override
	public Object visitPlusExp(PlusExp exp) {
		return  "(" + exp.left.accept(this) + "+" + exp.right.accept(this) + ")";
	}

	@Override
	public Object visitDivExp(DivExp exp) {
		return  "(" + exp.left.accept(this) + "/" + exp.right.accept(this) + ")";
	}

	@Override
	public Object visitMinusExp(MinusExp exp) {
		return  "(" + exp.left.accept(this) + "-" + exp.right.accept(this) + ")";
	}

	@Override
	public Object visitTimesExp(TimesExp exp) {
		return  "(" + exp.left.accept(this) + "*" + exp.right.accept(this) + ")";
	}

	@Override
	public Object visitIdExp(IdExp exp) {
		return exp.id;
	}

	@Override
	public Object visitNumExp(NumExp exp) {
		return String.valueOf(exp.num);
	}

	@Override
	public Object visitESeqExp(ESeqExp exp) {
		return "(" + exp.stm.accept(this) + "," + exp.exp.accept(this) + ")";
	}

	@Override
	public Object visitSingleExpList(SingleExpList expList) {
		return expList.exp.accept(this) + "" ;
		
	}

	@Override
	public Object visitPairExpList(PairExpList expList) {
		return expList.head.accept(this) + "," + expList.tail.accept(this);
	}

}
