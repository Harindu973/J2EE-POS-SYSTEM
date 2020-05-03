package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DASHBOARD</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"contact-info\">\n");
      out.write("            <h2>Dashboard</h2>\n");
      out.write("            <h4>Directs to all Sections !</h4>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"link-container\">\n");
      out.write("            <a href=\"add.jsp\"><button class=\"button\"><i class=\"fa fa-plus-square\"></i>   Add Products</button></a>\n");
      out.write("            <a href=\"edit.jsp\"><button class=\"button\"><i class=\"fa fa-home\"></i> Update/Delete Product</button></a>\n");
      out.write("            <a href=\"content.jsp\"> <button class=\"button\"><i class=\"fa fa-home\"></i> Product Details</button></a>\n");
      out.write("            <button class=\"button\"><i class=\"fa fa-home\"></i> Search Product</button>\n");
      out.write("            <button class=\"button\"><i class=\"fa fa-home\"></i> Cashier</button>\n");
      out.write("            <button class=\"button\"><i class=\"fa fa-home\"></i> Cashier Signup</button>\n");
      out.write("            <button class=\"button\"><i class=\"fa fa-home\"></i> Loyality Customer</button>\n");
      out.write("            <button class=\"button\"><i class=\"fa fa-home\"></i> Payment Records</button>\n");
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
