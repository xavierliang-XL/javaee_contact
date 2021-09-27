package ca.xavier.web.servlet;

import ca.xavier.service.UserService;
import ca.xavier.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteSelectedUserServlet")
public class DeleteSelectedUserServlet extends HttpServlet {
    UserService service=new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] ids=request.getParameterValues("id");
        service.delUsers(ids);
        response.sendRedirect(request.getContextPath()+"/UserListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
