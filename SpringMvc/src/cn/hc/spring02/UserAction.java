package cn.hc.spring02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserAction implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("message", "增加用户成功");
	modelAndView.setViewName("index");
		return modelAndView;
	}

}
