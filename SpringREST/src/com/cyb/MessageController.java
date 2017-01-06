package com.cyb;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController  {

	
	@RequestMapping("/welcome")
	public ModelAndView message1(HttpServletRequest httpServletRequest) throws Exception
	{
		ModelAndView view=new ModelAndView("hello");
		httpServletRequest.getSession().setAttribute("msg", "welcome to ALM MATURITY from Hemant");
		return view;
	}
}
