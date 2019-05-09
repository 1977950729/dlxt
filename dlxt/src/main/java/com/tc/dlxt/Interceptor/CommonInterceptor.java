package com.tc.dlxt.Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CommonInterceptor extends HandlerInterceptorAdapter {
    private final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //如果用户已登录也放行
        //if (session.getAttribute("user") != null) {
        if (session.getAttribute("user") == null) {
            return true;
        }
        String path = request.getContextPath();
        //用户没有登录挑战到登录页面
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        return false;
    }
}
