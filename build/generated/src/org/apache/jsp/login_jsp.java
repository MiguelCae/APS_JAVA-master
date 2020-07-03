package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/bootstrap-4.5.0-dist/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"tex/css\"</>\n");
      out.write("    <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<title>Login APS</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-dark\">\n");
      out.write("\n");
      out.write("    <!--Scriptlets -->\n");
      out.write("    ");

        if (request.getAttribute("stError") != null) {
    
      out.write("\n");
      out.write("    <input type=\"text\" hidden=\"\" id=\"txtMensaje\" value=\"");
      out.print(request.getAttribute("stError").toString());
      out.write("\"/>\n");
      out.write("    <script>\n");
      out.write("        swal(\"Mensaje\", document.getElementById()(\"txtMensaje\").value, \"error\");\n");
      out.write("    </script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"layoutAuthentication\">\n");
      out.write("        <div id=\"layoutAuthentication_content\">\n");
      out.write("            <main>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-5\">\n");
      out.write("                            <div class=\"card shadow-lg border-0 rounded-lg mt-5\">\n");
      out.write("                                <div class=\"card-header\"><h3 class=\"text-center font-weight-light my-4\">Login</h3></div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <form action=\"LoginControler\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"small mb-1\" for=\"lblEmail\">Email</label>\n");
      out.write("                                            <input class=\"form-control py-4\" name = \"txtEmail\" type=\"email\" placeholder=\"Ingresar Email\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"small mb-1\" for=\"lblPassword\">Password</label>\n");
      out.write("                                            <input class=\"form-control py-4\" name=\"txtPassword\" type=\"password\" placeholder=\"Ingresar contraseña\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"custom-control custom-checkbox\">\n");
      out.write("                                                <input class=\"custom-control-input\" id=\"rememberPasswordCheck\" name=\"chkRecordar\"  type=\"checkbox\" />\n");
      out.write("                                                <label class=\"custom-control-label\" for=\"rememberPasswordCheck\">Recordar contraseña</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group d-flex align-items-center justify-content-between mt-4 mb-0\">\n");
      out.write("                                            <a class=\"small\" href=\"#\">¿Olvidaste la contraseña?</a>\n");
      out.write("                                            <input name=\"btnAceptar\" type=\"submit\" class=\"btn btn-primary btn-block\"  value=\"Aceptar\"/> \n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer text-center\">\n");
      out.write("                                    <div class=\"small\"><a href=\"RegistroUsuario.jsp\">Registrarse</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"layoutAuthentication_footer\">\n");
      out.write("            <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                        <div class=\"text-muted\">Copyright &copy; Adoption Pet System 2020</div>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"#\">Privacy Policy</a>\n");
      out.write("                            &middot;\n");
      out.write("                            <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
