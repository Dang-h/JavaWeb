package dao;

import bean.User;

public interface UserDAO {
	
	/**
	 * 
	 * @Description: 从数据库校验用户姓名和密码
	 *
	 * @Title: checkNameAndPassword
	 * @param username
	 * @param password
	 * @return	匹配返回用户详细信息；不匹配返回null
	 * @return: User
	 *
	 * @author: Dangh 
	 * @date: 2019年4月27日 下午7:22:21
	 */
	User checkNameAndPassword(String username, String password);
	
	/**
	 * 
	 * @Description: 与数据库校验用户名是否存在
	 *
	 * @Title: checkUsername
	 * @param username
	 * @return 用户名不可用返回 true； 用户名可用返回 false
	 *
	 * @author: Dangh 
	 * @date: 2019年4月27日 下午7:24:21
	 */
	boolean checkUsername(String username);
	
	/**
	 * 
	 * @Description: 存储新用户基本信息到数据库
	 *
	 * @Title: saveUser
	 * @param username
	 * @param password
	 * @param email
	 * @return: void
	 *
	 * @author: Dangh 
	 * @date: 2019年4月27日 下午7:26:41
	 */
	void saveUser(String username, String password, String email);
}
