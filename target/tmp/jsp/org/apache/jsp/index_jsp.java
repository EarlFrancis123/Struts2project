/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.v20170914
 * Generated at: 2022-06-09 11:27:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <title>Home</title>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("      \n");
      out.write("      header{\n");
      out.write("          align-content: center;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("  background-image: url('https://images8.alphacoders.com/425/425698.jpg');\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("      .column {\n");
      out.write("        float: left;\n");
      out.write("        width: 33.33%;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      /* Clear floats after the columns */\n");
      out.write("      .row:after {\n");
      out.write("        content: \"\";\n");
      out.write("        display: table;\n");
      out.write("        clear: both;\n");
      out.write("      }\n");
      out.write("  \n");
      out.write("      .column {\n");
      out.write("        float: left;\n");
      out.write("        width: 50%;\n");
      out.write("      }\n");
      out.write("      /* Clear floats after the columns */\n");
      out.write("      .row:after {\n");
      out.write("        content: \"\";\n");
      out.write("        display: table;\n");
      out.write("        clear: both;\n");
      out.write("      }\n");
      out.write("      #aboutMeImg {\n");
      out.write("        width: 100%;\n");
      out.write("        height: auto;\n");
      out.write("      }\n");
      out.write("      span{\n");
      out.write("     \n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("  \n");
      out.write("\n");
      out.write("          <div class=\"w3-display-left w3-text-white\" style=\"padding:48px\">\n");
      out.write("            <span class=\"w3-jumbo w3-hide-small\">Start something that matters</span><br>\n");
      out.write("            <span class=\"w3-xxlarge w3-hide-large w3-hide-medium\">Start something that matters</span><br>\n");
      out.write("            <span class=\"w3-large\">Stop wasting valuable time with projects that just isn't you.</span>\n");
      out.write("            <p><a href=\"#about\" class=\"w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off\">Learn more and start today</a></p>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"w3-display-bottomleft w3-text-grey w3-large\" style=\"padding:24px 48px\">\n");
      out.write("            <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    </main>\n");
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
      // /index.jsp(56,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005finclude_005f0.setValue("/WEB-INF/Pages/Menu.jsp");
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
