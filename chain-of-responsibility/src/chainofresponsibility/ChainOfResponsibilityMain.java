package chainofresponsibility;

public class ChainOfResponsibilityMain {

	 public static void main(String[] args) {

	        Database database = new Database();
	        Operator operator = new ExistingUserCheck(database);
	        operator.setNextOperator(new PasswordValidation(database))
	                .setNextOperator(new RoleCodeInfo());
	        Authentication service = new Authentication(operator);


	        System.out.println(service.logIn("username", "password"));

	        System.out.println(service.logIn("user_username", "password"));

	        System.out.println(service.logIn("admin_username", "admin_password"));


	    }

	
}
