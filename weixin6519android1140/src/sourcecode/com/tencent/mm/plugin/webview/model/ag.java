package com.tencent.mm.plugin.webview.model;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.modelcache.o.a;
import com.tencent.mm.plugin.webview.modelcache.p;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ag
{
  private int rEF;
  public ArrayList<String> rEG;
  public ArrayList<String> rEH;
  public List<Integer> rEI;
  public final Map<String, Boolean> rEJ;
  public final Set<String> rEK;
  
  public ag()
  {
    GMTrace.i(12007520600064L, 89463);
    this.rEF = -1;
    this.rEI = new ArrayList();
    this.rEJ = new HashMap();
    this.rEK = new HashSet();
    this.rEG = new ArrayList();
    this.rEH = new ArrayList();
    GMTrace.o(12007520600064L, 89463);
  }
  
  private boolean b(String paramString, d paramd)
  {
    GMTrace.i(12007789035520L, 89465);
    Iterator localIterator;
    if (this.rEF == -1) {
      try
      {
        paramd = paramd.d(31, null);
        if (paramd != null)
        {
          this.rEF = paramd.getInt("webview_ad_intercept_control_flag");
          this.rEG = paramd.getStringArrayList("webview_ad_intercept_whitelist_domins");
          this.rEH = paramd.getStringArrayList("webview_ad_intercept_blacklist_domins");
          paramd = new StringBuilder();
          paramd.append("white domain list :\n");
          localIterator = this.rEG.iterator();
          while (localIterator.hasNext()) {
            paramd.append((String)localIterator.next()).append("\n");
          }
        }
        if (this.rEF != 0) {
          break label219;
        }
      }
      catch (Exception paramd)
      {
        w.e("MicroMsg.WebViewResourceInterrupter", "get ad domain failed : %s", new Object[] { paramd.getMessage() });
        this.rEF = 0;
      }
    }
    for (;;)
    {
      GMTrace.o(12007789035520L, 89465);
      return false;
      paramd.append("black list domain list : \n");
      localIterator = this.rEH.iterator();
      while (localIterator.hasNext()) {
        paramd.append((String)localIterator.next()).append("\n");
      }
      w.i("MicroMsg.WebViewResourceInterrupter", paramd.toString());
    }
    label219:
    paramd = Uri.parse(paramString).getHost();
    w.d("MicroMsg.WebViewResourceInterrupter", "check has verified this domain : %s, is in black list = %b", new Object[] { paramd, this.rEJ.get(paramd) });
    if (bg.nm(paramd))
    {
      GMTrace.o(12007789035520L, 89465);
      return false;
    }
    if (this.rEJ.containsKey(paramd))
    {
      boolean bool = ((Boolean)this.rEJ.get(paramd)).booleanValue();
      GMTrace.o(12007789035520L, 89465);
      return bool;
    }
    if ((this.rEG != null) && (this.rEG.size() > 0))
    {
      localIterator = this.rEG.iterator();
      while (localIterator.hasNext()) {
        if (paramd.contains((String)localIterator.next()))
        {
          this.rEJ.put(paramd, Boolean.valueOf(false));
          w.i("MicroMsg.WebViewResourceInterrupter", "white list, ignore check the url");
          GMTrace.o(12007789035520L, 89465);
          return false;
        }
      }
    }
    if ((this.rEH != null) && (this.rEH.size() > 0))
    {
      localIterator = this.rEH.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((!bg.nm(str)) && (paramd.contains(str)))
        {
          if (this.rEF == 1)
          {
            this.rEJ.put(paramd, Boolean.valueOf(true));
            w.e("MicroMsg.WebViewResourceInterrupter", "black list, should stop the request, domain = %s, url = %s", new Object[] { str, paramString });
            GMTrace.o(12007789035520L, 89465);
            return true;
          }
          if (this.rEF == 2)
          {
            w.i("MicroMsg.WebViewResourceInterrupter", "black list, just get html content and report, domain = %s, url = %s", new Object[] { str, paramString });
            this.rEK.add(paramd);
            this.rEJ.put(paramd, Boolean.valueOf(false));
            GMTrace.o(12007789035520L, 89465);
            return false;
          }
        }
      }
    }
    this.rEJ.put(paramd, Boolean.valueOf(false));
    GMTrace.o(12007789035520L, 89465);
    return false;
  }
  
  public final k a(String paramString1, String paramString2, boolean paramBoolean, d paramd, int paramInt)
  {
    GMTrace.i(19477945122816L, 145122);
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.WebViewResourceInterrupter", "url is null, return ");
      GMTrace.o(19477945122816L, 145122);
      return null;
    }
    if ((!bg.nm(paramString2)) && (paramString2.startsWith("weixin://resourceid/")))
    {
      w.i("MicroMsg.WebViewResourceInterrupter", "it is wechat resource is, should intercept");
      try
      {
        paramString1 = new k("image/*", "utf-8", ai.Lq(paramd.cj(paramString2, 1)));
        GMTrace.o(19477945122816L, 145122);
        return paramString1;
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.WebViewResourceInterrupter", "get webview jssdk resource failed %s", new Object[] { paramString1.getMessage() });
        GMTrace.o(19477945122816L, 145122);
        return null;
      }
    }
    if (paramBoolean)
    {
      if ((bg.nm(paramString2)) || (!p.sA(paramString2))) {
        paramInt = 0;
      }
      while (paramInt != 0)
      {
        w.f("MicroMsg.WebViewResourceInterrupter", "local url, interrupt request : %s", new Object[] { paramString2 });
        paramString1 = new k("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
        GMTrace.o(19477945122816L, 145122);
        return paramString1;
        String str = paramString2.toLowerCase();
        Iterator localIterator;
        if ((str.contains("localhost")) || (str.contains("127.0.0.1")) || (str.contains("::1")) || (str.contains(s.bNx())))
        {
          if ((this.rEI != null) && (this.rEI.size() > 0)) {
            localIterator = this.rEI.iterator();
          }
        }
        else {
          for (;;)
          {
            if (localIterator.hasNext())
            {
              paramInt = ((Integer)localIterator.next()).intValue();
              if ((str.contains("localhost:" + paramInt)) || (str.contains("127.0.0.1:" + paramInt)))
              {
                w.i("MicroMsg.WebViewResourceInterrupter", "int white list : %s, port = %d", new Object[] { str, Integer.valueOf(paramInt) });
                paramInt = 0;
                break;
              }
            }
          }
        }
        w.e("MicroMsg.WebViewResourceInterrupter", "not allowed to load local url : %s", new Object[] { str });
        paramInt = 1;
      }
    }
    if (b(paramString2, paramd))
    {
      w.e("MicroMsg.WebViewResourceInterrupter", "this is a ad request, interrupt request : %s", new Object[] { paramString2 });
      paramString1 = new k("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
      GMTrace.o(19477945122816L, 145122);
      return paramString1;
    }
    if (bg.nm(paramString1)) {
      w.e("MicroMsg.WebViewResourceInterrupter", "tryInterceptWebViewCacheResource, mainDocumentURL is null or nil, let webview itself do the loading, requestURL = %s", new Object[] { paramString2 });
    }
    for (;;)
    {
      GMTrace.o(19477945122816L, 145122);
      return null;
      if (paramd == null)
      {
        w.e("MicroMsg.WebViewResourceInterrupter", "tryInterceptWebViewCacheResource, invoker is null, let webview itself do the loading");
      }
      else
      {
        w.i("MicroMsg.WebViewResourceInterrupter", "tryInterceptWebViewCacheResource, currentURL = %s, requestURL = %s", new Object[] { paramString1, paramString2 });
        if ((bg.nm(paramString1)) || (bg.nm(paramString2))) {
          w.i("MicroMsg.WebViewResourceInterrupter", "requestURL or mainDocumentURL is invalid");
        } else {
          paramString1 = o.a.rFX;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */