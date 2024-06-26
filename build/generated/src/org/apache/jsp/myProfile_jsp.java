package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <title>My Profile</title>\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Inter&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Poppins&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/myProfile.css\" />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"N1\"></div>\r\n");
      out.write("      <div class=\"N2\">\r\n");
      out.write("        <div class=\"N3\"></div>\r\n");
      out.write("        <span class=\"N4\">Logo</span>\r\n");
      out.write("        <span class=\"N5\">Nav Bar</span>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <span class=\"pageLink\">Homepage/ My Account</span>\r\n");
      out.write("      <div class=\"helloName\">\r\n");
      out.write("        <img\r\n");
      out.write("          class=\"pPic\"\r\n");
      out.write("          src=\"images/images.jpg\"\r\n");
      out.write("          alt=\"Upload your Profile Picture\"\r\n");
      out.write("        />\r\n");
      out.write("        <div class=\"pName\">\r\n");
      out.write("          <h3 class=\"helloH3\">Hello</h3>\r\n");
      out.write("          <span class=\"nameSpan\">Sandun Dinesh</span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"sideBar\">\r\n");
      out.write("        <div class=\"sideBarContent\">\r\n");
      out.write("          <div class=\"content1\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"myDetails\" href=\"\">My Details</span>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"content2\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"myOrders\" href=\"\">My Orders</span>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"content3\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"wishList\" href=\"\">Wishlist</span>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"content4\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"deliveryDetails\" href=\"\">Delivery Details</span>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"content5\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"changePassword\" href=\"\">Change Password</span>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"content6\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"payment\" href=\"\">Payment</span>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"content7\">\r\n");
      out.write("            <div class=\"sideBarDot\"></div>\r\n");
      out.write("            <span class=\"Logout\" href=\"\">Logout</span>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"perInfo\">\r\n");
      out.write("        <div class=\"perInfoHead\">\r\n");
      out.write("          <span class=\"perInfoTitle\">Personal Information</span>\r\n");
      out.write("          <div class=\"empty\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"perInfoContent\">\r\n");
      out.write("            <form action=\"myProfile\" method=\"POST\">\r\n");
      out.write("               <img src=\"images/images.jpg\" alt=\"\" class=\"pImage\" />\r\n");
      out.write("\r\n");
      out.write("                <div class=\"Name_Input\">\r\n");
      out.write("                  <span class=\"fName\"> First Name</span>\r\n");
      out.write("                  <input type=\"text\" name=\"FirstName\" class=\"nameInput\" required />\r\n");
      out.write("                  <span class=\"lName\"> Last Name</span>\r\n");
      out.write("                  <input type=\"text\" name=\"LastName\" class=\"nameInput1\" required />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"DoB_Address\">\r\n");
      out.write("                  <span class=\"DoB\">Date of Birth</span>\r\n");
      out.write("                  <input type=\"date\" name=\"DoB\" class=\"dateInput\" required />\r\n");
      out.write("                  <span class=\"address\">Address</span>\r\n");
      out.write("                  <input type=\"text\" name=\"Address\" class=\"addressInput\" required />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"gender\">\r\n");
      out.write("                  <span class=\"genderTitle\">Gender</span>\r\n");
      out.write("                  <div class=\"form2\">\r\n");
      out.write("                    <input type=\"radio\" id=\"male\" name=\"Gender\" value=\"male\" />\r\n");
      out.write("                    <label for=\"male\">Male</label>\r\n");
      out.write("                    <input type=\"radio\" id=\"female\" name=\"Gender\" value=\"female\" />\r\n");
      out.write("                    <label for=\"female\">Female</label><br />\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"pN                                            um\">\r\n");
      out.write("                  <span class=\"pNumInput\">Phone Number</span>\r\n");
      out.write("                  <input type=\"number\" name=\"Number\" class=\"numInput\" required />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"Email_Cancel_Save\">\r\n");
      out.write("                  <span class=\"emailTitle\">Email</span>\r\n");
      out.write("                  <input type=\"email\" name=\"Email\" class=\"emailInput\" required />\r\n");
      out.write("                  <input\r\n");
      out.write("                    type=\"reset\"\r\n");
      out.write("                    value=\"Cancel\"\r\n");
      out.write("                    class=\"Cancel\"\r\n");
      out.write("                    onclick=\"clearFields()\"\r\n");
      out.write("                  />\r\n");
      out.write("                  <input type=\"submit\" value=\"Save Changes\" class=\"Save\" />\r\n");
      out.write("                </div>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"footerBackGround\"></div>\r\n");
      out.write("      <span class=\"footerContent\">Footer Section</span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"js/myProfile.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <title>My Profile</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Inter&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Poppins&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/myProfile.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body onload=\"loadUserData()\">\n");
      out.write("      ");
  String sessionId = session.getId(); 
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"N1\"></div>\n");
      out.write("      <div class=\"N2\">\n");
      out.write("        <div class=\"N3\"></div>\n");
      out.write("        <span class=\"N4\">Logo</span>\n");
      out.write("        <span class=\"N5\">Nav Bar</span>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <span class=\"pageLink\">Homepage/ My Account</span>\n");
      out.write("      <div class=\"helloName\">\n");
      out.write("        <img\n");
      out.write("          class=\"pPic\"\n");
      out.write("          src=\"images/images.jpg\"\n");
      out.write("          alt=\"Upload your Profile Picture\"\n");
      out.write("        />\n");
      out.write("        <div class=\"pName\">\n");
      out.write("          <h3 class=\"helloH3\">Hello</h3>\n");
      out.write("          <span class=\"nameSpan\">Sandun Dinesh</span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"sideBar\">\n");
      out.write("        <div class=\"sideBarContent\">\n");
      out.write("          <div class=\"content1\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"myDetails\" href=\"\">My Details</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"content2\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"myOrders\" href=\"\">My Orders</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"content3\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"wishList\" href=\"\">Wishlist</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"content4\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"deliveryDetails\" href=\"\">Delivery Details</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"content5\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"changePassword\" href=\"\">Change Password</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"content6\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"payment\" href=\"\">Payment</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"content7\">\n");
      out.write("            <div class=\"sideBarDot\"></div>\n");
      out.write("            <span class=\"Logout\" href=\"\">Logout</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"perInfo\">\n");
      out.write("        <div class=\"perInfoHead\">\n");
      out.write("          <span class=\"perInfoTitle\">Personal Information</span>\n");
      out.write("          <div class=\"empty\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"perInfoContent\">\n");
      out.write("            <form action=\"myProfile\" method=\"POST\">\n");
      out.write("               <img src=\"images/images.jpg\" alt=\"\" class=\"pImage\" />\n");
      out.write("\n");
      out.write("                <div class=\"Name_Input\">\n");
      out.write("                  <span class=\"fName\"> First Name</span>\n");
      out.write("                  <input type=\"text\" name=\"FirstName\" class=\"nameInput\" required />\n");
      out.write("                  <span class=\"lName\"> Last Name</span>\n");
      out.write("                  <input type=\"text\" name=\"LastName\" class=\"nameInput1\" required />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"DoB_Address\">\n");
      out.write("                  <span class=\"DoB\">Date of Birth</span>\n");
      out.write("                  <input type=\"date\" name=\"DoB\" class=\"dateInput\" required />\n");
      out.write("                  <span class=\"address\">Address</span>\n");
      out.write("                  <input type=\"text\" name=\"Address\" class=\"addressInput\" required />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"gender\">\n");
      out.write("                  <span class=\"genderTitle\">Gender</span>\n");
      out.write("                  <div class=\"form2\">\n");
      out.write("                    <input type=\"radio\" id=\"male\" name=\"Gender\" value=\"male\" />\n");
      out.write("                    <label for=\"male\">Male</label>\n");
      out.write("                    <input type=\"radio\" id=\"female\" name=\"Gender\" value=\"female\" />\n");
      out.write("                    <label for=\"female\">Female</label><br />\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"pNum\">\n");
      out.write("                  <span class=\"pNumInput\">Phone Number</span>\n");
      out.write("                  <input type=\"number\" name=\"Number\" class=\"numInput\" required />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"Email_Cancel_Save\">\n");
      out.write("                  <span class=\"emailTitle\">Email</span>\n");
      out.write("                  <input type=\"email\" name=\"Email\" class=\"emailInput\" required />\n");
      out.write("                  <input\n");
      out.write("                    type=\"reset\"\n");
      out.write("                    value=\"Cancel\"\n");
      out.write("                    class=\"Cancel\"\n");
      out.write("                    onclick=\"clearFields()\"\n");
      out.write("                  />\n");
      out.write("                  <input type=\"submit\" value=\"Save Changes\" class=\"Save\" />\n");
      out.write("                </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("       <form action=\"myProfile\" action=\"GET\" id=\"userIdForm\">\n");
      out.write("          <input type=\"hidden\" name=\"sessionId\" id=\"sessionId\" value=\"");
      out.print( sessionId );
      out.write("\">\n");
      out.write("          <input type=\"submit\" value=\"Save Changes\" class=\"Save\" style=\"display:none;\" />\n");
      out.write("       </form>\n");
      out.write("\n");
      out.write("      <div class=\"footerBackGround\"></div>\n");
      out.write("      <span class=\"footerContent\">Footer Section</span>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        function loadUserData(){\n");
      out.write("            // Retrieve user data passed from the servlet\n");
      out.write("            var userData = ");
      out.print( request.getAttribute("userData") );
      out.write(";\n");
      out.write("            // Populate form fields with user data\n");
      out.write("            document.getElementById(\"FirstName\").value = userData.firstName;\n");
      out.write("            document.getElementById(\"LastName\").value = userData.lastName;\n");
      out.write("            document.getElementById(\"Address\").value = userData.address;\n");
      out.write("            document.getElementById(\"DoB\").value = userData.dateOfBirth;\n");
      out.write("            document.getElementById(\"male\").checked = userData.gender === \"male\";\n");
      out.write("            document.getElementById(\"female\").checked = userData.gender === \"female\";\n");
      out.write("            document.getElementById(\"Number\").value = userData.mobileNumber;\n");
      out.write("            document.getElementById(\"Email\").value = userData.email;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Submit the hidden form to update session ID\n");
      out.write("        document.getElementById(\"userIdForm\").submit();\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script src=\"js/myProfile.js\"></script>\n");
      out.write("  </body>\n");
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
