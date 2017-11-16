package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class bh
{
  public static ThreadLocal<XmlPullParser> vlD;
  
  static
  {
    GMTrace.i(13867509874688L, 103321);
    vlD = new ThreadLocal();
    GMTrace.o(13867509874688L, 103321);
  }
  
  public static String b(Node paramNode)
  {
    GMTrace.i(17568697942016L, 130897);
    StringWriter localStringWriter = new StringWriter();
    try
    {
      Transformer localTransformer = TransformerFactory.newInstance().newTransformer();
      localTransformer.setOutputProperty("omit-xml-declaration", "yes");
      localTransformer.transform(new DOMSource(paramNode), new StreamResult(localStringWriter));
      paramNode = localStringWriter.toString();
      GMTrace.o(17568697942016L, 130897);
      return paramNode;
    }
    catch (TransformerException paramNode)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.XmlParser", "nodeToString: %s", new Object[] { paramNode.getMessage() });
      }
    }
  }
  
  public static Map<String, String> q(String paramString1, String paramString2)
  {
    GMTrace.i(13867241439232L, 103319);
    if (paramString1 == null) {}
    for (int i = -1; i < 0; i = paramString1.indexOf("<" + paramString2))
    {
      w.e("MicroMsg.SDK.XmlParser", "can not find the tag <%s>", new Object[] { paramString2 });
      GMTrace.o(13867241439232L, 103319);
      return null;
    }
    String str = paramString1;
    if (i > 0) {
      str = paramString1.substring(i);
    }
    try
    {
      paramString1 = new a(str, paramString2).bRd();
      GMTrace.o(13867241439232L, 103319);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.SDK.XmlParser", paramString1, "[ %s ]", new Object[] { str });
      GMTrace.o(13867241439232L, 103319);
    }
    return null;
  }
  
  private static final class a
  {
    private XmlPullParser vlE;
    private String vlF;
    private StringBuilder vlG;
    private Map<String, String> vlH;
    private Map<Integer, Integer> vlI;
    
    public a(String paramString1, String paramString2)
    {
      GMTrace.i(13913278119936L, 103662);
      this.vlG = new StringBuilder();
      this.vlF = paramString2;
      paramString2 = (XmlPullParser)bh.vlD.get();
      this.vlE = paramString2;
      if (paramString2 == null)
      {
        paramString2 = bh.vlD;
        XmlPullParser localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
        this.vlE = localXmlPullParser;
        paramString2.set(localXmlPullParser);
      }
      this.vlE.setInput(new StringReader(paramString1));
      this.vlI = new HashMap();
      this.vlH = new HashMap();
      GMTrace.o(13913278119936L, 103662);
    }
    
    public final Map<String, String> bRd()
    {
      GMTrace.i(13913412337664L, 103663);
      int i = this.vlE.getEventType();
      for (;;)
      {
        Object localObject;
        if (i != 1)
        {
          i = this.vlE.next();
          if (i == 2)
          {
            this.vlG.append('.').append(this.vlE.getName());
            localObject = this.vlG.toString();
            int j = ((String)localObject).hashCode();
            Integer localInteger = (Integer)this.vlI.get(Integer.valueOf(j));
            if (localInteger != null)
            {
              localInteger = Integer.valueOf(localInteger.intValue() + 1);
              this.vlG.append(localInteger);
              this.vlI.put(Integer.valueOf(j), localInteger);
              localObject = (String)localObject + localInteger;
            }
            for (;;)
            {
              this.vlH.put(localObject, "");
              j = 0;
              while (j < this.vlE.getAttributeCount())
              {
                this.vlH.put((String)localObject + ".$" + this.vlE.getAttributeName(j), this.vlE.getAttributeValue(j));
                j += 1;
              }
              this.vlI.put(Integer.valueOf(j), Integer.valueOf(0));
            }
          }
          else if (i == 4)
          {
            localObject = this.vlE.getText();
            if (localObject != null) {
              this.vlH.put(this.vlG.toString(), localObject);
            }
          }
          else if (i == 3)
          {
            this.vlG = this.vlG.delete(this.vlG.lastIndexOf("."), this.vlG.length());
            if (this.vlG.length() != 0) {}
          }
        }
        else
        {
          localObject = this.vlH;
          GMTrace.o(13913412337664L, 103663);
          return (Map<String, String>)localObject;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */