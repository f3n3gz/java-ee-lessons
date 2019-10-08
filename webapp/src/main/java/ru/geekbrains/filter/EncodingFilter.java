package ru.geekbrains.filter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/cart","/order","/main","/product","/catalog"},dispatcherTypes = DispatcherType.REQUEST)
public class EncodingFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        res.setHeader("Content-Type", "text/html; charset=utf-8");
        res.getWriter().flush();
        chain.doFilter(req,res);
    }
}
