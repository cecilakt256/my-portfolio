package com.google.sps.servlets;

import com.google.sps.data.Greeting;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import java.io.IOException;

@WebServlet("/greetings")
public class GreetingsServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Greeting greeting = new Greeting("Hello There!","How are you?","Ni Hao ma?");
        

        // Send the JSON as the response
        String json = convertToJsonUsingGson(greeting);

        response.setContentType("application/json;");
        response.getWriter().println(json);
    }

    private String convertToJsonUsingGson(Greeting greetings) {
        Gson gson = new Gson();
        String json = gson.toJson(greetings);
        return json;
      }
}
