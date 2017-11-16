package com.tencent.mm.plugin.webview.modeltools;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  public static final String rGu;
  
  static
  {
    GMTrace.i(11983764062208L, 89286);
    rGu = Integer.toString(100028);
    GMTrace.o(11983764062208L, 89286);
  }
  
  private static void a(String paramString, List<String> paramList, com.tencent.xweb.b paramb)
  {
    GMTrace.i(19380905705472L, 144399);
    if (!bg.cc(paramList))
    {
      String str = Uri.parse(paramString).getHost();
      Object localObject = str.split("\\.");
      if (localObject.length <= 1) {}
      for (localObject = "";; localObject = localObject[(localObject.length - 2)] + "." + localObject[(localObject.length - 1)])
      {
        w.d("MicroMsg.WebView.CookiesCleanup", "host(%s)", new Object[] { str });
        w.d("MicroMsg.WebView.CookiesCleanup", "domain(%s)", new Object[] { localObject });
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          str = (String)paramList.next();
          if (!bg.nm(str))
          {
            paramb.setCookie(paramString, str + "=");
            paramb.setCookie(paramString, str + "=;path=/");
            if (!bg.nm((String)localObject)) {
              paramb.setCookie((String)localObject, str + "=;domain=." + (String)localObject + ";path=/");
            }
          }
        }
      }
    }
    GMTrace.o(19380905705472L, 144399);
  }
  
  private static void bT(List<String> paramList)
  {
    GMTrace.i(11983495626752L, 89284);
    com.tencent.xweb.b localb = com.tencent.xweb.b.crS();
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      w.i("MicroMsg.WebView.CookiesCleanup", "cookies cleanup: url(%s)", new Object[] { str1 });
      paramList = localb.getCookie(str1);
      if (bg.nm(paramList)) {
        paramList = null;
      }
      for (;;)
      {
        a(str1, paramList, localb);
        break;
        paramList = paramList.split(";");
        int j = paramList.length;
        int i = 0;
        while (i < j)
        {
          paramList[i] = paramList[i].trim();
          i += 1;
        }
        LinkedList localLinkedList = new LinkedList();
        j = paramList.length;
        i = 0;
        while (i < j)
        {
          String str2 = paramList[i];
          if ((!bg.nm(str2)) && (str2.contains("="))) {
            localLinkedList.add(str2.split("=")[0]);
          }
          i += 1;
        }
        paramList = localLinkedList;
        if (localLinkedList.isEmpty()) {
          paramList = null;
        }
      }
    }
    GMTrace.o(11983495626752L, 89284);
  }
  
  public static void c(d paramd)
  {
    GMTrace.i(11983361409024L, 89283);
    try
    {
      paramd = paramd.d(24, new Bundle(0));
      if (paramd == null)
      {
        w.i("MicroMsg.WebView.CookiesCleanup", "bundle is null, skip cookies cleanup");
        GMTrace.o(11983361409024L, 89283);
        return;
      }
    }
    catch (RemoteException paramd)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WebView.CookiesCleanup", paramd, "", new Object[0]);
        paramd = null;
      }
      paramd = paramd.getStringArrayList("cookies_cleanup_url_list");
      if (bg.cc(paramd))
      {
        w.i("MicroMsg.WebView.CookiesCleanup", "url list is empty, skip cookies cleanup");
        GMTrace.o(11983361409024L, 89283);
        return;
      }
      bT(paramd);
      c.io(ab.getContext());
      c.sync();
      w.i("MicroMsg.WebView.CookiesCleanup", "cleanup cookies end");
      GMTrace.o(11983361409024L, 89283);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */