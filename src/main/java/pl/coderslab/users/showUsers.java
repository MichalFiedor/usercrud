package pl.coderslab.users;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "showUsers", urlPatterns = {"/user/show"})
public class showUsers extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao= new UserDao();
        User user = userDao.read(Integer.parseInt(id));
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/show.jsp").forward(request, response);
    }
}
