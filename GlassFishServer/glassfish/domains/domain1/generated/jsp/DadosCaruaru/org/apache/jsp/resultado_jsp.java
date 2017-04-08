package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class resultado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setHeader("X-Powered-By", "JSP/2.3");
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Dados Abertos Caruaru</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/favicon.png\" type=\"image/x-icon\">\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t<!--<script src=\"js/bootstrap.js\"></script>-->\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("\n");
      out.write("        <script type=\"text/JavaScript\" src=\"js/consulta.js\"></script>\n");
      out.write("        <script data-main=\"js/app/main.dataset.js\" src=\"js/lib/require.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/googleCharts.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"lista_dataset\" class=\"dataset-selector-container\" style=\"display:none;\"></div>\n");
      out.write("<a href=\"index.html\"> <img class=\"banner\" src=\"assets/banner.jpg\"> </a>\n");
      out.write("<br>\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t        <li><a href=\"dadosabertos.html\">O que são dados abertos?</a></li>\n");
      out.write("                <li><a href=\"consultas.html\">Consultas</a></li>\n");
      out.write("<!--\t        <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Consultas <span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"#\">Saúde</a></li>\n");
      out.write("          </ul>-->\n");
      out.write("        </li>\n");
      out.write("\t        <li><a href=\"caruaru.html\">Caruaru</a></li>\n");
      out.write("\t        <li><a href=\"aboutus.html\">Sobre</a></li>\n");
      out.write("\t        <li><a href=\"contato.html\">Contato</a></li>\n");
      out.write("      </ul>\n");
      out.write("<!--      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-danger\">Ok</button>\n");
      out.write("      </form>\n");
      out.write("      </ul>-->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"col-md-12 content\" style=\"margin-left:10px\">\n");
      out.write("\t<div class=\"news\">\n");
      out.write("\t\t<hr>\n");
      out.write("\t\t<h2 style=\"margin-left:5px\">Saúde</h2>\n");
      out.write("\t\t<hr>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<!--\t<h4>Saúde</h4>-->\n");
      out.write("\t<p>\n");
      out.write("            ");
 
                String codigoDoGrafico;
                codigoDoGrafico = (String)request.getAttribute("dados");
                out.println(codigoDoGrafico);
            
      out.write("\n");
      out.write("        </p>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
