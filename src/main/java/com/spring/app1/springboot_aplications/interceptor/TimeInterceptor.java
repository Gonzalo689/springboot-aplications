package com.spring.app1.springboot_aplications.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {

    private static final String START_TIME = "startTime";

    public boolean preHandle(HttpServletRequest request, 
                              HttpServletResponse response, 
                              Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute(START_TIME, startTime);
        return true;
    }
    
    public void postHandle(HttpServletRequest request, 
                               HttpServletResponse response, 
                               Object handler, 
                               ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute(START_TIME);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Tiempo de procesamiento: " + duration + " ms");
    }

}
