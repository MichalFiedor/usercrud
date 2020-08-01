package pl.coderslab.users;

import org.apache.commons.lang3.ObjectUtils;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserList", urlPatterns = {"/user/list"})
public class users extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            UserDao userDao = new UserDao();
            request.setAttribute("users", userDao.findAll());
            getServletContext().getRequestDispatcher("/users/list.jsp").forward(request, response);
        }catch (NullPointerException e){
            response.getWriter().println(e.getMessage());
        }
    }
}
