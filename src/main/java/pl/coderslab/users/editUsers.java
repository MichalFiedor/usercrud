package pl.coderslab.users;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "editUser", urlPatterns = {"/user/edit"})
public class editUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        User user = userDao.read(Integer.parseInt(id));
        String updatedName = request.getParameter("name");
        String updatedEmail = request.getParameter("email");
        String password = request.getParameter("password");
            if (updatedName.length()==0){
                updatedName=user.getUserName();
        }
        if (updatedEmail.length()==0){
            updatedEmail=user.getEmail();
        }
        if (password.length()==0){
            password=user.getPassword();
        }
        User updatedUser = new User();
        updatedUser.setId(Integer.parseInt(id));
        updatedUser.setUserName(updatedName);
        updatedUser.setEmail(updatedEmail);
        updatedUser.setPassword(password);
        userDao.update(updatedUser);
        response.sendRedirect(request.getContextPath() + "/user/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        User read = userDao.read(Integer.parseInt(id));
        request.setAttribute("user", read);
        getServletContext().getRequestDispatcher("/users/edit.jsp").forward(request, response);
    }
}
