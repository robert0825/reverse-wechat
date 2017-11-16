package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
{
  private final LinkedList<String> rHs;
  
  public j()
  {
    GMTrace.i(11987656376320L, 89315);
    this.rHs = new LinkedList();
    GMTrace.o(11987656376320L, 89315);
  }
  
  public final void LD(String paramString)
  {
    GMTrace.i(11987790594048L, 89316);
    try
    {
      if (!bg.nm(paramString)) {
        synchronized (this.rHs)
        {
          String str = (String)this.rHs.peekLast();
          paramString = URLEncoder.encode(paramString);
          if ((str == null) || (!str.equals(paramString))) {
            this.rHs.addLast(paramString);
          }
          if (this.rHs.size() > 10) {
            this.rHs.removeFirst();
          }
          GMTrace.o(11987790594048L, 89316);
          return;
        }
      }
      GMTrace.o(11987790594048L, 89316);
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WebViewURLRouteList", "add exp = %s", new Object[] { bg.f(paramString) });
      GMTrace.o(11987790594048L, 89316);
      return;
    }
  }
  
  public final String[] bDb()
  {
    GMTrace.i(11987924811776L, 89317);
    synchronized (this.rHs)
    {
      String[] arrayOfString = new String[this.rHs.size()];
      Iterator localIterator = this.rHs.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        arrayOfString[i] = ((String)localIterator.next());
        i += 1;
      }
      GMTrace.o(11987924811776L, 89317);
      return arrayOfString;
    }
  }
  
  public final void bDc()
  {
    GMTrace.i(11988059029504L, 89318);
    if (!b.bPq())
    {
      GMTrace.o(11988059029504L, 89318);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("routeList: ");
    synchronized (this.rHs)
    {
      Iterator localIterator = this.rHs.iterator();
      if (localIterator.hasNext()) {
        localStringBuilder.append(URLDecoder.decode((String)localIterator.next())).append("\n");
      }
    }
    w.d("MicroMsg.WebViewURLRouteList", ((StringBuilder)localObject).toString());
    GMTrace.o(11988059029504L, 89318);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */