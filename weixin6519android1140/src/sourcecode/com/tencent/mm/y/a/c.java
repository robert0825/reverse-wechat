package com.tencent.mm.y.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class c
{
  b gpF;
  b gpG;
  
  public c()
  {
    GMTrace.i(690415992832L, 5144);
    this.gpF = null;
    this.gpG = null;
    GMTrace.o(690415992832L, 5144);
  }
  
  public final boolean BW()
  {
    GMTrace.i(690684428288L, 5146);
    if (this.gpF == null)
    {
      GMTrace.o(690684428288L, 5146);
      return false;
    }
    GMTrace.o(690684428288L, 5146);
    return true;
  }
  
  public final e hb(String paramString)
  {
    GMTrace.i(690818646016L, 5147);
    e locale1 = null;
    if (this.gpF != null) {
      locale1 = this.gpF.hb(paramString);
    }
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = locale1;
      if (this.gpG != null) {
        locale2 = this.gpG.hb(paramString);
      }
    }
    GMTrace.o(690818646016L, 5147);
    return locale2;
  }
  
  final void hc(String paramString)
  {
    GMTrace.i(690550210560L, 5145);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.abtest.AbTestManager", "[Abtest] parse xml faild. xml is null.");
      GMTrace.o(690550210560L, 5145);
      return;
    }
    w.i("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML content:%s", new Object[] { paramString });
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      int j;
      Object localObject3;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("testcase");
        if (paramString == null) {
          break label701;
        }
        i = 0;
        if (i >= paramString.getLength()) {
          break label701;
        }
        localObject1 = new b();
        NodeList localNodeList = paramString.item(i).getChildNodes();
        int k = localNodeList.getLength();
        j = 0;
        if (j >= k) {
          break label659;
        }
        localObject3 = localNodeList.item(j);
        if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("testpoint")))
        {
          Object localObject4 = ((Node)localObject3).getAttributes();
          localObject2 = new e();
          if (localObject4 != null)
          {
            Object localObject5 = ((NamedNodeMap)localObject4).getNamedItem("id");
            if (localObject5 != null)
            {
              localObject5 = ((Node)localObject5).getNodeValue();
              w.d("MicroMsg.abtest.AbTestManager", "[Abtest] idValue:%s", new Object[] { localObject5 });
              ((e)localObject2).id = ((String)localObject5);
            }
            localObject4 = ((NamedNodeMap)localObject4).getNamedItem("reportid");
            if (localObject4 != null)
            {
              localObject4 = ((Node)localObject4).getNodeValue();
              w.d("MicroMsg.abtest.AbTestManager", "[Abtest] reportIdValue:%s", new Object[] { localObject4 });
              ((e)localObject2).gpH = ((String)localObject4);
            }
          }
          localObject3 = ((Node)localObject3).getTextContent();
          w.d("MicroMsg.abtest.AbTestManager", "[Abtest] casePointContent:%s", new Object[] { localObject3 });
          ((e)localObject2).value = ((String)localObject3);
          localObject3 = ((e)localObject2).id;
          ((b)localObject1).gpE.put(localObject3, localObject2);
        }
        else if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("verifymd5")))
        {
          localObject2 = ((Node)localObject3).getTextContent();
          w.d("MicroMsg.abtest.AbTestManager", "[Abtest] verifymd5Content:%s", new Object[] { localObject2 });
          ((b)localObject1).gpA = ((String)localObject2);
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.abtest.AbTestManager", "[Abtest] parseXML exception:%s", new Object[] { paramString.toString() });
        GMTrace.o(690550210560L, 5145);
        return;
      }
      if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("testcaseid")))
      {
        localObject2 = ((Node)localObject3).getTextContent();
        w.d("MicroMsg.abtest.AbTestManager", "[Abtest] testcaseidContent:%s", new Object[] { localObject2 });
        ((b)localObject1).gpB = ((String)localObject2);
      }
      else if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("starttime")))
      {
        localObject2 = ((Node)localObject3).getTextContent();
        w.d("MicroMsg.abtest.AbTestManager", "[Abtest] starttimeContent:%s", new Object[] { localObject2 });
        ((b)localObject1).gpC = ((String)localObject2);
      }
      else if ((localObject3 != null) && (((Node)localObject3).getNodeName() != null) && (((Node)localObject3).getNodeName().equals("endtime")))
      {
        localObject2 = ((Node)localObject3).getTextContent();
        w.d("MicroMsg.abtest.AbTestManager", "[Abtest] endtimeContent:%s", new Object[] { localObject2 });
        ((b)localObject1).gpD = ((String)localObject2);
        break label711;
        label659:
        if ((!bg.nm(((b)localObject1).gpB)) && ("0".equals(((b)localObject1).gpB)))
        {
          this.gpG = ((b)localObject1);
          break label718;
        }
        this.gpF = ((b)localObject1);
        break label718;
        label701:
        GMTrace.o(690550210560L, 5145);
        return;
      }
      label711:
      j += 1;
      continue;
      label718:
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */