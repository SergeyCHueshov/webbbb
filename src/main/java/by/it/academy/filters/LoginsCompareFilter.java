package by.it.academy.filters;


import by.it.academy.enteties.User;
import by.it.academy.repositories.UserRepositoryImpl;
import by.it.academy.services.UserService;
import by.it.academy.services.UserServiceImpl;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(urlPatterns = {"/user/create"})
public class LoginsCompareFilter extends HttpFilter {
    private static final long serialVersionUID = 5992383555475358650L;
    private static final String USERS_URL = "/user/create";
    UserService userService;
    FilterConfig config;

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
        List<User> users = new ArrayList<>();
        userService = new UserServiceImpl(new UserRepositoryImpl(users));
        config.getServletContext().setAttribute("userService", userService);
    }
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        List<User> users = userService.readUsers();
        String login = req.getParameter("login");
        do {
            req.getRequestDispatcher(USERS_URL).forward(req, res);
        }
        while (users.isEmpty());

        for (User user : users) {
            if (login.equals(user.getLogin())) {
                req.getRequestDispatcher("errors/loginmistake.jsp");
            } else {
                chain.doFilter(req, res);
            }

        }
    }

    @Override
    public void destroy() {

    }
}
