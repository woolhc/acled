package cn.hc.spring03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmpAction implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView=new ModelAndView();
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		modelAndView.addObject("message", username);
		System.out.println(username);
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
