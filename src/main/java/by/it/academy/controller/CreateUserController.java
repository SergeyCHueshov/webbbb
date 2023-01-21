package by.it.academy.controller;

import by.it.academy.enteties.User;
import by.it.academy.repositories.UserRepositoryImpl;
import by.it.academy.services.UserService;
import by.it.academy.services.UserServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/user/create")
public class CreateUserController extends HttpServlet {

    private final static long serialVersionUID = 2324052530258205L;
    private static final String USERS_URI = "/user/read";
    private UserService userService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String secondname = req.getParameter("secondname");
        int age = Integer.parseInt(req.getParameter("age"));
        userService.createUser(firstname, secondname, age);
        req.getRequestDispatcher(USERS_URI).forward(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        List<User> users = new ArrayList<>();
        userService = new UserServiceImpl(new UserRepositoryImpl(users));
        config.getServletContext().setAttribute("userService", userService);
    }
}
