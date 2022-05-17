package chainofresponsibility;

public class RoleCodeInfo extends Operator{

	@Override
	public boolean operate(String username, String password) {
		if ("admin_info".equals(username)) {
			System.out.println("Otvarqne na stranicata na administratora");
			return true;
		}
	System.out.println("Otvarqne na potrebitelska stranica");
		return operateNext(username,password);
	}

}
