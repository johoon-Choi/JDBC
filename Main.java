package johoon;

public class Main {
	public static void main(String[] args) {
		userDAO mem = new userDAOimple();
		
		System.out.println(" Delete all! " + mem.deleteAll());
		
		mem.insert(new userVO("johoon", "Suwon", "22264687", "210127"));
		mem.insert(new userVO("yujeong", "Seoul", "41570430", "960430"));
		mem.insert(new userVO("wallace", "Kansas", "77777777", "031004"));
		
		
	}
}
