package ca.xavier.web.servlet;

import ca.xavier.domain.User;
import ca.xavier.service.UserService;
import ca.xavier.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FindUserServlet")
public class FindUserServlet extends HttpServlet {
    UserService service=new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户id
        String id=request.getParameter("id");
        //2.调用Service方法
        User user=service.findUserById(id);
        //3.将user存入request域中
        request.setAttribute("user",user);
        //4.转发到update.jsp
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
