package cn.hc.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import cn.hc.service.AcledService;

public class monthCountServlet extends HttpServlet {
	AcledService acledService=new AcledService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String country=request.getParameter("country");
		System.out.println(new JSONArray().fromObject(acledService.getMonthmonCountBycountryName(country)).toString());
		response.getWriter().write(new JSONArray().fromObject(acledService.getMonthmonCountBycountryName(country)).toString());
		
	}

}
