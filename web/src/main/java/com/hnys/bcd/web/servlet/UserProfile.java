package com.hnys.bcd.web.servlet;

import com.hnys.bcd.core.dto.UserDTO;
import com.hnys.bcd.core.service.UserService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user")
public class UserProfile extends HttpServlet {

    @EJB
private UserService userService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO userById = userService.getUserById(1L);
        resp.getWriter().write("userProfile");

    }
}
