package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Login APS</title>\n");
      out.write("    </head>\n");
      out.write("     <body class=\"sb-nav-fixed\">\n");
      out.write("        <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">Adoption Pet System</a>\n");
      out.write("            <button class=\"btn btn-link btn-sm order-1 order-lg-0\" id=\"sidebarToggle\" href=\"#\"><i class=\"fas fa-paw\"></i></button>\n");
      out.write("            <!-- Navbar Search-->\n");
      out.write("            <form class=\"d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input class=\"form-control\" type=\"text\" placeholder=\"Buscar\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" />\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- Navbar-->\n");
      out.write("            <ul class=\"navbar-nav ml-auto ml-md-0\">\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"userDropdown\" href=\"#\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\n");
      out.write("                    <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Configuración</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Actividades</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"login.jsp\">Cerrar sesión</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"layoutSidenav\">\n");
      out.write("            <div id=\"layoutSidenav_nav\">\n");
      out.write("                <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\n");
      out.write("                    <div class=\"sb-sidenav-menu\">\n");
      out.write("                        <div class=\"nav\">\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Servicios</div>\n");
      out.write("                            <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                                Dashboard\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Administrador</div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-user fa-fw\"></i></div>\n");
      out.write("                                Usuarios\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"layout-static.html\">Voluntario</a>\n");
      out.write("                                    <a class=\"nav-link\" href=\"layout-sidenav-light.html\">Veterinario</a>\n");
      out.write("                                    <a class=\"nav-link\" href=\"layout-sidenav-light.html\">Administrado</a>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\n");
      out.write("                                Pages\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages\" aria-labelledby=\"headingTwo\" data-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\n");
      out.write("                                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#pagesCollapseAuth\" aria-expanded=\"false\" aria-controls=\"pagesCollapseAuth\">\n");
      out.write("                                        Authentication\n");
      out.write("                                        <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"collapse\" id=\"pagesCollapseAuth\" aria-labelledby=\"headingOne\" data-parent=\"#sidenavAccordionPages\">\n");
      out.write("                                        <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"login.html\">Login</a>\n");
      out.write("                                            <a class=\"nav-link\" href=\"register.html\">Register</a>\n");
      out.write("                                            <a class=\"nav-link\" href=\"password.html\">Forgot Password</a>\n");
      out.write("                                        </nav>\n");
      out.write("                                    </div>\n");
      out.write("                                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#pagesCollapseError\" aria-expanded=\"false\" aria-controls=\"pagesCollapseError\">\n");
      out.write("                                        Error\n");
      out.write("                                        <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"collapse\" id=\"pagesCollapseError\" aria-labelledby=\"headingOne\" data-parent=\"#sidenavAccordionPages\">\n");
      out.write("                                        <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"401.html\">401 Page</a>\n");
      out.write("                                            <a class=\"nav-link\" href=\"404.html\">404 Page</a>\n");
      out.write("                                            <a class=\"nav-link\" href=\"500.html\">500 Page</a>\n");
      out.write("                                        </nav>\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Addons</div>\n");
      out.write("                            <a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-chart-area\"></i></div>\n");
      out.write("                                Charts\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"nav-link\" href=\"tables.html\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-table\"></i></div>\n");
      out.write("                                Tables\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sb-sidenav-footer\">\n");
      out.write("                        <div class=\"small\">Conectado como:</div>\n");
      out.write("                        Administrador\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <h1 class=\"mt-4\">Dashboard</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4\">\n");
      out.write("                            <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-6\">\n");
      out.write("                                <div class=\"card mb-4\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <i class=\"fas fa-chart-area mr-1\"></i>\n");
      out.write("                                        Rescates\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\"><canvas id=\"myAreaChart\" width=\"100%\" height=\"40\"></canvas></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-6\">\n");
      out.write("                                <div class=\"card mb-4\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <i class=\"fas fa-chart-bar mr-1\"></i>\n");
      out.write("                                        Adopciones\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\"><canvas id=\"myBarChart\" width=\"100%\" height=\"40\"></canvas></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <i class=\"fas fa-table mr-1\"></i>\n");
      out.write("                                Aquí va una tabla\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
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
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"assets/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"assets/demo/chart-bar-demo.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"assets/demo/datatables-demo.js\"></script>\n");
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
