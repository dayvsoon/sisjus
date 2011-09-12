package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeJSF_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_requiredMessage_required_onkeypress_onkeydown_onfocus_onblur_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_message_styleClass_for_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputSecret_value_requiredMessage_required_onkeypress_onkeydown_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_styleClass_action_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_messages_styleClass_globalOnly_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_styleClass_immediate_action_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_requiredMessage_required_onkeypress_onkeydown_onfocus_onblur_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_message_styleClass_for_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputSecret_value_requiredMessage_required_onkeypress_onkeydown_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_messages_styleClass_globalOnly_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_styleClass_immediate_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_form.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_h_outputText_value_id_nobody.release();
    _jspx_tagPool_h_inputText_value_requiredMessage_required_onkeypress_onkeydown_onfocus_onblur_id_nobody.release();
    _jspx_tagPool_h_message_styleClass_for_nobody.release();
    _jspx_tagPool_h_inputSecret_value_requiredMessage_required_onkeypress_onkeydown_id_nobody.release();
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.release();
    _jspx_tagPool_h_messages_styleClass_globalOnly_nobody.release();
    _jspx_tagPool_h_commandButton_value_styleClass_immediate_action_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write('\n');
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id9");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <html>\n");
        out.write("\n");
        out.write("        <head>\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
        out.write("            <title>Bem vindo ao SisJus</title>\n");
        out.write("            <style type=\"text/css\">\n");
        out.write("\n");
        out.write("                body {\n");
        out.write("                    margin: 0;\n");
        out.write("                    background-color: #e7e7e7;\n");
        out.write("                    padding-top: 200px;\n");
        out.write("                    position: relative;\n");
        out.write("                }\n");
        out.write("                .button {\n");
        out.write("                    border: 1px solid #1C1A74;\n");
        out.write("                    background: #B4C6DC;\n");
        out.write("                }\n");
        out.write("                .tituloSistema{\n");
        out.write("                    color: #ffffff;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                    font-size: 30px;\n");
        out.write("                }\n");
        out.write("                .verSistema{\n");
        out.write("                    color: #ffffff;\n");
        out.write("                }\n");
        out.write("                .mensagemErro{\n");
        out.write("                    color: #ff0000;\n");
        out.write("                }\n");
        out.write("                .tabelaCentral{\n");
        out.write("                    border: 0;\n");
        out.write("                    width: 760px;\n");
        out.write("                    height: 100%;\n");
        out.write("                    vertical-align: middle;\n");
        out.write("                }\n");
        out.write("                .celulaSuperior{\n");
        out.write("                    background-color: lightgreen;\n");
        out.write("                    border-style: solid;\n");
        out.write("                    border-width: 3px 3px 0px 3px;\n");
        out.write("                    border-color: #ffffff;\n");
        out.write("                    padding-right: 10px;\n");
        out.write("                    color: #ffffff;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .celulaSuperiorSemBorda{\n");
        out.write("                    background-color: #34669B;\n");
        out.write("                    border-style: solid;\n");
        out.write("                    border-width: 0px 0px 0px 0px;\n");
        out.write("                    border-color: #ffffff;\n");
        out.write("                    padding-right: 10px;\n");
        out.write("                    color: #ffffff;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .celulaCentralAzul{\n");
        out.write("                    color: #1C1A74;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                    background-color: #B4C6DC;\n");
        out.write("                    border-style: solid;\n");
        out.write("                    border-width: 0px 3px 0px 3px;\n");
        out.write("                    border-color: #ffffff;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .celulaCentralAzulSemBorda{\n");
        out.write("                    color: #1C1A74;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                    background-color: #B4C6DC;\n");
        out.write("                    border-style: none;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .celulaCentralCinzaDireita{\n");
        out.write("                    text-align: right;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                    border-style: solid;\n");
        out.write("                    border-width: 0px 0px 0px 3px;\n");
        out.write("                    border-color: #ffffff;\n");
        out.write("                    background-color: #D2D2D2;\n");
        out.write("                }\n");
        out.write("                .celulaCentralCinzaEsquerda{\n");
        out.write("                    border-style: solid;\n");
        out.write("                    border-width: 0px 3px 0px 0px;\n");
        out.write("                    border-color: #ffffff;\n");
        out.write("                    background-color: #D2D2D2;\n");
        out.write("                }\n");
        out.write("                .celulaInferior{\n");
        out.write("                    text-align: center;\n");
        out.write("                    background-color: lightgreen;\n");
        out.write("                    border-style: solid;\n");
        out.write("                    border-width: 0px 3px 3px 3px;\n");
        out.write("                    border-color: #ffffff;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                    color: #ffffff;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .celulaInferiorSemBorda{\n");
        out.write("                    text-align: center;\n");
        out.write("                    background-color: #34669B;\n");
        out.write("                    border-style: none;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                    color: #ffffff;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .tabelaTeste{\n");
        out.write("                    position: absolute;\n");
        out.write("                    bottom: 0px;\n");
        out.write("                    width: 100%;\n");
        out.write("                    height: 30px;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .linha1{\n");
        out.write("                    background-color: gray;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                .linha2{\n");
        out.write("                    background-color: #FFFFFF;\n");
        out.write("                }\n");
        out.write("                .Cadastro{\n");
        out.write("                    text-align: center;\n");
        out.write("                    color: gray;\n");
        out.write("                    border: 0px solid #1C1A74;\n");
        out.write("                    font-weight: bold;\n");
        out.write("                }\n");
        out.write("\n");
        out.write("\n");
        out.write("            </style>\n");
        out.write("\n");
        out.write("        </head>\n");
        out.write("\n");
        out.write("        <body>\n");
        out.write("            <table align=\"center\"  cellspacing=\"0\" cellpadding=\"0\" class=\"tabelaCentral\">\n");
        out.write("                <tr height=\"100%\">\n");
        out.write("                    <td>\n");
        out.write("                        ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </td>\n");
        out.write("                </tr>\n");
        out.write("            </table>\n");
        out.write("        </body>\n");
        out.write("    </html>\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id23");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            <table width=\"60%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\n");
        out.write("                                <tr height=\"80px\">\n");
        out.write("                                    <td align=\"right\" colspan=\"2\" class=\"celulaSuperior\">\n");
        out.write("                                        <span class=\"tituloSistema\">\n");
        out.write("                                            &nbsp;");
        if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </span><br/>\n");
        out.write("                                        <span class=\"verSistema\">");
        if (_jspx_meth_h_outputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        if (_jspx_meth_h_outputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</span>\n");
        out.write("                                    </td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr height=\"30px\">\n");
        out.write("                                    <td colspan=\"2\" align=\"center\" class=\"celulaCentralAzul\">");
        if (_jspx_meth_h_outputText_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr height=\"30px\">\n");
        out.write("                                    <td class=\"celulaCentralCinzaDireita\"><span class=\"mensagemErro\">*</span>");
        if (_jspx_meth_h_outputText_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                    <td class=\"celulaCentralCinzaEsquerda\">");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        <br>");
        if (_jspx_meth_h_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr height=\"30px\">\n");
        out.write("                                    <td class=\"celulaCentralCinzaDireita\"><span class=\"mensagemErro\">*</span>Senha:&nbsp;</td>\n");
        out.write("                                    <td class=\"celulaCentralCinzaEsquerda\">");
        if (_jspx_meth_h_inputSecret_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("&nbsp;\n");
        out.write("                                        <br>");
        if (_jspx_meth_h_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    </td>\n");
        out.write("                                </tr>\n");
        out.write("                                <tr height=\"50px\">\n");
        out.write("                                    <td class=\"celulaCentralCinzaDireita\">&nbsp;</td>\n");
        out.write("                                    <td class=\"celulaCentralCinzaEsquerda\">\n");
        out.write("                                        ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("&nbsp;\n");
        out.write("                                        ");
        if (_jspx_meth_h_messages_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_h_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("&nbsp;\n");
        out.write("\n");
        out.write("                                        </td>\n");
        out.write("                                    </tr>                                                       \n");
        out.write("                                    <tr height=\"30px\">\n");
        out.write("                                        <td colspan=\"2\" class=\"celulaInferior\">Desenvolvido por ");
        if (_jspx_meth_h_outputText_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                                </tr>\n");
        out.write("                            </table>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_0.setJspId("id29");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{Sistema.siglaDoSistema}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_1.setJspId("id34");
    _jspx_th_h_outputText_1.setId("SiglaVersao");
    _jspx_th_h_outputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Ver. ", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_1);
      return true;
    }
    _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_2.setJspId("id35");
    _jspx_th_h_outputText_2.setId("VersãoDoSistema");
    _jspx_th_h_outputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{Sistema.version}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_2 = _jspx_th_h_outputText_2.doStartTag();
    if (_jspx_th_h_outputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_2);
      return true;
    }
    _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_2);
    return false;
  }

  private boolean _jspx_meth_h_outputText_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_3.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_3.setJspId("id41");
    _jspx_th_h_outputText_3.setId("MsgBemVindo");
    _jspx_th_h_outputText_3.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Bem-Vindo. Identifique o usuário", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_3 = _jspx_th_h_outputText_3.doStartTag();
    if (_jspx_th_h_outputText_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_3);
      return true;
    }
    _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_3);
    return false;
  }

  private boolean _jspx_meth_h_outputText_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_4.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_4.setJspId("id48");
    _jspx_th_h_outputText_4.setId("usuario");
    _jspx_th_h_outputText_4.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Usuário: ", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_4 = _jspx_th_h_outputText_4.doStartTag();
    if (_jspx_th_h_outputText_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_4);
      return true;
    }
    _jspx_tagPool_h_outputText_value_id_nobody.reuse(_jspx_th_h_outputText_4);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setJspId("id51");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{UserFaces.login}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_0.setOnfocus(org.apache.jasper.runtime.PageContextImpl.getValueExpression("if (this.value == 'Usuário') { this.value = '';}", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_inputText_0.setOnblur(org.apache.jasper.runtime.PageContextImpl.getValueExpression("if (this.value == 'Usuário') { this.value = '';}", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_inputText_0.setOnkeypress(org.apache.jasper.runtime.PageContextImpl.getValueExpression("this.style.backgroundColor='lightgreen'", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_inputText_0.setOnkeydown(org.apache.jasper.runtime.PageContextImpl.getValueExpression("this.style.backgroundColor='white'", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_inputText_0.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_h_inputText_0.setId("userID");
    _jspx_th_h_inputText_0.setRequiredMessage(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Usuário tem que ser informado!", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_requiredMessage_required_onkeypress_onkeydown_onfocus_onblur_id_nobody.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_requiredMessage_required_onkeypress_onkeydown_onfocus_onblur_id_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_0.setPageContext(_jspx_page_context);
    _jspx_th_h_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_0.setJspId("id54");
    _jspx_th_h_message_0.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("userID", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_message_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("mensagemErro", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_message_0 = _jspx_th_h_message_0.doStartTag();
    if (_jspx_th_h_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_styleClass_for_nobody.reuse(_jspx_th_h_message_0);
      return true;
    }
    _jspx_tagPool_h_message_styleClass_for_nobody.reuse(_jspx_th_h_message_0);
    return false;
  }

  private boolean _jspx_meth_h_inputSecret_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputSecret
    com.sun.faces.taglib.html_basic.InputSecretTag _jspx_th_h_inputSecret_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputSecretTag.class) : new com.sun.faces.taglib.html_basic.InputSecretTag();
    _jspx_th_h_inputSecret_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputSecret_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputSecret_0.setJspId("id64");
    _jspx_th_h_inputSecret_0.setOnkeypress(org.apache.jasper.runtime.PageContextImpl.getValueExpression("this.style.backgroundColor='lightgreen'", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_inputSecret_0.setOnkeydown(org.apache.jasper.runtime.PageContextImpl.getValueExpression("this.style.backgroundColor='white'", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_inputSecret_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{UserFaces.password}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputSecret_0.setRequired(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_h_inputSecret_0.setId("passwordID");
    _jspx_th_h_inputSecret_0.setRequiredMessage(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Senha tem que ser informada!", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_inputSecret_0 = _jspx_th_h_inputSecret_0.doStartTag();
    if (_jspx_th_h_inputSecret_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputSecret_value_requiredMessage_required_onkeypress_onkeydown_id_nobody.reuse(_jspx_th_h_inputSecret_0);
      return true;
    }
    _jspx_tagPool_h_inputSecret_value_requiredMessage_required_onkeypress_onkeydown_id_nobody.reuse(_jspx_th_h_inputSecret_0);
    return false;
  }

  private boolean _jspx_meth_h_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_1.setPageContext(_jspx_page_context);
    _jspx_th_h_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_message_1.setJspId("id67");
    _jspx_th_h_message_1.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("passwordID", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_message_1.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("mensagemErro", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_message_1 = _jspx_th_h_message_1.doStartTag();
    if (_jspx_th_h_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_styleClass_for_nobody.reuse(_jspx_th_h_message_1);
      return true;
    }
    _jspx_tagPool_h_message_styleClass_for_nobody.reuse(_jspx_th_h_message_1);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id75");
    _jspx_th_h_commandButton_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("button", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Acessar", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{UserFaces.doAutenthicLogin}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_messages_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:messages
    com.sun.faces.taglib.html_basic.MessagesTag _jspx_th_h_messages_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessagesTag.class) : new com.sun.faces.taglib.html_basic.MessagesTag();
    _jspx_th_h_messages_0.setPageContext(_jspx_page_context);
    _jspx_th_h_messages_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_messages_0.setJspId("id77");
    _jspx_th_h_messages_0.setGlobalOnly(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    _jspx_th_h_messages_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("mensagemErro", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_messages_0 = _jspx_th_h_messages_0.doStartTag();
    if (_jspx_th_h_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_messages_styleClass_globalOnly_nobody.reuse(_jspx_th_h_messages_0);
      return true;
    }
    _jspx_tagPool_h_messages_styleClass_globalOnly_nobody.reuse(_jspx_th_h_messages_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_1.setJspId("id79");
    _jspx_th_h_commandButton_1.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("button", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Cadastrar", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{UserFaces.doAddUser}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    _jspx_th_h_commandButton_1.setImmediate(org.apache.jasper.runtime.PageContextImpl.getValueExpression("true", (PageContext)_jspx_page_context, boolean.class, null));
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_immediate_action_nobody.reuse(_jspx_th_h_commandButton_1);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_immediate_action_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_5.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_5.setJspId("id85");
    _jspx_th_h_outputText_5.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{Sistema.autor}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_5 = _jspx_th_h_outputText_5.doStartTag();
    if (_jspx_th_h_outputText_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
    return false;
  }
}
