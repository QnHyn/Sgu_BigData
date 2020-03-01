package com.hynqn.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.hynqn.com.bean.Students;

/**
     * 给前台响应JSON格式数据
 */
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public JsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// 假设从数据库中查询到一条信息
		Students student = new Students("1", "白骨精", "男", "18", "你猜");
		// 创建Gson对象
		Gson gson = new Gson();
		// 把Students对象转换为json字符串
		String json = gson.toJson(student);
		System.out.println(json);
		response.getWriter().write(json);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
