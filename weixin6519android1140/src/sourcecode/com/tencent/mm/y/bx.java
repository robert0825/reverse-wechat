package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.bu;
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

public final class bx
  implements d
{
  public bx()
  {
    GMTrace.i(600624332800L, 4475);
    GMTrace.o(600624332800L, 4475);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(600758550528L, 4476);
    parama = parama.gtM;
    if ((parama == null) || (parama.tPY == null))
    {
      w.f("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension failed, invalid cmdAM");
      GMTrace.o(600758550528L, 4476);
      return null;
    }
    w.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension start");
    parama = com.tencent.mm.platformtools.n.a(parama.tPY);
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      try
      {
        parama = ((DocumentBuilderFactory)localObject).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(parama.getBytes("utf-8"))));
        parama.normalize();
        parama = parama.getDocumentElement().getElementsByTagName("updatepackage");
        if ((parama != null) && (parama.getLength() == 1))
        {
          parama = parama.item(0).getChildNodes();
          int j = parama.getLength();
          i = 0;
          if (i < j)
          {
            localObject = parama.item(i);
            if ((localObject == null) || (((Node)localObject).getNodeName() == null) || (!((Node)localObject).getNodeName().equals("pack"))) {
              break label306;
            }
            localObject = ((Node)localObject).getAttributes();
            if (localObject == null) {
              break label306;
            }
            localObject = ((NamedNodeMap)localObject).getNamedItem("type");
            if (localObject == null) {
              break label306;
            }
            localObject = new com.tencent.mm.aw.k(bg.getInt(((Node)localObject).getNodeValue(), 0));
            h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
            break label306;
          }
        }
        w.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension end");
        GMTrace.o(600758550528L, 4476);
        return null;
      }
      catch (Exception parama)
      {
        w.e("MicroMsg.UpdatePackageMsgExtension", "exception:%s", new Object[] { bg.f(parama) });
        GMTrace.o(600758550528L, 4476);
        return null;
      }
      label306:
      i += 1;
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(600892768256L, 4477);
    GMTrace.o(600892768256L, 4477);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */