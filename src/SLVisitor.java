
public interface SLVisitor {
	Object visitAssignStm(AssignStm stm);
	Object visitCompoundStm(CompoundStm stm);
	Object visitPrintStm(PrintStm stm);
	Object visitPlusExp(PlusExp exp);
	Object visitDivExp(DivExp exp);
	Object visitMinusExp(MinusExp exp);
	Object visitTimesExp(TimesExp exp);
	Object visitIdExp(IdExp exp);
	Object visitNumExp(NumExp exp);
	Object visitESeqExp(ESeqExp exp);
	Object visitSingleExpList(SingleExpList expList);
	Object visitPairExpList(PairExpList expList);
}
