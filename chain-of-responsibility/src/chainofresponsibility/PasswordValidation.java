package chainofresponsibility;

public class PasswordValidation extends Operator {

	private final Database database;

    public PasswordValidation(Database database) {
        this.database = database;
    }
	
	@Override
	public boolean operate(String username, String password) {
		
		if (!database.isValidPassword(username, password)) {
            System.out.println("Greshna parola!");
            return false;
		
	}
		return operateNext(username, password);

}
}
