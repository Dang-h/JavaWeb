package test;

import org.junit.jupiter.api.Test;

import bean.User;
import dao.UserDAO;
import imple_userdao.UserDAOImple;

class UserDAOTest {

	UserDAO dao = new UserDAOImple();
	
	@Test
	void testCheckNameAndPassword() {
		User user = dao.checkNameAndPassword("admin", "123456");
		System.out.println(user);
	}

	@Test
	void testCheckUsername() {
		boolean username = dao.checkUsername("admin2");
		boolean username2 = dao.checkUsername("admin");
		System.out.println(username2);
	}

	@Test
	void testSaveUser() {
		dao.saveUser("test", "test", "test@test.com");
	}

}
