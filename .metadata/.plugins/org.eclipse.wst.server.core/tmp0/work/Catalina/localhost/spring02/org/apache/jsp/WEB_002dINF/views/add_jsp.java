/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.107
 * Generated at: 2021-03-16 05:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- menu -->\r\n");
      out.write("<nav class=\"navbar navbar-default  navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("      비트교육센터\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("    \t<li><a href=\"index.do\">home</a></li>\r\n");
      out.write("    \t<li><a href=\"intro.do\">intro</a></li>\r\n");
      out.write("    \t<li><a href=\"list.do\">dept</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- content -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t  <div class=\"col-xs-12\">\r\n");
      out.write("\t  <!-- start -->\r\n");
      out.write("\t  <ol class=\"breadcrumb\">\r\n");
      out.write("  <li><a href=\"index.do\">Home</a></li>\r\n");
      out.write("  <li><a href=\"list.do\">DEPT</a></li>\r\n");
      out.write("  <li class=\"active\">ADD</li>\r\n");
      out.write("</ol>\r\n");
      out.write("\t  <div class=\"page-header\">\r\n");
      out.write("  <h1>입력 페이지 <small>DEPT 테이블 추가</small></h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 입력 폼 작업 -->\r\n");
      out.write("<form class=\"form-horizontal\" action=\"insert.do\" method=\"post\">\r\n");
      out.write("<!-- 여기서 입력 후에 폼 액션이 일어나면 insert.do 이름으로 핸들러를 찾음 -->\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("    <label for=\"deptno\" class=\"col-sm-2 control-label\">deptno</label>\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" name = \"deptno\" id=\"\"deptno placeholder=\"deptno\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("    <label for=\"dname\" class=\"col-sm-2 control-label\">dname</label>\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" name = \"dname\" id=\"dname\" placeholder=\"dname\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("    <label for=\"loc\" class=\"col-sm-2 control-label\">loc</label>\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" name = \"loc\" id=\"loc\" placeholder=\"loc\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">입력</button>\r\n");
      out.write("      <button type=\"reset\" class=\"btn btn-default\">취소</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("\t  <!-- end -->\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t  <div class=\"col-xs-12 text-center\">\r\n");
      out.write("\t  Copyright &copy; 비트캠프 </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
}