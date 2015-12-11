package cn.hc.spring01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Hello2Action  implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "这是一个Spring应用程序");
		/**
		 * 原来封装真是路径，现在封装逻辑名称
		 */
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
