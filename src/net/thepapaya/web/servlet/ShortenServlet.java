package net.thepapaya.web.servlet;

import net.thepapaya.dao.UrlDao;
import net.thepapaya.service.UrlService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Chao on 2016/12/16.
 */
public class ShortenServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = request.getParameter("url");
        UrlService service = new UrlService();
        String shortUrl = "no response";
        try {
            shortUrl = service.getShortUrl(address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
