package cn.hc.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import cn.hc.domain.Percentage;
import cn.hc.service.AcledService;
import cn.hc.service.CreatePiepicture;

public class pieSearchServlet extends HttpServlet {
	AcledService acledService=new AcledService();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		List<Percentage> percentages=acledService.getPercentagesByCountryName("India");
		PrintWriter out=response.getWriter();
		System.out.println(new JSONArray().fromObject(percentages));
		out.print(new JSONArray().fromObject(percentages));
	}
	/**
	 * [{
            type: 'pie',
            name: 'Browser share',
            data: [
                ['Firefox',   45.0],
                ['IE',       26.8],
                {
                    name: 'Chrome',
                    y: 12.8,
                    sliced: true,
                    selected: true
                },
                ['Safari',    8.5],
                ['Opera',     6.2],
                ['Others',   0.7]
            ]
        }]
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String country=request.getParameter("country");
		List<Percentage> percentages=acledService.getPercentagesByCountryName(country);
		PrintWriter out=response.getWriter();
		System.out.println(new JSONArray().fromObject(percentages));
		out.print(new JSONArray().fromObject(percentages));
	}

}
