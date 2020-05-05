package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/add.css\">\r\n");
      out.write("    <title>Add Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"contact-info\">\r\n");
      out.write("            <h2>Product Registration</h2>\r\n");
      out.write("            <h4>Add newly came products !</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form  action=\"ProductServlet\" method=\"post\">\r\n");
      out.write("        <input type=\"hidden\" name=\"method\" value=\"add\">\r\n");
      out.write("        <div id=\"add\">\r\n");
      out.write("            <div class=\"text-input\">\r\n");
      out.write("            <input type=\"text\" name=\"barcode\" required=\"required\" placeholder=\"Barcode\" /><br/>\r\n");
      out.write("            <input type=\"text\" name=\"name\" required=\"required\" placeholder=\"Name\"/><br/>\r\n");
      out.write("            <input type=\"text\" name=\"units\" required=\"required\" placeholder=\"Units\"/><br/>\r\n");
      out.write("            <input type=\"text\" name=\"purchasePrice\" required=\"required\" placeholder=\"PurchasePrice\"/><br/>\r\n");
      out.write("            <input type=\"text\" name=\"salePrice\" required=\"required\" placeholder=\"SalePrice\" /><br/>\r\n");
      out.write("            <input type=\"text\" name=\"inventory\" required=\"required\" placeholder=\"Inventory\"/><br/>\r\n");
      out.write("            <input class=\"button\" type=\"submit\" name=\"submit\">\r\n");
      out.write("            <input class=\"button\" type=\"reset\" name=\"reset\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</html>");
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
