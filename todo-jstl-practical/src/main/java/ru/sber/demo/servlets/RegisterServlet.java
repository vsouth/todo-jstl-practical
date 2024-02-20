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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserRepo userRepo;

    @Override
    public void init() throws ServletException {
        userRepo = new MemoryUserRepoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            resp.sendRedirect(req.getContextPath() + "login");
            return;
        }
        User user = (User) session.getAttribute("user");
        if (user.getRole() == Role.USER) {
            resp.sendRedirect(req.getContextPath() + "/users");
            return;
        }
        req.getServletContext().getRequestDispatcher("/pages/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        LocalDate birthday = LocalDate.parse(req.getParameter("birthday"));
        String role = req.getParameter("role");
        userRepo.create(new User(userRepo.getNextId(), login, password, birthday, Role.valueOf(role)));
        resp.sendRedirect(req.getContextPath() + "/users");
    }
}
