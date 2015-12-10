package cn.hc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;



import cn.hc.daoImpl.AcledDaoImpl;
import cn.hc.domain.Point;

public class PointServlet extends HttpServlet {
	private static AcledDaoImpl acledDaoImpl=new AcledDaoImpl();
	/**
	 * Constructor of the object.
	 */
	public PointServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	PrintWriter out = response.getWriter();
//	    List<Point> points=new ArrayList<Point>();
//	    Point point1=new Point(111.11, 22.22, "���Ǵ���Ĳ�����Ϣ");
//	    Point point2=new Point(134.56,33.8,"������Ϣ2");
//	    points.add(point1);
//	    points.add(point2);
	    //out.println(new JSONArray().fromObject(points));
    	out.println(new JSONArray().fromObject(acledDaoImpl.findAllp()));
    }
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
	    acledDaoImpl.findAllp();
	    //System.out.println("zhixing");
	    System.out.println(new JSONArray().fromObject(acledDaoImpl.findAllp()));
	    out.println(new JSONArray().fromObject(acledDaoImpl.findAllp()));
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
