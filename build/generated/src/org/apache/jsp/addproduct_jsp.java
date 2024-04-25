package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/addproduct.css\">\r\n");
      out.write("    <title>Add Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>ADD NEW ITEM</h1>\r\n");
      out.write("        <p></p>\r\n");
      out.write("        <form action=\"product\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <label for=\"name\">Product Name</label>\r\n");
      out.write("                        <input type=\"text\" id=\"ProductName\" name=\"ProductName\" placeholder=\"ProductName\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <label for=\"description\">Description</label>\r\n");
      out.write("                        <input type=\"text\" id=\"description\" name=\"description\" placeholder=\"Description\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <label for=\"Price\">Price</label>\r\n");
      out.write("                        <input type=\"number\" id=\"price\" name=\"price\" placeholder=\"Price\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <label for=\"quantity\">Quantity</label>\r\n");
      out.write("                        <input type=\"number\" id=\"quantity\" name=\"quantity\" placeholder=\"Quantity\" />\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"Add\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"images/profile.png\" id=\"profile-pic\" />\r\n");
      out.write("                    <label for=\"input-file\" class=\"upload-label\">Upload Image</label>\r\n");
      out.write("                    <input type=\"file\" accept=\"image/jpeg,image/png,image/jpg\" id=\"input-file\" name=\"ProductImage\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"column\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"c\">\r\n");
      out.write("                    <a href=\"viewproduct.jsp\">\r\n");
      out.write("                        <input type=\"button\" value=\"Back\" class=\"btn\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <input type=\"reset\" value=\"Reset\" class=\"btn\" />\r\n");
      out.write("                    <input type=\"submit\" value=\"Submit\" class=\"btn\" />\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("        let profilePic = document.getElementById(\"profile-pic\");\r\n");
      out.write("        let inputFile = document.getElementById(\"input-file\");\r\n");
      out.write("\r\n");
      out.write("        inputFile.onchange = function () {\r\n");
      out.write("            profilePic.src = URL.createObjectURL(inputFile.files[0]);\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
