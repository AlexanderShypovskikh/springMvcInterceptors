package com.shypovskikh.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.shypovskikh.model.User;

@Component
public class CheckUserInterceptor extends HandlerInterceptorAdapter{
	
	/*@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			             Object handler, Exception ex)throws Exception{

        User user = (User) request.getAttribute("user");
        if(user == null || !user.isAdmin()) {
        	response.sendRedirect(request.getContextPath()+"/failed");
        }
	} */
	
	
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
		if(request.getRequestURI().contains("check-user")) {
			 User user = (User) modelAndView.getModel().get("user");
		        if(user == null || !user.isAdmin()) {
		        	response.sendRedirect(request.getContextPath()+"/failed");
		        } 
		}
	}
	
}



















