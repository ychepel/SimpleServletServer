package com.univer.simpleservletserver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CalculatorOperation operation;
        double operand1;
        double operand2;
        try {
            operation = CalculatorOperation.findByCommand(req.getParameter("operation"));
            operand1 = Double.parseDouble(req.getParameter("operand1"));
            operand2 = Double.parseDouble(req.getParameter("operand2"));
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException("Wrong url-parameters.", e);
        }

        Calculator calculator = new Calculator(operation, operand1, operand2);
        String taskAnswer = calculator.doMath().toString();

        PrintWriter writer = resp.getWriter();
        writer.print("<html><head><title>Calculation Result</title><head><body>" + taskAnswer + "</body></html>");
    }
}
