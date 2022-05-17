package chainofresponsibility;

public class ExistingUserCheck extends Operator{

	private final Database database;
	
	public ExistingUserCheck(Database database) {
		this.database = database;
	}
	
	
	@Override
	public boolean operate(String username, String password) {
		if (!database.isValid(username)) {
			System.out.println("Potrebitelskoto ime ne e validno!");
			System.out.println("Regiistriraite se v nashto prilojenie!");
            return false;
		}
		return operateNext(username, password) ;
	}

	
	
}
