package com.example.secapp.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;

public class SecondSecurityFilter extends GenericFilterBean {

    // GenericFilterBean have properties automatically injected by SpringBoot
    // OncePerRequestFilter only once per request filter

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before filter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("After filter");
    }
}
