/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

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
@WebServlet(name = "RegistroMascotaController", urlPatterns = {"/RegistroMascotaController"})
public class RegistroMascotaController extends HttpServlet {

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
    public void btnAceptar(HttpServletRequest request, 
            HttpServletResponse response)throws ServletException, IOException{
        
        try{
            //Definicion de modelos
            Models.clsRegistroMascotas obclsRegistroMascotas = new Models.clsRegistroMascotas();
            Models.clsEspecie obclsEspecie = new Models.clsEspecie();
            Models.clsSexo obclsSexo = new Models.clsSexo();
            Models.clsTamaño obclsTamaño = new Models.clsTamaño();
            
            //Asignacion de atributos o propiedades
            
            if(request.getParameter("txtFecha")!= null){
                obclsRegistroMascotas.setStFecha("txtFecha");
            }
            if(request.getParameter("txtIdMascota") != null){
                obclsRegistroMascotas.setInIdMascota("txtIdMascota");
            }
            
            if(request.getParameter("txtNombreMascota")!= null){
                obclsRegistroMascotas.setStNombreMascota("txtNombreMascota");
            }
            
            if(request.getParameter("ddlEspecie")!= null){
                obclsEspecie.setInCodigo(Integer.parseInt(request.getParameter("ddlEspecie")));
                
                String stDescripcion = "";
                
                if(request.getParameter("ddlEspecie").equals("1")){
                    stDescripcion = "Seleccione";
                
                }else if(request.getParameter("ddlEspecie").equals("2")){
                    stDescripcion = "Gato";
                }else if(request.getParameter("ddlEspecie").equals("3")){
                    stDescripcion = "Perro";
                }
                
                obclsRegistroMascotas.setStDescripcion(stDescripcion);
                
                obclsRegistroMascotas.setObclsEspecie(obclsEspecie);
            }
            if(request.getParameter("txtRaza") != null){
                obclsRegistroMascotas.setStRaza("txtRaza");
            }
            
            if(request.getParameter("ddlTamaño") != null ){
                obclsTamaño.setInCodigo(Integer.parseInt(request.getParameter("ddlTamaño")));
                String stDescripcion = "";
                
                if(request.getParameter("ddlTamaño").equals("1")){
                    stDescripcion = "Seleccione";
                }else if(request.getParameter("ddlTamaño").equals("2")){
                    stDescripcion = "Pequeño";
                }else if(request.getParameter("ddlTamaño").equals("3")){
                    stDescripcion = "Mediano";
                }else if(request.getParameter("ddlTamaño").equals("4")){
                    stDescripcion = "Grande";
                }
                obclsRegistroMascotas.setStDescripcion(stDescripcion);
                
                obclsRegistroMascotas.setObclsTamaño(obclsTamaño);
            }
            
            HttpSession session = request.getSession(true);
            
            
            
            //Lista de objetos que se van creando de los nuevos registros 
            List<Models.clsRegistroMascotas> lstclsRegistroMascotas = new ArrayList<Models.clsRegistroMascotas>();
            
            // se valida previa existencia de variable de session
            if(session.getAttribute("session_lstclsRegistroMascotas")!= null){
                lstclsRegistroMascotas = (List<Models.clsRegistroMascotas>) 
                        session.getAttribute("session_lstclsRegistroMascotas");
            
            }
            //Calculo codigo que identifica registro
            int inCodigo = lstclsRegistroMascotas.size() + 1;
            obclsRegistroMascotas.setInCodigo(inCodigo);
            
            
            //Se agrega objeto a la lista
            lstclsRegistroMascotas.add(obclsRegistroMascotas);
            session.setAttribute("session_lstclsRegistroMascotases", lstclsRegistroMascotas);
            
            
                    
           // Definir parametros  desde el controlador
           request.setAttribute("stMensaje", "Se realizo proceso con exito");
           request.setAttribute("stTipo", "succes");
           //Redireccion del formulario
           
           request.getRequestDispatcher("RegistroMascotas.jsp").forward(request, response);
           
        
        }catch (Exception ex){
            // Definir parametros  desde el controlador
           request.setAttribute("stMensaje", "Se realizao proceso con exito");
           request.setAttribute("stTipo", "error");
           //Redireccion del formulario
           
           request.getRequestDispatcher("RegistroMascotas.jsp").forward(request, response);
        
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
