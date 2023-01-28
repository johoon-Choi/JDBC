package johoon;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		userDAO mem = new userDAOimple();
		
		System.out.println(" Delete all! " + mem.deleteAll());
		
		List<userVO> users = new ArrayList<>();
		users.add(new userVO("johoon", "Suwon", "22264687", "210127"));
		users.add(new userVO("yujeong", "Seoul", "41570430", "960430"));
		users.add(new userVO("wallace", "Kansas", "77777777", "031004"));
		
		for (userVO user : users) {
			mem.insert(user);
		}
		
		System.out.println(" Before updating...\n" + mem.selectAll());
		
		mem.update(users.get(2));
		
		System.out.println(" After updating...\n" + mem.selectAll());
	}
}
