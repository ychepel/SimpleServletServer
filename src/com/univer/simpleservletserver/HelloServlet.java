package com.univer.simpleservletserver;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/counter.jsp");
        request.setAttribute("title1", "Hello!");
        request.setAttribute("title2", "Current page view count: ");

        List<User> userList = new ArrayList<>();
        userList.add(new User("Ivan", 15));
        userList.add(new User("Petr", 25));
        userList.add(new User("Oksana", 21));
        userList.add(new User("Alex", 33));
        request.setAttribute("users", userList);

        dispatcher.forward(request, response);
    }

}
