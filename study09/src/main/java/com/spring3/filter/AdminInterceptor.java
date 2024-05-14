package com.spring3.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring3.dto.Custom;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Custom cus = (Custom) session.getAttribute("cus");
		
		if(session.getAttribute("cus")==null) {
			response.sendRedirect(request.getContextPath()+"/custom/login.do");
			return false;
		}
		if(cus.getId().equals("admin")) {
			return true;
		}
		else {
			response.sendRedirect(request.getContextPath()+"/custom/login.do");
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
	
}
