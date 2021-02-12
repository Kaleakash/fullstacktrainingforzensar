package com.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller						// it is a type contoller like Servlet. 
public class SimpleController {

					@RequestMapping(value = "welcome")				// It is use to map are by Default doGet() 
					public ModelAndView sayHello() {
							System.out.println("I Came here through welcome");
							ModelAndView mav = new ModelAndView();
							mav.setViewName("display.jsp");
							return mav;
					}
					
					@RequestMapping(value = "demo")				// It is use to map are by Default doGet() 
					public ModelAndView sayDemo() {
							System.out.println("I Came here through demo");
							ModelAndView mav = new ModelAndView();
							mav.setViewName("display.jsp");
							return mav;
					}
					
					@RequestMapping(value = "check")
					public ModelAndView checkUser(HttpServletRequest req) {			//pull HttpServletRequest object by default get consider 
						String user  = req.getParameter("user");
						String pass = req.getParameter("pass");
						ModelAndView mav = new ModelAndView();
						if(user.equals("Ajay") && pass.equals("123")) {
								mav.setViewName("success.jsp");
						}else {
							mav.setViewName("failure.jsp");
						}
						return mav;
					}
					
					
}
