package org.apache.jsp.Cadastro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroadvogadojuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fpanelGrid_0026_005fid_005fcolumns;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005ffor_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fselectOneMenu_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fselectItem_0026_005fitemLabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fselectItem_0026_005fitemValue_005fitemLabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputText_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fselectItems_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fsize_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fstyle_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fpanelGrid_0026_005fid_005fcolumns = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005ffor_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fselectOneMenu_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ff_005fselectItem_0026_005fitemLabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ff_005fselectItem_0026_005fitemValue_005fitemLabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputText_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ff_005fselectItems_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fsize_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fstyle_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005fpanelGrid_0026_005fid_005fcolumns.release();
    _005fjspx_005ftagPool_005fh_005foutputLabel_0026_005fvalue_005ffor_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fselectOneMenu_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005ff_005fselectItem_0026_005fitemLabel_005fnobody.release();
    _005fjspx_005ftagPool_005ff_005fselectItem_0026_005fitemValue_005fitemLabel_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005foutputText_005fnobody.release();
    _005fjspx_005ftagPool_005ff_005fselectItems_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fsize_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005foutputText_0026_005fvalue_005fstyle_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SisCadastro - Cadastro de Advogado/Juiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #e7e7e7\">\n");
      out.write("          ");
      if (_jspx_meth_f_005fview_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_005fview_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = new com.sun.faces.taglib.jsf_core.ViewTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
    _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fview_005f0.setParent(null);
    _jspx_th_f_005fview_005f0.setJspId("jsp_1652949246_0");
    int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
    if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_005fview_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fview_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
      return true;
    }
    _jspx_th_f_005fview_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fview_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = new com.sun.faces.taglib.html_basic.FormTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
    _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
    _jspx_th_h_005fform_005f0.setJspId("jsp_1652949246_1");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            <fieldset>\n");
        out.write("\t        <legend>Cadastro de Advogado ou Juiz</legend>\n");
        out.write("                ");
        if (_jspx_meth_h_005fpanelGrid_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            </fieldset>\n");
        out.write("            <fieldset>\n");
        out.write("                <legend>Complemento para cadastro de Juiz</legend>\n");
        out.write("                ");
        if (_jspx_meth_h_005fpanelGrid_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_h_005fcommandButton_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_h_005fcommandButton_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </fieldset>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fform_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
      return true;
    }
    _jspx_th_h_005fform_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fpanelGrid_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:panelGrid
    com.sun.faces.taglib.html_basic.PanelGridTag _jspx_th_h_005fpanelGrid_005f0 = new com.sun.faces.taglib.html_basic.PanelGridTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fpanelGrid_005f0);
    _jspx_th_h_005fpanelGrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fpanelGrid_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(26,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fpanelGrid_005f0.setId("layerpanel");
    // /Cadastro/cadastroadvogadojuiz.jsp(26,16) name = columns type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = int methodSignature = null 
    _jspx_th_h_005fpanelGrid_005f0.setColumns(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(26,16) '3'",_el_expressionfactory.createValueExpression("3",int.class)));
    _jspx_th_h_005fpanelGrid_005f0.setJspId("jsp_1652949246_2");
    int _jspx_eval_h_005fpanelGrid_005f0 = _jspx_th_h_005fpanelGrid_005f0.doStartTag();
    if (_jspx_eval_h_005fpanelGrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fpanelGrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fpanelGrid_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fpanelGrid_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005foutputLabel_005f0(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005fselectOneMenu_005f0(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005foutputText_005f0(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005foutputLabel_005f1(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005fselectOneMenu_005f1(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005foutputText_005f1(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005foutputLabel_005f2(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005finputText_005f0(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_005foutputText_005f2(_jspx_th_h_005fpanelGrid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_h_005fpanelGrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fpanelGrid_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fpanelGrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fpanelGrid_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fpanelGrid_005f0);
      return true;
    }
    _jspx_th_h_005fpanelGrid_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fpanelGrid_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f0 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f0);
    _jspx_th_h_005foutputLabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(28,20) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f0.setFor(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(28,20) 'tipoAJ'",_el_expressionfactory.createValueExpression("tipoAJ",java.lang.String.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(28,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(28,20) 'Está pessoa é: '",_el_expressionfactory.createValueExpression("Está pessoa é: ",java.lang.Object.class)));
    _jspx_th_h_005foutputLabel_005f0.setJspId("jsp_1652949246_3");
    int _jspx_eval_h_005foutputLabel_005f0 = _jspx_th_h_005foutputLabel_005f0.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f0);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fselectOneMenu_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneMenu
    com.sun.faces.taglib.html_basic.SelectOneMenuTag _jspx_th_h_005fselectOneMenu_005f0 = new com.sun.faces.taglib.html_basic.SelectOneMenuTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fselectOneMenu_005f0);
    _jspx_th_h_005fselectOneMenu_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fselectOneMenu_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(29,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f0.setId("tipoAJ");
    // /Cadastro/cadastroadvogadojuiz.jsp(29,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(29,20) '#{advogadojuiz.tipo}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{advogadojuiz.tipo}",java.lang.Object.class)));
    _jspx_th_h_005fselectOneMenu_005f0.setJspId("jsp_1652949246_4");
    int _jspx_eval_h_005fselectOneMenu_005f0 = _jspx_th_h_005fselectOneMenu_005f0.doStartTag();
    if (_jspx_eval_h_005fselectOneMenu_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fselectOneMenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fselectOneMenu_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fselectOneMenu_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_f_005fselectItem_005f0(_jspx_th_h_005fselectOneMenu_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_f_005fselectItem_005f1(_jspx_th_h_005fselectOneMenu_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_f_005fselectItem_005f2(_jspx_th_h_005fselectOneMenu_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_h_005fselectOneMenu_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fselectOneMenu_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fselectOneMenu_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fselectOneMenu_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fselectOneMenu_005f0);
      return true;
    }
    _jspx_th_h_005fselectOneMenu_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fselectOneMenu_005f0);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItem_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_005fselectItem_005f0 = new com.sun.faces.taglib.jsf_core.SelectItemTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f0);
    _jspx_th_f_005fselectItem_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItem_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(30,24) name = itemLabel type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005fselectItem_005f0.setItemLabel(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(30,24) '- Selecione o Tipo - '",_el_expressionfactory.createValueExpression("- Selecione o Tipo - ",java.lang.String.class)));
    _jspx_th_f_005fselectItem_005f0.setJspId("jsp_1652949246_5");
    int _jspx_eval_f_005fselectItem_005f0 = _jspx_th_f_005fselectItem_005f0.doStartTag();
    if (_jspx_th_f_005fselectItem_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItem_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f0);
      return true;
    }
    _jspx_th_f_005fselectItem_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f0);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItem_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_005fselectItem_005f1 = new com.sun.faces.taglib.jsf_core.SelectItemTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f1);
    _jspx_th_f_005fselectItem_005f1.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItem_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(31,24) name = itemValue type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItem_005f1.setItemValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(31,24) 'A'",_el_expressionfactory.createValueExpression("A",java.lang.Object.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(31,24) name = itemLabel type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005fselectItem_005f1.setItemLabel(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(31,24) 'Advogado'",_el_expressionfactory.createValueExpression("Advogado",java.lang.String.class)));
    _jspx_th_f_005fselectItem_005f1.setJspId("jsp_1652949246_6");
    int _jspx_eval_f_005fselectItem_005f1 = _jspx_th_f_005fselectItem_005f1.doStartTag();
    if (_jspx_th_f_005fselectItem_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItem_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f1);
      return true;
    }
    _jspx_th_f_005fselectItem_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f1);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItem_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_005fselectItem_005f2 = new com.sun.faces.taglib.jsf_core.SelectItemTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f2);
    _jspx_th_f_005fselectItem_005f2.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItem_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(32,24) name = itemValue type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItem_005f2.setItemValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(32,24) 'J'",_el_expressionfactory.createValueExpression("J",java.lang.Object.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(32,24) name = itemLabel type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005fselectItem_005f2.setItemLabel(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(32,24) 'Juiz'",_el_expressionfactory.createValueExpression("Juiz",java.lang.String.class)));
    _jspx_th_f_005fselectItem_005f2.setJspId("jsp_1652949246_7");
    int _jspx_eval_f_005fselectItem_005f2 = _jspx_th_f_005fselectItem_005f2.doStartTag();
    if (_jspx_th_f_005fselectItem_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItem_005f2.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f2);
      return true;
    }
    _jspx_th_f_005fselectItem_005f2.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005foutputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_005foutputText_005f0 = new com.sun.faces.taglib.html_basic.OutputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
    _jspx_th_h_005foutputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    _jspx_th_h_005foutputText_005f0.setJspId("jsp_1652949246_8");
    int _jspx_eval_h_005foutputText_005f0 = _jspx_th_h_005foutputText_005f0.doStartTag();
    if (_jspx_th_h_005foutputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputText_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
      return true;
    }
    _jspx_th_h_005foutputText_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f1 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f1);
    _jspx_th_h_005foutputLabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(36,20) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f1.setFor(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(36,20) 'idpessoa'",_el_expressionfactory.createValueExpression("idpessoa",java.lang.String.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(36,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(36,20) 'Id Pessoa: '",_el_expressionfactory.createValueExpression("Id Pessoa: ",java.lang.Object.class)));
    _jspx_th_h_005foutputLabel_005f1.setJspId("jsp_1652949246_9");
    int _jspx_eval_h_005foutputLabel_005f1 = _jspx_th_h_005foutputLabel_005f1.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f1);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005fselectOneMenu_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneMenu
    com.sun.faces.taglib.html_basic.SelectOneMenuTag _jspx_th_h_005fselectOneMenu_005f1 = new com.sun.faces.taglib.html_basic.SelectOneMenuTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fselectOneMenu_005f1);
    _jspx_th_h_005fselectOneMenu_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005fselectOneMenu_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(37,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f1.setId("idpessoa");
    // /Cadastro/cadastroadvogadojuiz.jsp(37,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fselectOneMenu_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(37,20) '#{AdvogadoJuizFaces.selectedLayer.id_pessoa}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{AdvogadoJuizFaces.selectedLayer.id_pessoa}",java.lang.Object.class)));
    _jspx_th_h_005fselectOneMenu_005f1.setJspId("jsp_1652949246_10");
    int _jspx_eval_h_005fselectOneMenu_005f1 = _jspx_th_h_005fselectOneMenu_005f1.doStartTag();
    if (_jspx_eval_h_005fselectOneMenu_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fselectOneMenu_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fselectOneMenu_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fselectOneMenu_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_f_005fselectItem_005f3(_jspx_th_h_005fselectOneMenu_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_f_005fselectItems_005f0(_jspx_th_h_005fselectOneMenu_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_h_005fselectOneMenu_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fselectOneMenu_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fselectOneMenu_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fselectOneMenu_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fselectOneMenu_005f1);
      return true;
    }
    _jspx_th_h_005fselectOneMenu_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fselectOneMenu_005f1);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItem_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_005fselectItem_005f3 = new com.sun.faces.taglib.jsf_core.SelectItemTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f3);
    _jspx_th_f_005fselectItem_005f3.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItem_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f1);
    // /Cadastro/cadastroadvogadojuiz.jsp(38,24) name = itemLabel type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_f_005fselectItem_005f3.setItemLabel(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(38,24) '- Selecione a Pessoa - '",_el_expressionfactory.createValueExpression("- Selecione a Pessoa - ",java.lang.String.class)));
    _jspx_th_f_005fselectItem_005f3.setJspId("jsp_1652949246_11");
    int _jspx_eval_f_005fselectItem_005f3 = _jspx_th_f_005fselectItem_005f3.doStartTag();
    if (_jspx_th_f_005fselectItem_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItem_005f3.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f3);
      return true;
    }
    _jspx_th_f_005fselectItem_005f3.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItem_005f3);
    return false;
  }

  private boolean _jspx_meth_f_005fselectItems_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fselectOneMenu_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItems
    com.sun.faces.taglib.jsf_core.SelectItemsTag _jspx_th_f_005fselectItems_005f0 = new com.sun.faces.taglib.jsf_core.SelectItemsTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_f_005fselectItems_005f0);
    _jspx_th_f_005fselectItems_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fselectItems_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fselectOneMenu_005f1);
    // /Cadastro/cadastroadvogadojuiz.jsp(39,24) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_f_005fselectItems_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(39,24) '#{AdvogadoJuizFaces.clientsOfSystem}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{AdvogadoJuizFaces.clientsOfSystem}",java.lang.Object.class)));
    _jspx_th_f_005fselectItems_005f0.setJspId("jsp_1652949246_12");
    int _jspx_eval_f_005fselectItems_005f0 = _jspx_th_f_005fselectItems_005f0.doStartTag();
    if (_jspx_th_f_005fselectItems_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fselectItems_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItems_005f0);
      return true;
    }
    _jspx_th_f_005fselectItems_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_f_005fselectItems_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputText_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_005foutputText_005f1 = new com.sun.faces.taglib.html_basic.OutputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f1);
    _jspx_th_h_005foutputText_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputText_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    _jspx_th_h_005foutputText_005f1.setJspId("jsp_1652949246_13");
    int _jspx_eval_h_005foutputText_005f1 = _jspx_th_h_005foutputText_005f1.doStartTag();
    if (_jspx_th_h_005foutputText_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputText_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f1);
      return true;
    }
    _jspx_th_h_005foutputText_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f2 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f2);
    _jspx_th_h_005foutputLabel_005f2.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(43,20) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f2.setFor(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(43,20) 'codoab'",_el_expressionfactory.createValueExpression("codoab",java.lang.String.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(43,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(43,20) 'Código da OAB: '",_el_expressionfactory.createValueExpression("Código da OAB: ",java.lang.Object.class)));
    _jspx_th_h_005foutputLabel_005f2.setJspId("jsp_1652949246_14");
    int _jspx_eval_h_005foutputLabel_005f2 = _jspx_th_h_005foutputLabel_005f2.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f2.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f2);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f2.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f0 = new com.sun.faces.taglib.html_basic.InputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f0);
    _jspx_th_h_005finputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(44,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f0.setId("codoab");
    // /Cadastro/cadastroadvogadojuiz.jsp(44,20) name = size type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = int methodSignature = null 
    _jspx_th_h_005finputText_005f0.setSize(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(44,20) '12'",_el_expressionfactory.createValueExpression("12",int.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(44,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(44,20) '#{AdvogadoJuizFaces.selectedLayer.cod_oab}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{AdvogadoJuizFaces.selectedLayer.cod_oab}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f0.setJspId("jsp_1652949246_15");
    int _jspx_eval_h_005finputText_005f0 = _jspx_th_h_005finputText_005f0.doStartTag();
    if (_jspx_th_h_005finputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f0);
      return true;
    }
    _jspx_th_h_005finputText_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005foutputText_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_005foutputText_005f2 = new com.sun.faces.taglib.html_basic.OutputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f2);
    _jspx_th_h_005foutputText_005f2.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputText_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(45,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005foutputText_005f2.setId("msgoab");
    // /Cadastro/cadastroadvogadojuiz.jsp(45,20) name = style type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputText_005f2.setStyle(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(45,20) 'color: red'",_el_expressionfactory.createValueExpression("color: red",java.lang.String.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(45,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputText_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(45,20) '*Para quem é advogado'",_el_expressionfactory.createValueExpression("*Para quem é advogado",java.lang.Object.class)));
    _jspx_th_h_005foutputText_005f2.setJspId("jsp_1652949246_16");
    int _jspx_eval_h_005foutputText_005f2 = _jspx_th_h_005foutputText_005f2.doStartTag();
    if (_jspx_th_h_005foutputText_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputText_005f2.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f2);
      return true;
    }
    _jspx_th_h_005foutputText_005f2.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputText_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005fpanelGrid_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:panelGrid
    com.sun.faces.taglib.html_basic.PanelGridTag _jspx_th_h_005fpanelGrid_005f1 = new com.sun.faces.taglib.html_basic.PanelGridTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fpanelGrid_005f1);
    _jspx_th_h_005fpanelGrid_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005fpanelGrid_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(50,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005fpanelGrid_005f1.setId("Layerpnaelcomplemento");
    // /Cadastro/cadastroadvogadojuiz.jsp(50,16) name = columns type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = int methodSignature = null 
    _jspx_th_h_005fpanelGrid_005f1.setColumns(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(50,16) '2'",_el_expressionfactory.createValueExpression("2",int.class)));
    _jspx_th_h_005fpanelGrid_005f1.setJspId("jsp_1652949246_17");
    int _jspx_eval_h_005fpanelGrid_005f1 = _jspx_th_h_005fpanelGrid_005f1.doStartTag();
    if (_jspx_eval_h_005fpanelGrid_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fpanelGrid_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fpanelGrid_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fpanelGrid_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_005foutputLabel_005f3(_jspx_th_h_005fpanelGrid_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_005finputText_005f1(_jspx_th_h_005fpanelGrid_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_005foutputLabel_005f4(_jspx_th_h_005fpanelGrid_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_h_005finputText_005f2(_jspx_th_h_005fpanelGrid_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                   \n");
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_h_005fpanelGrid_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fpanelGrid_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fpanelGrid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fpanelGrid_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fpanelGrid_005f1);
      return true;
    }
    _jspx_th_h_005fpanelGrid_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fpanelGrid_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f3 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f3);
    _jspx_th_h_005foutputLabel_005f3.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f1);
    // /Cadastro/cadastroadvogadojuiz.jsp(52,24) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f3.setFor(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(52,24) 'nvara'",_el_expressionfactory.createValueExpression("nvara",java.lang.String.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(52,24) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(52,24) 'Nº da Vara: '",_el_expressionfactory.createValueExpression("Nº da Vara: ",java.lang.Object.class)));
    _jspx_th_h_005foutputLabel_005f3.setJspId("jsp_1652949246_18");
    int _jspx_eval_h_005foutputLabel_005f3 = _jspx_th_h_005foutputLabel_005f3.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f3.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f3);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f3.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f3);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f1 = new com.sun.faces.taglib.html_basic.InputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f1);
    _jspx_th_h_005finputText_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f1);
    // /Cadastro/cadastroadvogadojuiz.jsp(53,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f1.setId("nvara");
    // /Cadastro/cadastroadvogadojuiz.jsp(53,24) name = size type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = int methodSignature = null 
    _jspx_th_h_005finputText_005f1.setSize(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(53,24) '4'",_el_expressionfactory.createValueExpression("4",int.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(53,24) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(53,24) '#{AdvogadoJuizFaces.selectedLayer.nvara}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{AdvogadoJuizFaces.selectedLayer.nvara}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f1.setJspId("jsp_1652949246_19");
    int _jspx_eval_h_005finputText_005f1 = _jspx_th_h_005finputText_005f1.doStartTag();
    if (_jspx_th_h_005finputText_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f1);
      return true;
    }
    _jspx_th_h_005finputText_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005foutputLabel_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLabel
    com.sun.faces.taglib.html_basic.OutputLabelTag _jspx_th_h_005foutputLabel_005f4 = new com.sun.faces.taglib.html_basic.OutputLabelTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f4);
    _jspx_th_h_005foutputLabel_005f4.setPageContext(_jspx_page_context);
    _jspx_th_h_005foutputLabel_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f1);
    // /Cadastro/cadastroadvogadojuiz.jsp(56,24) name = for type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.String methodSignature = null 
    _jspx_th_h_005foutputLabel_005f4.setFor(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(56,24) 'descricaovara'",_el_expressionfactory.createValueExpression("descricaovara",java.lang.String.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(56,24) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005foutputLabel_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(56,24) 'Descrição da Vara: '",_el_expressionfactory.createValueExpression("Descrição da Vara: ",java.lang.Object.class)));
    _jspx_th_h_005foutputLabel_005f4.setJspId("jsp_1652949246_20");
    int _jspx_eval_h_005foutputLabel_005f4 = _jspx_th_h_005foutputLabel_005f4.doStartTag();
    if (_jspx_th_h_005foutputLabel_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005foutputLabel_005f4.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f4);
      return true;
    }
    _jspx_th_h_005foutputLabel_005f4.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005foutputLabel_005f4);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fpanelGrid_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f2 = new com.sun.faces.taglib.html_basic.InputTextTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f2);
    _jspx_th_h_005finputText_005f2.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fpanelGrid_005f1);
    // /Cadastro/cadastroadvogadojuiz.jsp(57,24) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f2.setId("descricaovara");
    // /Cadastro/cadastroadvogadojuiz.jsp(57,24) name = size type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = int methodSignature = null 
    _jspx_th_h_005finputText_005f2.setSize(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(57,24) '16'",_el_expressionfactory.createValueExpression("16",int.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(57,24) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(57,24) '#{AdvogadoJuizFaces.selectedLayer.descricaodaVara}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{AdvogadoJuizFaces.selectedLayer.descricaodaVara}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f2.setJspId("jsp_1652949246_21");
    int _jspx_eval_h_005finputText_005f2 = _jspx_th_h_005finputText_005f2.doStartTag();
    if (_jspx_th_h_005finputText_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f2.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f2);
      return true;
    }
    _jspx_th_h_005finputText_005f2.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005finputText_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005fcommandButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_005fcommandButton_005f0 = new com.sun.faces.taglib.html_basic.CommandButtonTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f0);
    _jspx_th_h_005fcommandButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fcommandButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(61,16) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fcommandButton_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(61,16) 'Salvar'",_el_expressionfactory.createValueExpression("Salvar",java.lang.Object.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(61,16) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false deferredMethod = true expectedTypeName = null methodSignature = java.lang.Object action() 
    _jspx_th_h_005fcommandButton_005f0.setAction(new org.apache.jasper.el.JspMethodExpression("/Cadastro/cadastroadvogadojuiz.jsp(61,16) '#{AdvogadoJuizFaces.FinishedLayer}'",_el_expressionfactory.createMethodExpression(_jspx_page_context.getELContext(),"#{AdvogadoJuizFaces.FinishedLayer}",java.lang.Object.class,new Class[] {})));
    _jspx_th_h_005fcommandButton_005f0.setJspId("jsp_1652949246_22");
    int _jspx_eval_h_005fcommandButton_005f0 = _jspx_th_h_005fcommandButton_005f0.doStartTag();
    if (_jspx_th_h_005fcommandButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fcommandButton_005f0.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f0);
      return true;
    }
    _jspx_th_h_005fcommandButton_005f0.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fcommandButton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_005fcommandButton_005f1 = new com.sun.faces.taglib.html_basic.CommandButtonTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f1);
    _jspx_th_h_005fcommandButton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005fcommandButton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /Cadastro/cadastroadvogadojuiz.jsp(62,16) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fcommandButton_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/Cadastro/cadastroadvogadojuiz.jsp(62,16) 'Voltar'",_el_expressionfactory.createValueExpression("Voltar",java.lang.Object.class)));
    // /Cadastro/cadastroadvogadojuiz.jsp(62,16) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false deferredMethod = true expectedTypeName = null methodSignature = java.lang.Object action() 
    _jspx_th_h_005fcommandButton_005f1.setAction(new org.apache.jasper.el.JspMethodExpression("/Cadastro/cadastroadvogadojuiz.jsp(62,16) '#{UserFaces.BacktoMenu}'",_el_expressionfactory.createMethodExpression(_jspx_page_context.getELContext(),"#{UserFaces.BacktoMenu}",java.lang.Object.class,new Class[] {})));
    _jspx_th_h_005fcommandButton_005f1.setJspId("jsp_1652949246_23");
    int _jspx_eval_h_005fcommandButton_005f1 = _jspx_th_h_005fcommandButton_005f1.doStartTag();
    if (_jspx_th_h_005fcommandButton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fcommandButton_005f1.release();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f1);
      return true;
    }
    _jspx_th_h_005fcommandButton_005f1.release();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_h_005fcommandButton_005f1);
    return false;
  }
}
