package com.example.secapp.security.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class CustomSecurityFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After filter");
    }
}
