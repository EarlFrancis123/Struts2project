/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.v20170914
 * Generated at: 2022-06-16 13:15:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/NS_Laptop_2205/.m2/repository/org/apache/struts/struts2-core/2.5.30/struts2-core-2.5.30.jar!/META-INF/struts-tags.tld", Long.valueOf(1647323392000L));
    _jspx_dependants.put("file:/C:/Users/NS_Laptop_2205/.m2/repository/org/apache/struts/struts2-core/2.5.30/struts2-core-2.5.30.jar", Long.valueOf(1654171095637L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Raleway\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("  <head>\n");
      out.write("    <title>About</title>\n");
      out.write("    <style>\n");
      out.write("      body {font-family: \"Raleway\", Arial, sans-serif}\n");
      out.write(".w3-row img {margin-bottom: -8px}\n");
      out.write("      .column {\n");
      out.write("        float: left;\n");
      out.write("        width: 50%;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      /* Clear floats after the columns */\n");
      out.write("      .row:after {\n");
      out.write("        content: \"\";\n");
      out.write("        display: table;\n");
      out.write("        clear: both;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #aboutMeImg {\n");
      out.write("        width: 100%;\n");
      out.write("        height: auto;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("    \n");
      out.write(" <!-- Project Section -->\n");
      out.write(" <div class=\"w3-container w3-padding-32\" id=\"projects\">\n");
      out.write("  <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">About Us</h3>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-row-padding\">\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Summer House</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house2.jpg\" alt=\"House\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Brick House</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house5.jpg\" alt=\"House\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Renovated</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house4.jpg\" alt=\"House\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Barn House</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house3.jpg\" alt=\"House\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-row-padding\">\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Summer House</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house5.jpg\" alt=\"House\" style=\"width:99%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Brick House</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house2.jpg\" alt=\"House\" style=\"width:99%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Renovated</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house3.jpg\" alt=\"House\" style=\"width:99%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-display-container\">\n");
      out.write("      <div class=\"w3-display-topleft w3-black w3-padding\">Barn House</div>\n");
      out.write("      <img src=\"https://www.w3schools.com/w3images/house4.jpg\" alt=\"House\" style=\"width:99%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- About Section -->\n");
      out.write("<div class=\"w3-container w3-padding-32\" id=\"about\">\n");
      out.write("  <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">About</h3>\n");
      out.write("  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint\n");
      out.write("    occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco\n");
      out.write("    laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("  </p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"w3-row-padding w3-grayscale\">\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <img src=\"https://www.w3schools.com/w3images/team2.jpg\" alt=\"John\" style=\"width:100%\">\n");
      out.write("    <h3>John Doe</h3>\n");
      out.write("    <p class=\"w3-opacity\">CEO & Founder</p>\n");
      out.write("    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>\n");
      out.write("    <p><button class=\"w3-button w3-light-grey w3-block\">Contact</button></p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <img src=\"https://www.w3schools.com/w3images/team1.jpg\" alt=\"Jane\" style=\"width:100%\">\n");
      out.write("    <h3>Jane Doe</h3>\n");
      out.write("    <p class=\"w3-opacity\">Architect</p>\n");
      out.write("    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>\n");
      out.write("    <p><button class=\"w3-button w3-light-grey w3-block\">Contact</button></p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <img src=\"https://www.w3schools.com/w3images/team3.jpg\" alt=\"Mike\" style=\"width:100%\">\n");
      out.write("    <h3>Mike Ross</h3>\n");
      out.write("    <p class=\"w3-opacity\">Architect</p>\n");
      out.write("    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>\n");
      out.write("    <p><button class=\"w3-button w3-light-grey w3-block\">Contact</button></p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-col l3 m6 w3-margin-bottom\">\n");
      out.write("    <img src=\"https://www.w3schools.com/w3images/team4.jpg\" alt=\"Dan\" style=\"width:100%\">\n");
      out.write("    <h3>Dan Star</h3>\n");
      out.write("    <p class=\"w3-opacity\">Architect</p>\n");
      out.write("    <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>\n");
      out.write("    <p><button class=\"w3-button w3-light-grey w3-block\">Contact</button></p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005finclude_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f0 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    try {
      _jspx_th_s_005finclude_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005finclude_005f0.setParent(null);
      // /WEB-INF/Pages/About.jsp(32,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finclude_005f0.setValue("Menu.jsp");
      int _jspx_eval_s_005finclude_005f0 = _jspx_th_s_005finclude_005f0.doStartTag();
      if (_jspx_th_s_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f0);
    }
    return false;
  }
}