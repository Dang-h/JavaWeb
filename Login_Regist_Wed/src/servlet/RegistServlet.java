package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import imple_userdao.UserDAOImple;

public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户名、密码、邮箱
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		//处理用户输入信息
		UserDAOImple dao = new UserDAOImple();
		//验证用户名
		boolean flag = dao.checkUsername(username);
		if (flag) {
			//用户名存在，提示用户名已存在
			request.setAttribute("msg", "用户名已存在！请重新输入！");
			//转发到注册页
			RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/regist.jsp");
			//转发
			dispatcher.forward(request, response);
		} else {
			//用户名可用,存储数据
			dao.saveUser(username, password, email);
			//重定向到注册成功页面
			response.sendRedirect(request.getContextPath() + "/pages/regist_success.jsp");
			
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
