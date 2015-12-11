package cn.hc.spring05;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class EmpAction extends AbstractCommandController {
	public EmpAction(){
		this.setCommandClass(Emp.class);
	}
	/**
	 *  自定义类型转换器，将String类型转换成Date类型
	 */
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		// TODO Auto-generated method stub
		//向Spring中注册一个类型转换器
		/*
		 * 参数1：将String转换成什么类型的字节码 
		 * 参数2:自定义转换规则
		 */
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
	/**
	 * Obj表示封装后的实体
	 * Error表示封装时候产生的错误
	 */
	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object obj, BindException arg3)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "增加员工成功");
		Emp emp=(Emp)obj;
		System.out.println(emp.getUsername()+"  "+emp.getGender()+"  "+emp.getHiredate());
		modelAndView.setViewName("/index.jsp");
		return modelAndView;
	}

}
