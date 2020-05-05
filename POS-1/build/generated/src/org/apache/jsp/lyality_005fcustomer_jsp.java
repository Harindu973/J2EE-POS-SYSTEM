package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lyality_005fcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/navbar.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/loyality.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("        <li class=\"home\"><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("        <li><a href=\"cashier_reg.jsp\">Cashier Registraion</a></li>\n");
      out.write("        <li><a href=\"lyality_customer.jsp\">Loyality Registraion</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"javascript:void(0)\" class=\"dropbtn\">Products</a>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"add.jsp\">Add Product</a>\n");
      out.write("            <a href=\"edit.jsp\">Edit Product</a>\n");
      out.write("            <a href=\"content.jsp\">Product List</a>\n");
      out.write("            <a href=\"#\">Discount Update</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"log\"><a href=\"login.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("         <div class=\"col-md-3\">\n");
      out.write("        <div class=\"contact-info\">\n");
      out.write("            <h2>Loyality Customer Registration</h2>\n");
      out.write("            <h4>Add Loyality Customer Details !</h4>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <form  action=\"\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"method\" value=\"add\">\n");
      out.write("        <div id=\"login\">\n");
      out.write("            <div class=\"text-input\">\n");
      out.write("            <input type=\"text\" name=\"fname\" required=\"required\" placeholder=\"Full Name\" /><br/>\n");
      out.write("            <input type=\"text\" name=\"nnic\" required=\"required\" placeholder=\"NIC Number\"/><br/>\n");
      out.write("            <input type=\"text\" name=\"phone\" required=\"required\" placeholder=\"Phone Number\"/><br/>\n");
      out.write("            <input type=\"text\" name=\"address\" required=\"required\" placeholder=\"Address\"/><br/>\n");
      out.write("            <input class=\"button\" type=\"submit\" name=\"submit\" value=\"Register\">\n");
      out.write("            <input class=\"button\" type=\"reset\" name=\"reset\" value=\"Cancel\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
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
