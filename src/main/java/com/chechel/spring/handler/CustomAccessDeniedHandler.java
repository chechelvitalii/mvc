package com.chechel.spring.handler;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    private String accessDeniedPage;

    public CustomAccessDeniedHandler(String accessDeniedPage) {
        this.accessDeniedPage = accessDeniedPage;
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        System.out.println("# CustomAccessDeniedHandler - worked *");
        RequestDispatcher dispatcher = request.getRequestDispatcher(accessDeniedPage);
        dispatcher.forward(request, response);
    }
}
