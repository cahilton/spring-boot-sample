package org.ohdsi.oae.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/"})
public class MainController {
	
	private static final String HOME_TEMPLATE_NAME = "templates/index";
	private static final String ERROR_TEMPLATE_NAME = "templates/error";
	
	@Value("${application.message}")
	private String message;

	@RequestMapping(value = "index")
	public ModelAndView handleIndexRequest(final HttpServletRequest request, final HttpServletResponse res,
			final HttpSession session) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView(HOME_TEMPLATE_NAME);
		modelAndView.addObject("currentTime", new Date());
		modelAndView.addObject("message", this.message);
		return modelAndView;
		
	}
	
	@RequestMapping(value = "error")
	public ModelAndView handleErrorRequest(final HttpServletRequest request, final HttpServletResponse res,
			final HttpSession session) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView(ERROR_TEMPLATE_NAME);
		return modelAndView;
		
	}
}
