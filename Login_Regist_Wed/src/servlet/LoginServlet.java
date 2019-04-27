package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import imple_userdao.UserDAOImple;


/**
 * 
 * 
 * @Description: 处理用户的登录信息
 * @ClassName: LoginServlet
 *
 * @return:
 *
 * @author: Dangh
 * @date: 2019年4月27日 下午8:53:55
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符集
		request.setCharacterEncoding("UTF-8");
		
		//获取用户信息
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//验证用户信息
		UserDAOImple dao = new UserDAOImple();
		User user = dao.checkNameAndPassword(username, password);
		
		//处理用户信息
		if (user != null) {
			//匹配成功，从定向到登录成功页面
			response.sendRedirect(request.getContextPath() + "/pages/login_success.jsp");
		} else {
			//用户名或密码不正确，提示
			request.setAttribute("msg", "用户名或密码错误！");
			//转发到登录页
			RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/login.jsp");
			//转发
			dispatcher.forward(request, response);
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
