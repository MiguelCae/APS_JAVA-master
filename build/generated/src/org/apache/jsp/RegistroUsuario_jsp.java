package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Page Title - SB Admin</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/bootstrap-4.5.0-dist/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Login APS</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-dark\">\n");
      out.write("        <div id=\"layoutAuthentication\">\n");
      out.write("            <div id=\"layoutAuthentication_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row justify-content-center\">\n");
      out.write("                            <div class=\"col-lg-9\">\n");
      out.write("                                <div class=\"card shadow-lg border-0 rounded-lg mt-5\">\n");
      out.write("                                    <div class=\"card-header\"><h3 class=\"text-center font-weight-light my-4\">Registrarse</h3></div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <form>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblidentificacion\">Identificación</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtIdentificacion\" type=\"text\" placeholder=\"Ingrese número de identificación\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblTipoIdentificacion\">Seleccione identificación</label>\n");
      out.write("                                                        <select class=\"form-control py-4\" name=\"txtIdentificacion\">\n");
      out.write("                                                            <option value=\"CC - Cédula de ciudadanía\">Cédula de ciudadanía</option> \n");
      out.write("                                                            <option value=\"CC - Cédula de ciudadanía\">Cédula de ciudadanía</option> \n");
      out.write("                                                            <option value=\"CE - Cédula de extranjería\">Cédula de extranjería</option>\n");
      out.write("                                                            <option value=\"PA - Pasaporte\">PA - Pasaporte</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"small mb-1\" for=\"lblNombresEmailAddress\">Nombres</label>\n");
      out.write("                                                <input class=\"form-control py-4\" name=\"txtNombres\" type=\"text\"  placeholder=\"Ingresar nombres\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblPrimerApellido\">Primer apellido</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtPrimerApellido\" type=\"text\" placeholder=\"Ingresar primer apellido\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblSegundoApellido\">Segundo apellido</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtSegundoApellido\" type=\"text\" placeholder=\"Ingresar segundo apellido\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblEmail\">Correo electrónico</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtEmail\" type=\"email\" placeholder=\"Ingresar correo electrónico\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblTelefono\">Teléfono</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtTelefono\" type=\"text\" placeholder=\"Ingresar Teléfono\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblContraseña\">Contraseña</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtContraseña\" type=\"password\" placeholder=\"Ingresar contraseña\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-6\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"small mb-1\" for=\"lblConfirmContraseña\">Confirmar contraseña</label>\n");
      out.write("                                                        <input class=\"form-control py-4\" name=\"txtConfirmContraseña\" type=\"password\" placeholder=\"Confirmar contraseña\" />\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group mt-4 mb-0\">\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-primary btn-block\" name=\"btnAceptar\" href=\"#\" values=\"Crear cuenta\"/>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-footer text-center\">\n");
      out.write("                                        <div class=\"small\"><a href=\"login.jsp\">Si ya tienes una cuenta, ingresa</a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"layoutAuthentication_footer\">\n");
      out.write("                <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                            <div class=\"text-muted\">Copyright &copy; Your Website 2020</div>\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"#\">Privacy Policy</a>\n");
      out.write("                                &middot;\n");
      out.write("                                <a href=\"#\">Terms &amp; Conditions</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
