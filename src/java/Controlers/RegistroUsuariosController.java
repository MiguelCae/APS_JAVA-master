/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import Models.clsRegistroUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MIGUEL
 */
@WebServlet(name = "RegistroUsuariosController", urlPatterns = {"/RegistroUsuariosController"})
public class RegistroUsuariosController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("btnAceptar") != null){
            btnAceptar(request, response);
         
        }
        
    }
    public void btnAceptar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        try{
            Models.clsRegistroUsuario obclsRegistroUsuario = new Models.clsRegistroUsuario();
            Models.clsIdentificacion obIdentificacion = new Models.clsIdentificacion();
            
            
            //Asignan atributos y propiedades
            
            if(request.getParameter("txtIdentificacion")!= null){
                obclsRegistroUsuario.setStIdentificacion("txtIdentificacion");
            }
            if(request.getParameter("ddlTipoIdentificacion")!= null){
                obIdentificacion.setInCodigo(Integer.parseInt(request.getParameter("ddlTipoIdentificacion")));
                String stDescripcion = "";
                if(request.getParameter("ddlTipoIdentificacion").equals("1")){
                    stDescripcion = "Seleccione";
                }else if(request.getParameter("ddlTipoIdentificacion").equals("2")){
                    stDescripcion = "Cedula de ciudadan1a";
                }else if(request.getParameter("ddlTipoIdentificacion").equals("3")){
                    stDescripcion = "Cedula de extranjeria";
                }else if(request.getParameter("ddlTipoIdentificacion").equals("4")){
                    stDescripcion = "Pasaporte";
                }
                obclsRegistroUsuario.setStDescription(stDescripcion);
                
                obclsRegistroUsuario.setObIdentificacion(obIdentificacion);
            }
            HttpSession session = request.getSession(true);
            
            //Lista de nuevos objetos que se van creando
            List<Models.clsRegistroUsuario>  lsclsRegistroUsuario = new ArrayList<Models.clsRegistroUsuario>();
            //Se valida existencia de variable de sesion
            if(session.getAttribute("session_lstclsRegistroUsuarios") != null){
                lsclsRegistroUsuario = (List<Models.clsRegistroUsuario>)
                        session.getAttribute("session_lstclsRegistroUsuarios");
            }
            //Calculo que identifica el registro auto incremental
            int inCodigo =lsclsRegistroUsuario.size() + 1;
            obclsRegistroUsuario.setInCodigo(inCodigo);
            
            //Se agrega objeto a la lista
            
            lsclsRegistroUsuario.add(obclsRegistroUsuario);
            session.setAttribute("session_lstclsRegistroUsuarios", lsclsRegistroUsuario);
            
            //Definir paramereos del controlador
            request.setAttribute("stMensaje", "Se realiza procesos con exito");
            request.setAttribute("stTipo", "succes");
            
            //Redireccion del formulario
            
            request.getRequestDispatcher("RegistroUsuario.jsp").forward(request, response);
            
            
        }catch(Exception ex){
             //Definir paramereos del controlador
            request.setAttribute("stMensaje", "Se realiza procesos con exito");
            request.setAttribute("stTipo", "error");
            
            //Redireccion del formulario
            
            request.getRequestDispatcher("RegistroUsuario.jsp").forward(request, response);
            
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
