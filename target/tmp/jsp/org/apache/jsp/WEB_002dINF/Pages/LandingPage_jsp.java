/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.v20170914
 * Generated at: 2022-07-25 13:18:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LandingPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Sherw/.m2/repository/org/apache/struts/struts2-core/2.5.30/struts2-core-2.5.30.jar!/META-INF/struts-tags.tld", Long.valueOf(1647323392000L));
    _jspx_dependants.put("file:/C:/Users/Sherw/.m2/repository/org/apache/struts/struts2-core/2.5.30/struts2-core-2.5.30.jar", Long.valueOf(1652784399634L));
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("      <meta charset=\"utf-8\" />\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("      <meta name=\"description\" content=\"\" />\r\n");
      out.write("      <meta name=\"author\" content=\"\" />\r\n");
      out.write("      <title>Home</title>\r\n");
      out.write("      <!-- Favicon-->\r\n");
      out.write("      <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("      <!-- Bootstrap icons-->\r\n");
      out.write("      <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("      <!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("      <link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      if (_jspx_meth_s_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <!-- Header-->\r\n");
      out.write("    <header class=\"bg-dark py-5\">\r\n");
      out.write("        <div class=\"container px-5\">\r\n");
      out.write("            <div class=\"row gx-5 justify-content-center\">\r\n");
      out.write("                <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"text-center my-5\">\r\n");
      out.write("                        <h1 class=\"display-5 fw-bolder text-white mb-2\">E-vacuation</h1>\r\n");
      out.write("                        <p class=\"lead text-white-50 mb-4\">Evacuation means exiting a facility as directly and safely as possible. Evacuation is appropriate when conditions inside a structure pose a threat to the health and safety of building occupants and leaving the facility is safer than remaining inside of it. Evacuation should occur through the closest exit way, but depending on the circumstances, an alternate or secondary evacuation route may need to be used.</p>\r\n");
      out.write("                        <div class=\"d-grid gap-3 d-sm-flex justify-content-sm-center\">\r\n");
      out.write("                            <a class=\"btn btn-primary btn-lg px-4 me-sm-3\" href=\"\">WELCOME</a>\r\n");
      out.write("                     \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Features section-->\r\n");
      out.write("    <section class=\"py-5 border-bottom\" id=\"features\">\r\n");
      out.write("        <div class=\"container px-5 my-5\">\r\n");
      out.write("            <div class=\"row gx-5\">\r\n");
      out.write("                <div class=\"col-lg-4 mb-5 mb-lg-0\">\r\n");
      out.write("                    <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"><i class=\"bi bi-collection\"></i></div>\r\n");
      out.write("                    <h2 class=\"h4 fw-bolder\">Featured title</h2>\r\n");
      out.write("                    <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"#!\">\r\n");
      out.write("                      Evacuation List\r\n");
      out.write("                        <i class=\"bi bi-arrow-right\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 mb-5 mb-lg-0\">\r\n");
      out.write("                    <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"><i class=\"bi bi-building\"></i></div>\r\n");
      out.write("                    <h2 class=\"h4 fw-bolder\">Featured title</h2>\r\n");
      out.write("                    <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"#!\">\r\n");
      out.write("                      Evacuee List\r\n");
      out.write("                        <i class=\"bi bi-arrow-right\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4\">\r\n");
      out.write("                    <div class=\"feature bg-primary bg-gradient text-white rounded-3 mb-3\"><i class=\"bi bi-toggles2\"></i></div>\r\n");
      out.write("                    <h2 class=\"h4 fw-bolder\">Featured title</h2>\r\n");
      out.write("                    <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"#!\">\r\n");
      out.write("                        Weather Forcast\r\n");
      out.write("                        <i class=\"bi bi-arrow-right\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <!-- Footer-->\r\n");
      out.write("    <footer class=\"py-5 bg-dark\">\r\n");
      out.write("        <div class=\"container px-5\"><p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2022</p></div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- Bootstrap core JS-->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <!-- Core theme JS-->\r\n");
      out.write("    <script src=\"js/scripts.js\"></script>\r\n");
      out.write("    <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\r\n");
      out.write("    <!-- * *                               SB Forms JS                               * *-->\r\n");
      out.write("    <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->\r\n");
      out.write("    <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\r\n");
      out.write("    <script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\r\n");
      out.write("</body>\r\n");
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
      // /WEB-INF/Pages/LandingPage.jsp(23,4) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
