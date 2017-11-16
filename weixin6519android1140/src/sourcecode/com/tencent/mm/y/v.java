package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.a.cc;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class v
  implements d
{
  public v()
  {
    GMTrace.i(670417551360L, 4995);
    GMTrace.o(670417551360L, 4995);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(670551769088L, 4996);
    parama = parama.gtM;
    if ((parama == null) || (parama.tPY == null))
    {
      w.f("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension failed, invalid cmdAM");
      GMTrace.o(670551769088L, 4996);
      return null;
    }
    w.i("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension start");
    parama = n.a(parama.tPY);
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      try
      {
        parama = ((DocumentBuilderFactory)localObject).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(parama.getBytes("utf-8"))));
        parama.normalize();
        parama = parama.getDocumentElement().getElementsByTagName("deletepackage");
        if ((parama != null) && (parama.getLength() == 1))
        {
          parama = parama.item(0).getChildNodes();
          int j = parama.getLength();
          i = 0;
          if (i < j)
          {
            localObject = parama.item(i);
            if ((localObject == null) || (((Node)localObject).getNodeName() == null) || (!((Node)localObject).getNodeName().equals("pack"))) {
              break label314;
            }
            localObject = ((Node)localObject).getAttributes();
            if (localObject == null) {
              break label314;
            }
            localObject = ((NamedNodeMap)localObject).getNamedItem("type");
            if (localObject == null) {
              break label314;
            }
            int k = bg.getInt(((Node)localObject).getNodeValue(), 0);
            localObject = new cc();
            ((cc)localObject).eDt.eDu = k;
            a.vgX.m((b)localObject);
            break label314;
          }
        }
        w.i("MicroMsg.DeletePackageMsgExtension", "[oneliang]DeletePackageMsgExtension end");
        GMTrace.o(670551769088L, 4996);
        return null;
      }
      catch (Exception parama)
      {
        w.e("MicroMsg.DeletePackageMsgExtension", "exception:%s", new Object[] { bg.f(parama) });
        GMTrace.o(670551769088L, 4996);
        return null;
      }
      label314:
      i += 1;
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(670685986816L, 4997);
    GMTrace.o(670685986816L, 4997);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */