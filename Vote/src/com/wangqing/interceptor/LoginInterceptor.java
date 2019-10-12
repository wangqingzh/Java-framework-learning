package com.wangqing.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wangqing.bean.User;

public class LoginInterceptor implements HandlerInterceptor {
	int i = 0;
	/**
	 * 拦截登录请求
	 * 阻止未登录投票请求
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//登录页面 放行
		String url = request.getRequestURI();
		
		System.out.println("-----------------------------------------\n" + url + "\n" + i++ + "\n----------------------------------");
		if(url.indexOf("index") >= 0 || url.indexOf("login") >= 0) {
			return true;
		}
		//用户已登录 放行
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user_session");
		if(user != null) {
			return true;
		}
		
		request.setAttribute("msg", "您还没有登录，请先登录！");
		request.getRequestDispatcher("index.html").forward(request, response);
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
