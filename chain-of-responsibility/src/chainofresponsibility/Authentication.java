package chainofresponsibility;

public class Authentication {

	private final Operator operator;
	
	public Authentication(Operator operator) {
        this.operator = operator;
    }

    public boolean logIn(String email, String password) {
        if (operator.operate(email, password)) {
            System.out.println("Otoriziraneto beshe uspeshno!");
            
            return true;
        }
        return false;
    }
	
	
}
