package ru.sber.demo.servlets;

import ru.sber.demo.model.user.Role;
import ru.sber.demo.model.user.User;
import ru.sber.demo.repo.user.MemoryUserRepoImpl;
import ru.sber.demo.repo.user.UserRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/users")
public class UsersServlet extends HttpServlet {
    private UserRepo userRepo;

    @Override
    public void init() throws ServletException {
        userRepo = new MemoryUserRepoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userRepo.findAll();
        req.setAttribute("users", users);
        System.out.println(req.getSession(false).getAttribute("user"));
        req.getServletContext()
                .getRequestDispatcher("/pages/users.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        userRepo.create(new User(10, login, "123", LocalDate.MAX, Role.USER));
        resp.sendRedirect(req.getContextPath() + "/users");
    }
}
