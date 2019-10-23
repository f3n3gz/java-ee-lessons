package ru.geekbrains.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/*",dispatcherTypes = DispatcherType.ERROR)
public class ErrorFilter extends HttpFilter {
    private static final Logger logger = LoggerFactory.getLogger(ErrorFilter.class);

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        logger.info("Error filter start");
        if (res.getStatus() == 404 ) {
            logger.info("Error filter forward");
            req.getRequestDispatcher("/error404.jsp").forward(req, res);
        }
        chain.doFilter(req, res);
    }
}
