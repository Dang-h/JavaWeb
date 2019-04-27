package imple_userdao;

import bean.User;
import dao.UserDAO;
import utils.BasicDao;

public class UserDAOImple implements UserDAO{

	//实例化BasicDao
	BasicDao dao = new BasicDao();
	
	@Override
	public User checkNameAndPassword(String username, String password) {
		String sql = "select * from users where username = ? and password = ?";
		//获取用户信息
		User user = dao.getBean(User.class, sql, "username", "password");
		return user;
	}

	@Override
	public boolean checkUsername(String username) {
		boolean flag = false;
		String sql = "seletc * from users where username = ?";
		//从数据库获取用户姓名
		User uName = dao.getBean(User.class, sql, "username");
		//判断用户名是否可用
		if (uName != null) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void saveUser(String username, String password, String email) {
		String sql = "insert into users (username, password, email) values(?, ?, ?)";
		//存储用户数据到数据库
		dao.update(sql, "username", "password", "email");
	}

}
