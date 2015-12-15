package cn.hc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.faces.taglib.jsf_core.ConvertDateTimeTag;

import net.sf.json.JSONArray;

import cn.hc.service.AcledService;

public class yearSearchServlet extends HttpServlet {
   private	AcledService acledService=new AcledService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
	String country=	request.getParameter("country").trim();
	String startYear=request.getParameter("startYear").trim();
	String endYear=request.getParameter("endYear").trim();
	String returnJson=new JSONArray().fromObject(acledService.getCountByCountryNameAndYear(Integer.parseInt(startYear), Integer.parseInt(endYear), country)).toString();
	out.print(returnJson);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	String country=	request.getParameter("country");
	String startYear=request.getParameter("startYear");
	String endYear=request.getParameter("endYear");
	System.out.println(country+startYear+endYear);
		
	}

}
