package tags.demo;

public class JspTemplate
{
  protected static String nl;
  public static synchronized JspTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    JspTemplate result = new JspTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "   <%= request.getParameter(\"";
  protected final String TEXT_3 = "\") %> <!-- this is generated JSP -->" + NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     String paramName = (String) argument; /* This is an executed scriptlet */ 
     if (paramName != null) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(paramName);
    stringBuffer.append(TEXT_3);
     } 
    return stringBuffer.toString();
  }
}
