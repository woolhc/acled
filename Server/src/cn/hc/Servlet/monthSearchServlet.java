package cn.hc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.hc.daoImpl.AcledDaoImpl;

import net.sf.json.JSONArray;

public class monthSearchServlet extends HttpServlet {
	private static AcledDaoImpl acledDaoImpl=new AcledDaoImpl();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String month=request.getParameter("mon");
		request.getAttribute("mon");
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
	    //System.out.println("zhixing");
	   // System.out.println(new JSONArray().fromObject(acledDaoImpl.findAllp()));
	    out.println(new JSONArray().fromObject(acledDaoImpl.findByMonth(month)));
	    
		
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
