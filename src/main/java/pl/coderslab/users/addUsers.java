package pl.coderslab.users;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addUser", urlPatterns = {"/user/add"})
public class addUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        User createdUser = new User();
        createdUser.setUserName(request.getParameter("name"));
        createdUser.setEmail(request.getParameter("email"));
        createdUser.setPassword(request.getParameter("password"));
        userDao.create(createdUser);
        response.sendRedirect(request.getContextPath() + "/user/list");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/users/add.jsp").forward(request, response);

    }
}
