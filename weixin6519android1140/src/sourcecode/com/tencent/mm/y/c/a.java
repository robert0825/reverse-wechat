package com.tencent.mm.y.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.c;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class a
{
  private static DocumentBuilder gpT;
  
  static
  {
    GMTrace.i(637668425728L, 4751);
    gpT = null;
    GMTrace.o(637668425728L, 4751);
  }
  
  private static String a(Node paramNode)
  {
    GMTrace.i(637534208000L, 4750);
    StringWriter localStringWriter = new StringWriter();
    try
    {
      Transformer localTransformer = TransformerFactory.newInstance().newTransformer();
      localTransformer.setOutputProperty("omit-xml-declaration", "yes");
      localTransformer.transform(new DOMSource(paramNode), new StreamResult(localStringWriter));
      paramNode = localStringWriter.toString();
      GMTrace.o(637534208000L, 4750);
      return paramNode;
    }
    catch (TransformerException paramNode)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ABTestParser", paramNode, "nodeToString", new Object[0]);
      }
    }
  }
  
  public static a hj(String paramString)
  {
    GMTrace.i(637131554816L, 4747);
    a locala = new a();
    w.d("MicroMsg.ABTestParser", "ABTest msg content: %s", new Object[] { paramString });
    Object localObject1 = hl(paramString);
    if (localObject1 == null)
    {
      w.e("MicroMsg.ABTestParser", "Msg parsing failed, msg: %s", new Object[] { paramString });
      GMTrace.o(637131554816L, 4747);
      return locala;
    }
    paramString = ((Element)localObject1).getAttributes();
    if (paramString == null)
    {
      GMTrace.o(637131554816L, 4747);
      return null;
    }
    paramString = paramString.getNamedItem("type");
    int i;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    label481:
    boolean bool;
    label871:
    long l2;
    if ((paramString != null) && ("newabtestinfo".equals(paramString.getNodeValue())))
    {
      paramString = ((Element)localObject1).getElementsByTagName("prioritylevel");
      if (paramString.getLength() > 0)
      {
        i = bg.getInt(paramString.item(0).getTextContent(), 1);
        localObject1 = ((Element)localObject1).getChildNodes();
        int j = 0;
        if (j < ((NodeList)localObject1).getLength())
        {
          localObject2 = ((NodeList)localObject1).item(j);
          if ((localObject2 == null) || ((((Node)localObject2).getNodeType() == 1) && (((Node)localObject2).getNodeName().equals("exp")))) {}
          for (;;)
          {
            try
            {
              localObject3 = (Element)localObject2;
              paramString = new c();
              localObject4 = ((Element)localObject3).getAttributes();
              if (localObject4 != null) {
                continue;
              }
              paramString = null;
            }
            catch (Exception paramString)
            {
              w.printErrStackTrace("MicroMsg.ABTestParser", paramString, "parseExp", new Object[0]);
              continue;
              paramString.field_sequence = bg.getLong(((NodeList)localObject4).item(0).getTextContent(), 0L);
              localObject4 = ((Element)localObject3).getElementsByTagName("prioritylevel");
              if (((NodeList)localObject4).getLength() <= 0) {
                continue;
              }
              paramString.field_prioritylevel = bg.getInt(((NodeList)localObject4).item(0).getTextContent(), 0);
              localObject4 = ((Element)localObject3).getElementsByTagName("starttime");
              if (((NodeList)localObject4).getLength() <= 0) {
                continue;
              }
              paramString.field_startTime = bg.getLong(((NodeList)localObject4).item(0).getTextContent(), 0L);
              if (paramString.field_startTime != 0L) {
                continue;
              }
              paramString.field_startTime = (System.currentTimeMillis() / 1000L);
              localObject4 = ((Element)localObject3).getElementsByTagName("endtime");
              if (((NodeList)localObject4).getLength() <= 0) {
                continue;
              }
              paramString.field_endTime = bg.getLong(((NodeList)localObject4).item(0).getTextContent(), 0L);
              if (paramString.field_endTime != 0L) {
                continue;
              }
              paramString.field_endTime = Long.MAX_VALUE;
              localObject4 = ((Element)localObject3).getElementsByTagName("noreport");
              if (((NodeList)localObject4).getLength() <= 0) {
                continue;
              }
              if (bg.getInt(((NodeList)localObject4).item(0).getTextContent(), 0) != 0) {
                continue;
              }
              bool = true;
              paramString.field_needReport = bool;
              paramString.field_rawXML = a((Node)localObject3);
              continue;
              paramString.field_prioritylevel = 0;
              continue;
              bool = false;
              continue;
              localObject2 = ((NamedNodeMap)localObject2).getNamedItem("id");
              if (localObject2 != null) {
                continue;
              }
              paramString = null;
              continue;
              localObject2 = ((Node)localObject2).getNodeValue();
              localObject3 = ((Element)localObject4).getElementsByTagName("sequence");
              if (((NodeList)localObject3).getLength() != 0) {
                continue;
              }
              paramString = null;
              continue;
              l3 = bg.getLong(((NodeList)localObject3).item(0).getTextContent(), 0L);
              localObject3 = ((Element)localObject4).getElementsByTagName("starttime");
              if (((NodeList)localObject3).getLength() <= 0) {
                continue;
              }
              l1 = bg.getLong(((NodeList)localObject3).item(0).getTextContent(), 0L);
              if (l1 != 0L) {
                break label1305;
              }
              l1 = System.currentTimeMillis() / 1000L;
            }
            locala.gpU.add(paramString);
            if ((((Node)localObject2).getNodeType() == 1) && (((Node)localObject2).getNodeName().equals("expinfo"))) {}
            try
            {
              localObject4 = (Element)localObject2;
              paramString = new LinkedList();
              localObject2 = ((Element)localObject4).getAttributes();
              if (localObject2 != null) {
                continue;
              }
              paramString = null;
            }
            catch (Exception paramString)
            {
              Object localObject5;
              long l3;
              long l1;
              w.e("MicroMsg.ABTestParser", paramString.getMessage());
              continue;
              continue;
            }
            locala.gpV.addAll(paramString);
            j += 1;
            break;
            localObject5 = ((NamedNodeMap)localObject4).getNamedItem("layerid");
            if (localObject5 == null)
            {
              paramString = null;
            }
            else
            {
              paramString.field_layerId = ((Node)localObject5).getNodeValue();
              localObject5 = ((NamedNodeMap)localObject4).getNamedItem("id");
              if (localObject5 != null) {
                continue;
              }
              paramString = null;
            }
          }
          paramString.field_expId = ((Node)localObject5).getNodeValue();
          localObject4 = ((NamedNodeMap)localObject4).getNamedItem("business");
          if (localObject4 == null) {}
          for (paramString.field_business = "";; paramString.field_business = ((Node)localObject4).getNodeValue())
          {
            localObject4 = ((Element)localObject3).getElementsByTagName("sequence");
            if (((NodeList)localObject4).getLength() != 0) {
              break label481;
            }
            paramString = null;
            break;
          }
          localObject3 = ((Element)localObject4).getElementsByTagName("endtime");
          if (((NodeList)localObject3).getLength() <= 0) {
            break label1313;
          }
          l2 = bg.getLong(((NodeList)localObject3).item(0).getTextContent(), 0L);
          if (l2 != 0L) {
            break label1302;
          }
          break label1313;
        }
      }
    }
    int k;
    for (;;)
    {
      localObject3 = ((Element)localObject4).getElementsByTagName("noreport");
      if (((NodeList)localObject3).getLength() > 0)
      {
        if (bg.getInt(((NodeList)localObject3).item(0).getTextContent(), 0) != 1) {
          break label1331;
        }
        bool = true;
        break label1321;
      }
      for (;;)
      {
        localObject3 = new HashMap();
        localObject4 = ((Element)localObject4).getElementsByTagName("args");
        label1017:
        Object localObject6;
        if (((NodeList)localObject4).getLength() > 0)
        {
          localObject4 = ((NodeList)localObject4).item(0).getChildNodes();
          k = 0;
          if (k < ((NodeList)localObject4).getLength())
          {
            localObject6 = ((NodeList)localObject4).item(k);
            if ((((Node)localObject6).getNodeType() != 1) || (!((Node)localObject6).getNodeName().equals("arg"))) {
              break;
            }
            localObject5 = ((Element)localObject6).getElementsByTagName("key");
            localObject6 = ((Element)localObject6).getElementsByTagName("value");
            if ((((NodeList)localObject5).getLength() == 0) || (((NodeList)localObject6).getLength() == 0)) {
              break;
            }
            ((HashMap)localObject3).put(((NodeList)localObject5).item(0).getTextContent(), ((NodeList)localObject6).item(0).getTextContent());
            break;
          }
        }
        localObject4 = ((HashMap)localObject3).keySet().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (String)((Iterator)localObject4).next();
          localObject6 = new com.tencent.mm.storage.a();
          ((com.tencent.mm.storage.a)localObject6).field_abtestkey = ((String)localObject5);
          ((com.tencent.mm.storage.a)localObject6).field_value = ((String)((HashMap)localObject3).get(localObject5));
          ((com.tencent.mm.storage.a)localObject6).field_expId = ((String)localObject2);
          ((com.tencent.mm.storage.a)localObject6).field_sequence = l3;
          ((com.tencent.mm.storage.a)localObject6).field_prioritylevel = i;
          ((com.tencent.mm.storage.a)localObject6).field_startTime = l1;
          ((com.tencent.mm.storage.a)localObject6).field_endTime = l2;
          ((com.tencent.mm.storage.a)localObject6).field_noReport = bool;
          paramString.add(localObject6);
        }
        GMTrace.o(637131554816L, 4747);
        return locala;
        bool = false;
      }
      label1302:
      continue;
      label1305:
      break label871;
      i = 1;
      break;
      label1313:
      l2 = Long.MAX_VALUE;
    }
    for (;;)
    {
      label1321:
      break;
      k += 1;
      break label1017;
      label1331:
      bool = false;
    }
  }
  
  public static Map<String, String> hk(String paramString)
  {
    GMTrace.i(637265772544L, 4748);
    HashMap localHashMap = new HashMap();
    Object localObject1 = hl(paramString);
    if (localObject1 == null)
    {
      w.e("MicroMsg.ABTestParser", "Raw XML string parsing failed, xml: %s", new Object[] { paramString });
      GMTrace.o(637265772544L, 4748);
      return localHashMap;
    }
    paramString = ((Element)localObject1).getElementsByTagName("args");
    if (paramString.getLength() > 0)
    {
      paramString = paramString.item(0).getChildNodes();
      int i = 0;
      while (i < paramString.getLength())
      {
        Object localObject2 = paramString.item(i);
        if ((((Node)localObject2).getNodeType() == 1) && (((Node)localObject2).getNodeName().equals("arg")))
        {
          localObject1 = ((Element)localObject2).getElementsByTagName("key");
          localObject2 = ((Element)localObject2).getElementsByTagName("value");
          if ((((NodeList)localObject1).getLength() != 0) && (((NodeList)localObject2).getLength() != 0)) {
            localHashMap.put(((NodeList)localObject1).item(0).getTextContent(), ((NodeList)localObject2).item(0).getTextContent());
          }
        }
        i += 1;
      }
    }
    GMTrace.o(637265772544L, 4748);
    return localHashMap;
  }
  
  private static Element hl(String paramString)
  {
    GMTrace.i(637399990272L, 4749);
    try
    {
      InputSource localInputSource = new InputSource(new ByteArrayInputStream(paramString.getBytes()));
      if (gpT != null) {
        paramString = gpT;
      }
      for (;;)
      {
        paramString = paramString.parse(localInputSource);
        paramString.normalize();
        paramString = paramString.getDocumentElement();
        GMTrace.o(637399990272L, 4749);
        return paramString;
        paramString = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        gpT = paramString;
      }
      return null;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.ABTestParser", paramString.toString());
      GMTrace.o(637399990272L, 4749);
    }
  }
  
  public static final class a
  {
    public List<c> gpU;
    public List<com.tencent.mm.storage.a> gpV;
    
    public a()
    {
      GMTrace.i(637802643456L, 4752);
      this.gpU = new LinkedList();
      this.gpV = new LinkedList();
      GMTrace.o(637802643456L, 4752);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */