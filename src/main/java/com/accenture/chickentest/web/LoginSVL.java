/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginSVL")
public class LoginSVL extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        final String USER_PAGE = "/chicken-test/content.html";
        // Se obtienen datos de usuario de la BD.
        String user = "Test"; //aca abria que asignar el resultado de la consulta
        String psw = "1234";

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html; charset=UTF-8");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-store");
        resp.setHeader("Expires", "-1");

        if (req.getParameter("user").equals(user) && req.getParameter("password").equals(psw)) {
            resp.setStatus(HttpServletResponse.SC_ACCEPTED);

            resp.sendRedirect(USER_PAGE);
        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized User");
            //out.print("<script>alert(\"Unauthorized: The credentials not exist in the system.\");</script>");
            //out.print("<h1>Unauthorized</h1>");
        }
        out.close();
    }

}
