package chainofresponsibility;

public abstract class Operator {

	private Operator next;
	
	public Operator setNextOperator (Operator next) {
		this.next = next;
		return next;
	}
	
	public abstract boolean operate(String username, String password);
	
	protected boolean operateNext(String username, String password) {
		if (next == null)
		{
			return true;
		}
		return next.operate(username, password);
	}
	
}
