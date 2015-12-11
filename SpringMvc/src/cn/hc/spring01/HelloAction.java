package cn.hc.spring01;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloAction implements Controller{
	/**
	 * 
	 */
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 表示向视图封装的数据和路径
		 */
		ModelAndView  modelAndView=new ModelAndView();
		modelAndView.addObject("message","111111");
		modelAndView.setViewName("/index.jsp");
		return modelAndView;
	}

}
