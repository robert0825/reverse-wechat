package com.tencent.mm.plugin.appbrand.h;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.p.a.b;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.d.d.a;
import com.tencent.mm.plugin.appbrand.p.f.b;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
{
  private String hyD;
  private int isH;
  private final String isK;
  protected final ArrayList<com.tencent.mm.plugin.appbrand.p.a.a> itv;
  private SSLSocketFactory itw;
  
  public j(String paramString1, String paramString2)
  {
    GMTrace.i(19901536272384L, 148278);
    this.itv = new ArrayList();
    this.hyD = paramString1;
    SSLContext localSSLContext = i.rv(paramString1);
    if (localSSLContext != null) {
      this.itw = localSSLContext.getSocketFactory();
    }
    this.isK = paramString2;
    this.isH = com.tencent.mm.plugin.appbrand.a.nK(paramString1).hQU;
    GMTrace.o(19901536272384L, 148278);
  }
  
  private void a(com.tencent.mm.plugin.appbrand.p.a.a parama)
  {
    GMTrace.i(20763750957056L, 154702);
    synchronized (this.itv)
    {
      if ("0".equals(parama.hXm)) {
        this.itv.clear();
      }
      this.itv.add(parama);
      GMTrace.o(20763750957056L, 154702);
      return;
    }
  }
  
  public static void a(com.tencent.mm.plugin.appbrand.p.a.a parama, String paramString)
  {
    GMTrace.i(20764422045696L, 154707);
    com.tencent.mm.plugin.appbrand.p.b.a locala;
    if (parama != null)
    {
      parama = parama.iHD;
      if (paramString == null)
      {
        w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
        GMTrace.o(20764422045696L, 154707);
        return;
      }
      locala = parama.iHt;
      if (parama.iHu != a.b.iHg) {
        break label73;
      }
    }
    label73:
    for (boolean bool = true;; bool = false)
    {
      parama.d(locala.Q(paramString, bool));
      GMTrace.o(20764422045696L, 154707);
      return;
    }
  }
  
  public static void a(com.tencent.mm.plugin.appbrand.p.a.a parama, ByteBuffer paramByteBuffer)
  {
    GMTrace.i(20764556263424L, 154708);
    parama = parama.iHD;
    if (paramByteBuffer == null)
    {
      w.i("MicroMsg.AppBrandNetWork.WebSocketImpl", "Cannot send 'null' data to a WebSocketImpl.");
      GMTrace.o(20764556263424L, 154708);
      return;
    }
    com.tencent.mm.plugin.appbrand.p.b.a locala = parama.iHt;
    if (parama.iHu == a.b.iHg) {}
    for (boolean bool = true;; bool = false)
    {
      parama.d(locala.a(paramByteBuffer, bool));
      GMTrace.o(20764556263424L, 154708);
      return;
    }
  }
  
  public static boolean d(com.tencent.mm.plugin.appbrand.p.a.a parama)
  {
    GMTrace.i(20764287827968L, 154706);
    if (parama != null)
    {
      boolean bool = parama.iHD.isOpen();
      GMTrace.o(20764287827968L, 154706);
      return bool;
    }
    GMTrace.o(20764287827968L, 154706);
    return false;
  }
  
  public static void e(com.tencent.mm.plugin.appbrand.p.a.a parama)
  {
    GMTrace.i(20764690481152L, 154709);
    if (parama == null)
    {
      GMTrace.o(20764690481152L, 154709);
      return;
    }
    aj localaj = parama.iHN;
    w.i("MicroMsg.AppBrandNetworkWebSocket", "try to stop connectTimer");
    if (localaj != null)
    {
      localaj.stopTimer();
      parama.iHN = null;
    }
    GMTrace.o(20764690481152L, 154709);
  }
  
  private static String q(JSONObject paramJSONObject)
  {
    GMTrace.i(17694325735424L, 131833);
    if (paramJSONObject == null)
    {
      GMTrace.o(17694325735424L, 131833);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramJSONObject = paramJSONObject.optJSONArray("protocols");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
    {
      int i = 0;
      while (i < paramJSONObject.length())
      {
        localLinkedList.add(paramJSONObject.optString(i));
        i += 1;
      }
    }
    if (!bg.cc(localLinkedList))
    {
      paramJSONObject = TextUtils.join(", ", localLinkedList);
      GMTrace.o(17694325735424L, 131833);
      return paramJSONObject;
    }
    GMTrace.o(17694325735424L, 131833);
    return null;
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.p.a.a parama, int paramInt, String paramString)
  {
    GMTrace.i(20764153610240L, 154705);
    if (parama != null) {}
    try
    {
      w.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
      if (parama.iHI != null) {
        parama.iHD.c(paramInt, paramString, false);
      }
      b(parama);
      GMTrace.o(20764153610240L, 154705);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandNetworkWebSocket", "send error" + paramString.toString());
      }
    }
  }
  
  public final boolean a(String paramString, int paramInt, final JSONObject paramJSONObject, Map<String, String> paramMap, final a parama)
  {
    GMTrace.i(20763616739328L, 154701);
    for (;;)
    {
      final String str;
      URI localURI;
      long l;
      synchronized (this.itv)
      {
        if (this.itv.size() >= this.isH)
        {
          com.tencent.mm.plugin.appbrand.o.d.xB().h(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(21062653837312L, 156929);
              parama.qF("max connected");
              GMTrace.o(21062653837312L, 156929);
            }
          }, 100L);
          w.i("MicroMsg.AppBrandNetworkWebSocket", "max connected");
          GMTrace.o(20763616739328L, 154701);
          return true;
        }
        str = paramJSONObject.optString("url");
      }
      if (((String)???).equalsIgnoreCase("wss"))
      {
        paramJSONObject = "https";
        label429:
        ??? = new StringBuilder(paramJSONObject);
        ((StringBuilder)???).append("://");
        ((StringBuilder)???).append(localURI.getHost());
        i = localURI.getPort();
        if ((i != -1) && ((!paramJSONObject.equalsIgnoreCase("http")) || (i != 80)) && ((!paramJSONObject.equalsIgnoreCase("https")) || (i != 443))) {
          break label565;
        }
      }
      label565:
      for (int i = 1;; i = 0)
      {
        if (i == 0)
        {
          ((StringBuilder)???).append(":");
          ((StringBuilder)???).append(localURI.getPort());
        }
        paramJSONObject = ((StringBuilder)???).toString();
        break;
        paramJSONObject = (JSONObject)???;
        if (!((String)???).equalsIgnoreCase("ws")) {
          break label429;
        }
        paramJSONObject = "http";
        break label429;
      }
      if (s.eK(str, "wss://"))
      {
        w.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user wss connect", new Object[] { str });
        if (this.itw != null) {}
        for (paramString = this.itw;; paramString = (SSLSocketFactory)SSLSocketFactory.getDefault())
        {
          paramJSONObject.a(paramString.createSocket());
          paramJSONObject.connect();
          a(paramJSONObject);
          paramString = new aj(new aj.a()
          {
            public final boolean pM()
            {
              GMTrace.i(21062922272768L, 156931);
              w.e("MicroMsg.AppBrandNetworkWebSocket", "connect response time out");
              parama.qD("connect response time out");
              paramJSONObject.close();
              j.this.b(paramJSONObject);
              GMTrace.o(21062922272768L, 156931);
              return false;
            }
          }, false);
          paramJSONObject.iHN = paramString;
          l = paramInt;
          paramString.z(l, l);
          bool = true;
          break;
        }
      }
      w.i("MicroMsg.AppBrandNetworkWebSocket", "url error: %s not ws:// or wss://", new Object[] { str });
      parama.qF("url not ws or wss");
      bool = false;
      continue;
      w.e("MicroMsg.AppBrandNetworkWebSocket", "url %s exception %s", new Object[] { str, paramString.toString() });
      parama.qD("");
    }
  }
  
  /* Error */
  public final void b(com.tencent.mm.plugin.appbrand.p.a.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 441
    //   5: ldc_w 443
    //   8: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_1
    //   12: ifnonnull +15 -> 27
    //   15: ldc2_w 441
    //   18: ldc_w 443
    //   21: invokestatic 78	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: aload_0
    //   28: getfield 44	com/tencent/mm/plugin/appbrand/h/j:itv	Ljava/util/ArrayList;
    //   31: astore_2
    //   32: aload_2
    //   33: monitorenter
    //   34: aload_0
    //   35: getfield 44	com/tencent/mm/plugin/appbrand/h/j:itv	Ljava/util/ArrayList;
    //   38: aload_1
    //   39: invokevirtual 446	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   42: pop
    //   43: aload_2
    //   44: monitorexit
    //   45: ldc2_w 441
    //   48: ldc_w 443
    //   51: invokestatic 78	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: goto -30 -> 24
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    //   62: astore_1
    //   63: aload_2
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	j
    //   0	67	1	parama	com.tencent.mm.plugin.appbrand.p.a.a
    // Exception table:
    //   from	to	target	type
    //   2	11	57	finally
    //   15	24	57	finally
    //   27	34	57	finally
    //   45	54	57	finally
    //   65	67	57	finally
    //   34	45	62	finally
    //   63	65	62	finally
  }
  
  public final void c(com.tencent.mm.plugin.appbrand.p.a.a parama)
  {
    GMTrace.i(20764019392512L, 154704);
    if (parama != null) {}
    try
    {
      w.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
      parama.close();
      b(parama);
      GMTrace.o(20764019392512L, 154704);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandNetworkWebSocket", "send error" + localException.toString());
        e(parama);
      }
    }
  }
  
  public final com.tencent.mm.plugin.appbrand.p.a.a ry(String paramString)
  {
    GMTrace.i(20764824698880L, 154710);
    if (paramString == null)
    {
      GMTrace.o(20764824698880L, 154710);
      return null;
    }
    synchronized (this.itv)
    {
      Iterator localIterator = this.itv.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.p.a.a locala = (com.tencent.mm.plugin.appbrand.p.a.a)localIterator.next();
        if (paramString.equals(locala.hXm))
        {
          GMTrace.o(20764824698880L, 154710);
          return locala;
        }
      }
      GMTrace.o(20764824698880L, 154710);
      return null;
    }
  }
  
  public static abstract interface a
  {
    public abstract void Xb();
    
    public abstract void a(ByteBuffer paramByteBuffer);
    
    public abstract void qD(String paramString);
    
    public abstract void qE(String paramString);
    
    public abstract void qF(String paramString);
    
    public abstract void y(int paramInt, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */