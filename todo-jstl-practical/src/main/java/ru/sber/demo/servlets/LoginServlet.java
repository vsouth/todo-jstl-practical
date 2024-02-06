package ru.sber.demo.servlets;

import ru.sber.demo.model.user.User;
import ru.sber.demo.repo.user.MemoryUserRepoImpl;
import ru.sber.demo.repo.user.UserRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserRepo userRepo;

    @Override
    public void init() throws ServletException {
        userRepo = new MemoryUserRepoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getServletContext()
                .getRequestDispatcher("/pages/login.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        System.out.println("login = " + login + " password = " + password);
        Optional<User> user = userRepo.findByLogin(login);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            req.getSession(true).setAttribute("user", user.get());
            resp.sendRedirect(req.getContextPath() + "/users");
        } else {
            req.getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
        }
    }
}
