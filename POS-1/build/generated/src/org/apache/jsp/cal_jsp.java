package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/cal.css\" rel=\"stylesheet\" >\n");
      out.write("        <script src=\"css/caljs.js\"></script>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div id=\"calculator\">\n");
      out.write("\t<!-- Screen and clear key -->\n");
      out.write("\t<div class=\"top\">\n");
      out.write("\t\t<span class=\"clear\">C</span>\n");
      out.write("\t\t<div class=\"screen\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"keys\">\n");
      out.write("\t\t<!-- operators and other keys -->\n");
      out.write("\t\t<span>7</span>\n");
      out.write("\t\t<span>8</span>\n");
      out.write("\t\t<span>9</span>\n");
      out.write("\t\t<span class=\"operator\">+</span>\n");
      out.write("\t\t<span>4</span>\n");
      out.write("\t\t<span>5</span>\n");
      out.write("\t\t<span>6</span>\n");
      out.write("\t\t<span class=\"operator\">-</span>\n");
      out.write("\t\t<span>1</span>\n");
      out.write("\t\t<span>2</span>\n");
      out.write("\t\t<span>3</span>\n");
      out.write("\t\t<span class=\"operator\">÷</span>\n");
      out.write("\t\t<span>0</span>\n");
      out.write("\t\t<span>.</span>\n");
      out.write("\t\t<span class=\"eval\">=</span>\n");
      out.write("\t\t<span class=\"operator\">x</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
