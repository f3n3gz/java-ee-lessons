package ru.geekbrains.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(urlPatterns = {"/cart","/order","/main","/product","/catalog"})
public class NavFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
//        res.setHeader("Content-Type", "text/html; charset=utf-8");
//        getServletContext().getRequestDispatcher("/nav.html").include(req,res);
    }
}
