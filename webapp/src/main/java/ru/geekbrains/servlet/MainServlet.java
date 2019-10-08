package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/main")
public class MainServlet extends HttpServlet {
    private static final Logger logger= LoggerFactory.getLogger(MainServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("MainServlet doGet.");
        Map<String, ? extends ServletRegistration> servletRegistrations = req.getServletContext().getServletRegistrations();
        resp.getWriter().printf("<h1>%s</h1>","Магазин");
        resp.getWriter().flush();
    }
}
