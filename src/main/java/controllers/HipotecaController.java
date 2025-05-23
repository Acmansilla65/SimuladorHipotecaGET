package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.HipotecaModel;

import java.io.IOException;

@WebServlet(name = "HipotecaController", value = "/HipotecaController")
public class HipotecaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setContentType("text/html;charset=UTF-8");
        int i1 = Integer.parseInt(request.getParameter("I1"));
        int c1 = Integer.parseInt(request.getParameter("C1"));
        int t1 = Integer.parseInt(request.getParameter("T1"));

        HipotecaModel r1 = new HipotecaModel(i1, c1, t1);
        double calculo = ((r1.getImporte() - r1.getCapital())*1.03)/(r1.getDuracion() * 12);
        calculo = Math.round(calculo * 100.0) / 100.0;
        if(calculo < 0){
            calculo = 0;
        }
        response.getWriter().write("Cuota mensual con un interés fijo del 3%: " + calculo + "€");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Servlet para manejar hipotecas";
    }
}
