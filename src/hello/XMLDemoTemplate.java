package hello;

import java.util.*;

public class XMLDemoTemplate
{
  protected static String nl;
  public static synchronized XMLDemoTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    XMLDemoTemplate result = new XMLDemoTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<demo>";
  protected final String TEXT_3 = NL + "\t<element>";
  protected final String TEXT_4 = "</element>";
  protected final String TEXT_5 = NL + "</demo>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     List elementList = (List) argument; 
    stringBuffer.append(TEXT_2);
     for (Iterator i = elementList.iterator(); i.hasNext(); ) { 
    stringBuffer.append(TEXT_3);
    stringBuffer.append(i.next().toString());
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
